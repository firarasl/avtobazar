package az.autobazar.repository.rowmapper;

import az.autobazar.domain.User;
import az.autobazar.domain.UserStatus;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UsersRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {

        User user= new User();

        user.setId(resultSet.getLong("id"));
        user.setName(resultSet.getString("name"));
        user.setSurname(resultSet.getString("surname"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setMobile1(resultSet.getString("mobile1"));
        user.setMobile2(resultSet.getString("mobile2"));
        user.setStatus(resultSet.getInt("status"));
        user.setUserStatus(UserStatus.from(resultSet.getInt("user_status")));
        user.setRegistrationDate(resultSet.getTimestamp("registration_date").toLocalDateTime());



        /*"  password, mobile1, mobile2, " +
            "   registration_date, activation_date, user_status " +
            "from user " +
            "where email = ? and status = 1"*/
        return user;
    }
}
