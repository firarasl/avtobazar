package az.autobazar.domain;

public class City extends AutoBazarBase {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                ", status=" + status +
                '}';
    }
}
