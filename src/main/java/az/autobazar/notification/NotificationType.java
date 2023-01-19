package az.autobazar.notification;

import java.util.Arrays;

public enum NotificationType {
    EMAIL(0), SMS(1);

    NotificationType(int type) {
        this.type = type;
    }

    int type;

    public int getType() {
        return type;
    }

    public static NotificationType from(int t) {
        return Arrays.stream(values())
                .filter(f -> f.type == t)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid notification type " + t));
    }
}
