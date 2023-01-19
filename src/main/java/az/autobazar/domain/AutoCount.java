package az.autobazar.domain;



public class AutoCount {

    private int pending;
    private int approved;
    private int istifadeciler;

    public int getIstifadeciler() {
        return istifadeciler;
    }

    public void setIstifadeciler(int istifadeciler) {
        this.istifadeciler = istifadeciler;
    }

    public int getPending() {
        return pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getApproved() {
        return approved;
    }

    public void setApproved(int approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "AutoCount{" +
                "pending=" + pending +
                ", approved=" + approved +
                '}';
    }
}
