package az.autobazar.domain;

public class GearType extends AutoBazarBase {
    private String name;

    public GearType() {
    }

    public GearType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GearType{" +
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
