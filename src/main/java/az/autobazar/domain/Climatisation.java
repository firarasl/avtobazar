package az.autobazar.domain;

public class Climatisation extends AutoBazarBase  {
    private String name;

    public Climatisation(String name) {
        this.name = name;
    }

    public Climatisation() {
    }

    @Override
    public String toString() {
        return "Climatisation{" +
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
