package az.autobazar.domain;

public class LightType extends AutoBazarBase {
    private String name;

    public LightType(String name) {
        this.name = name;
    }

    public LightType() {
    }

    @Override
    public String toString() {
        return "LightType{" +
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
