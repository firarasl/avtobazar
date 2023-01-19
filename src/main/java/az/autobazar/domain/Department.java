package az.autobazar.domain;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
    private static final long serialVersionUID = -2530009193154515673L;

    private long id;
    private String name;

    public Department() {
        this.id = 0;
        this.name = "";
        System.out.println("Department() constructor isledi");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
