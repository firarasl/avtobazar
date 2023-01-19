package az.autobazar.domain;

public class Model extends AutoBazarBase  {

    private String name;
    private Series series;
    private Brand brand;



    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Model() {
        this.brand = new Brand();
    }

    public Model(String name) {
        this.name = name;
        this.brand = new Brand();
    }

    public Model(String name, Series series) {
        this.name = name;
        this.series = series;
        this.brand = new Brand();
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", series=" + series +
                '}';
    }
}