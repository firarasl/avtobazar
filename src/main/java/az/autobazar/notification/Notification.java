package az.autobazar.notification;

import az.autobazar.domain.AutoBazarBase;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Notification extends AutoBazarBase implements Serializable {

    private String from;
    private String to;
    private String subject;
    private String content;
    private NotificationType type;
    private NotificationStatus notificationStatus;
    private String source;
    private String logData;



    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public LocalDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLogData() {
        return logData;
    }

    public void setLogData(String logData) {
        this.logData = logData;
    }

    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(NotificationStatus notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return id == that.id &&
                from.equals(that.from) &&
                to.equals(that.to) &&
                subject.equals(that.subject) &&
                content.equals(that.content) &&
                type == that.type &&
                notificationStatus == that.notificationStatus &&
                source.equals(that.source) &&
                logData.equals(that.logData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, subject, content, type, notificationStatus, source, logData);
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", notificationStatus=" + notificationStatus +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", type=" + type +
                ", source='" + source + '\'' +
                ", logData='" + logData + '\'' +
                ", id=" + id +
                ", status=" + status +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }


}
