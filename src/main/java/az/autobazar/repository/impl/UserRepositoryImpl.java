package az.autobazar.repository.impl;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;
import az.autobazar.notification.EmailTemplate;
import az.autobazar.notification.Notification;
import az.autobazar.notification.NotificationType;
import az.autobazar.repository.NotificationRepository;
import az.autobazar.repository.SqlQuery;
import az.autobazar.repository.UserRepository;
import az.autobazar.repository.rowmapper.RoleRowMapper;
import az.autobazar.repository.rowmapper.UsersRowMapper;
import az.autobazar.util.SecurityUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static az.autobazar.repository.SqlQuery.GET_USER_BY_EMAIL;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private static final Logger logger = Logger.getLogger(UserRepositoryImpl.class.getName());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private UsersRowMapper usersRowMapper;

    @Autowired
    private RoleRowMapper roleRowMapper;

    @Transactional
    @Override
    public void addUser(User user) {
        // 4.register user
        // 4.1.insert into user
        // 4.2.insert into user role
        // 4.3.generate token and insert token
        // 4.4.send activation email

        try {
            boolean success = true;
            KeyHolder keyHolder = new GeneratedKeyHolder();

//            4.1.insert into user
            int count = jdbcTemplate.update(con -> {
                PreparedStatement ps = con.prepareStatement(SqlQuery.ADD_USER, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, user.getName());
                ps.setString(2, user.getSurname());
                ps.setString(3, user.getEmail());
                ps.setString(4, user.getPassword());
                if (user.getMobile1() != null) {
                    ps.setString(5, user.getMobile1());
                } else {
                    ps.setNull(5, Types.VARCHAR);
                }
                return ps;
            }, keyHolder);

            // extract new id from keyholder
            user.setId(keyHolder.getKey().longValue());

            // 4.2.insert into user role
            if (count == 1) {
                // ADD_USER_ROLE = "insert into user_role(user_id, role_id) values(?, ?)";
                Object[] args = new Object[]{user.getId(), Role.AUTOBAZAR_USER};
                count = jdbcTemplate.update(SqlQuery.ADD_USER_ROLE, args);

                if (count == 1) {
                    // 4.3.generate token and insert token
                    // todo refactor 0 activation token to config file
                    // todo refactor 3 token expire days to config file
                    String token = SecurityUtil.generateToken();
                    args = new Object[]{token, 0, user.getId(), LocalDateTime.now(), LocalDateTime.now().plusDays(3)};
                    // ADD_TOKEN = "insert into token(value, type, user_id, generation_time, expire_time) " +
                    //            "values(?, ?, ?, ?, ?)";
                    count = jdbcTemplate.update(SqlQuery.ADD_TOKEN, args);

                    if (count == 1) {
                        // 4.4.send activation email

                        String activationLink = "http://localhost:8080/activate?token=" + token;
                        String registrationEmail = String.format(EmailTemplate.REGISTRATION_TEMPLATE, user.getName(), user.getSurname(), activationLink);
                        System.out.println("subject = " + EmailTemplate.REGISTRATION_SUBJECT);
                        System.out.println("reg mail body = " + registrationEmail);

                        Notification emailNotification = new Notification();
                        // todo move to config
                        emailNotification.setFrom("info@autobazar.az");
                        emailNotification.setTo(user.getEmail());
                        emailNotification.setType(NotificationType.EMAIL);
                        emailNotification.setSubject(EmailTemplate.REGISTRATION_SUBJECT);
                        emailNotification.setContent(registrationEmail);
                        emailNotification.setSource("Registration");

                        notificationRepository.add(emailNotification);

                    } else {
                        success = false;
                    }

                } else {
                    success = false;
                }
            } else {
                success = false;
            }


        } catch (Exception e) {
            logger.error("Error occurred registration for user = " + user, e);
            throw new RuntimeException("Error occurred registration for user = " + user, e);
        }
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        Optional<User> optionalUser = Optional.empty();
        Object[] args = {email};
        List<User> users = jdbcTemplate.query(GET_USER_BY_EMAIL, args, usersRowMapper);
        if(users != null && !users.isEmpty()) {
            optionalUser = Optional.of(users.get(0));
        }
        return optionalUser;
    }

    @Override
    public List<Role> getUserRoles(long userId) {

        Object []args = {userId};

        return jdbcTemplate.query(SqlQuery.GET_USER_ROLES,args, roleRowMapper);
    }
}
