package az.autobazar.repository.impl;

import az.autobazar.domain.User;
import az.autobazar.notification.*;
import az.autobazar.repository.NotificationRepository;
import az.autobazar.repository.SqlQuery;
import az.autobazar.repository.rowmapper.UsersRowMapper;
import az.autobazar.repository.rowmapper.UsersRowMapperOptional;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class NotificationRepositoryImpl implements NotificationRepository {

    private static final Logger logger = Logger.getLogger(NotificationRepositoryImpl.class.getName());


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    UsersRowMapperOptional usersRowMapperOptional;

    private NotificationRowMapper notificationRowMapper = new NotificationRowMapper();

    @Transactional
    @Override
    public void add(Notification notification) {

        Object[] args = {notification.getFrom(), notification.getTo(), notification.getType().getType(), notification.getContent(), notification.getSubject(), notification.getSource()};

        int count = jdbcTemplate.update(SqlQuery.ADD_NOTIFICATION, args);
        logger.info("added notification " + notification + " count " + count);


    }

    @Override
    public List<Notification> getPendingNotifications(NotificationType notificationType, int limit) {
        Object[] args = new Object[]{notificationType.getType(), limit};
        return jdbcTemplate.query(SqlQuery.GET_PENDING_NOTIFICATIONS, args, notificationRowMapper);
    }

    @Override
    public void updateNotification(Notification notification) {
        Object[] args = new Object[]{notification.getNotificationStatus().getStatus(), notification.getLogData(), notification.getId()};
        int count = jdbcTemplate.update(SqlQuery.UPDATE_NOTIFICATION, args);
        logger.info("update notification count " + count);
    }

    @Override
    public Optional<Notification> getNotificationById(long id) {
        Optional<Notification> optionalNotification = Optional.empty();

        Object[] args = new Object[]{id};
        List<Notification> list = jdbcTemplate.query(SqlQuery.GET_NOTIFICATION_BY_ID, args, notificationRowMapper);
        if (!list.isEmpty()) {
            optionalNotification = Optional.of(list.get(0));
        }
        return optionalNotification;
    }

    private class NotificationRowMapper implements RowMapper<Notification> {

        @Override
        public Notification mapRow(ResultSet rs, int rowNum) throws SQLException {
            Notification notification = new Notification();


            notification.setId(rs.getLong("id"));
            notification.setFrom(rs.getString("from"));
            notification.setTo(rs.getString("to"));
            notification.setType(NotificationType.from(rs.getInt("type")));
            notification.setContent(rs.getString("content"));
            notification.setSubject(rs.getString("subject"));
            notification.setSource(rs.getString("source_system"));
            notification.setNotificationStatus(NotificationStatus.from(rs.getInt("process_status")));
            notification.setLogData(rs.getString("log_data"));
            notification.setInsertDate(rs.getTimestamp("idate").toLocalDateTime());

            if (rs.getTimestamp("udate") != null) {
                notification.setLastUpdate(rs.getTimestamp("udate").toLocalDateTime());
            }

            return notification;
        }
    }


}
