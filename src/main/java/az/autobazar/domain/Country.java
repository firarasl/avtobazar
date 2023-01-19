package az.autobazar.domain;

public class Country extends AutoBazarBase {
    private String name;

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
