package az.autobazar.domain;

public class ParkingSensor extends AutoBazarBase {
    private String name;

    public ParkingSensor(String name) {
        this.name = name;
    }

    public ParkingSensor() {
    }

    @Override
    public String toString() {
        return "ParkingSensor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", status=" + status +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
