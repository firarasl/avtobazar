package az.autobazar.notification;

import java.io.Serializable;

public class NotificationDto implements Serializable {

    private static final long serialVersionUID = 7593053548270101581L;

    private long autoId;
    private String message;

    public NotificationDto() {
        this.autoId = 0;
        this.message = "";
    }

    @Override
    public String toString() {
        return "NotificationDto{" +
                "autoId=" + autoId +
                ", message='" + message + '\'' +
                '}';
    }

    public long getAutoId() {
        return autoId;
    }

    public void setAutoId(long autoId) {
        this.autoId = autoId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
