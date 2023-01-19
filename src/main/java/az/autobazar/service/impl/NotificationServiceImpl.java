package az.autobazar.service.impl;

import az.autobazar.notification.Notification;
import az.autobazar.notification.NotificationType;
import az.autobazar.repository.NotificationRepository;
import az.autobazar.service.NotificationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationService {

    private static final Logger logger = Logger.getLogger(NotificationServiceImpl.class.getName());


    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public void add(Notification notification) {
        notificationRepository.add(notification);
    }

    @Override
    public List<Notification> getPendingNotifications(NotificationType notificationType, int limit) {
        return notificationRepository.getPendingNotifications(notificationType, limit);
    }

    @Override
    public void updateNotification(Notification notification) {
        notificationRepository.updateNotification(notification);
    }

    @Override
    public Optional<Notification> getNotificationById(long id) {
        return notificationRepository.getNotificationById(id);
    }
}
