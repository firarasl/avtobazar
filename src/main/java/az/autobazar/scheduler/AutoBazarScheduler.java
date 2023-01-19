package az.autobazar.scheduler;

import az.autobazar.notification.NotificationStatus;
import az.autobazar.notification.NotificationType;
import az.autobazar.notification.Notification;
import az.autobazar.service.EmailService;
import az.autobazar.service.NotificationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutoBazarScheduler {

    private static final Logger logger = Logger.getLogger(AutoBazarScheduler.class.getName());


    @Autowired
    private NotificationService notificationService;

    @Autowired
    private EmailService emailService;

    //@Scheduled(fixedRate = 100000)
    public void processNotificationQueue() {
        System.out.println("process notification queue");

        // todo move limit to config
        List<Notification> pendingEmailNotifications = notificationService.getPendingNotifications(NotificationType.EMAIL, 10);
        logger.info("number of pending email notifications = " + pendingEmailNotifications.size());

        for(Notification notification : pendingEmailNotifications) {
            processEmailNotification(notification);
        }
//        pendingEmailNotifications.forEach(notification -> processEmailNotification(notification));

    }

    public void processEmailNotification(Notification notification) {

        notification.setNotificationStatus(NotificationStatus.IN_PROGRESS);
        notificationService.updateNotification(notification);

        try {
            emailService.sendEmail(notification.getFrom(), notification.getTo(), notification.getSubject(), notification.getContent());
            notification.setNotificationStatus(NotificationStatus.SUCCESS);
            logger.info("sent email notification id " + notification.getId() + " success");
        } catch (Exception e) {
            logger.error("Error sending email notification id " + notification.getId());
            notification.setNotificationStatus(NotificationStatus.ERROR);
            notification.setLogData(e.getMessage());
        }

        notificationService.updateNotification(notification);
    }
}
