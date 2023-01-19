package az.autobazar.domain;

public class FuelType extends AutoBazarBase {
    private  String name;

    public FuelType(String name) {
        this.name = name;
    }

    public FuelType() {
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "name='" + name + '\'' +
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
