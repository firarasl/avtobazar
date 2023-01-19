package az.autobazar.domain;

public class Currency extends AutoBazarBase {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency(String name) {
        this.name = name;
    }

    public Currency() {
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", status=" + status +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
