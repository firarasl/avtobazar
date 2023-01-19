package az.autobazar.domain;

public class EuroClass extends AutoBazarBase {
    private String name;

    public EuroClass(String name) {
        this.name = name;
    }

    public EuroClass() {
    }

    @Override
    public String toString() {
        return "EuroClass{" +
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
