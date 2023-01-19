package az.autobazar.domain;

public class Series extends AutoBazarBase {
    private String name;
    private Brand brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Series{" +
                "name='" + name + '\'' +
                ", brand=" + brand +
                '}';
    }
}
