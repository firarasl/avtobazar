package az.autobazar.domain;

public class Brand extends AutoBazarBase {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", insertDate=" + insertDate +
                ", lastUpdate=" + lastUpdate +
                ", status=" + status +
                '}';
    }
}