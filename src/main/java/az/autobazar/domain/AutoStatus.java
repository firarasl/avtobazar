package az.autobazar.domain;

import java.util.Arrays;

public enum AutoStatus {
    PENDING(0), APPROVED(1), SOLD(2), CANCELLED(3);

    private int status;

    AutoStatus(int status) {
        this.status = status;
    }

    public static AutoStatus from(int status) {
        AutoStatus autoStatus = null;

        autoStatus = Arrays.stream(values())
                .filter(f -> f.status == status)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown auto status " + status));
        return autoStatus;
    }
}
