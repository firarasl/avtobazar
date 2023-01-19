package az.autobazar.domain;

public enum TokenType {
    ACTIVATION_EMAIL(0),
    ACTIVATION_SMS(1),
    RESET_PASSWORD_EMAIL(2),
    RESET_PASSWORD_SMS(3);
    // 0-activation email, 1-activation sms, 2-reset password email, 3-reset password sms

    int type;

    TokenType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
