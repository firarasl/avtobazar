package az.autobazar.domain;

public class InteriorMaterial extends AutoBazarBase {
    private String name;

    public InteriorMaterial(String name) {
        this.name = name;
    }

    public InteriorMaterial() {
    }

    @Override
    public String toString() {
        return "InteriorMaterial{" +
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
