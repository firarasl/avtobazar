package az.autobazar.service;

import az.autobazar.notification.Notification;
import az.autobazar.notification.NotificationType;

import java.util.List;
import java.util.Optional;

public interface NotificationService {

    void add(Notification notification);

    List<Notification> getPendingNotifications(NotificationType notificationType, int limit);

    void updateNotification(Notification notification);

    Optional<Notification> getNotificationById(long id);

}
