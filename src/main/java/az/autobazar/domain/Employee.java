package az.autobazar.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Random;

public class Employee implements Serializable, InitializingBean, DisposableBean {
    private static final long serialVersionUID = 7328575750986090992L;
    private long id;
    private String name;
    private String surname;
    private BigDecimal salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    private Department department;

    public Employee() {
//        this.id = 0;
        this.id = new Random().nextInt(100);
        this.name = "";
        this.surname = "";
        this.salary = BigDecimal.ZERO;
        this.department = null;
        System.out.println("Employee() constructor isledi id = " + id);
    }

    public void isciniHazirla() {
        System.out.println("iscini hazirlayan metod isledi");
    }

    public Employee(long id, String name, String surname, BigDecimal salary, Department department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        System.out.println("Employee(N) constructor isledi");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                name.equals(employee.name) &&
                surname.equals(employee.surname) &&
                salary.equals(employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, salary);
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initialize bean propertyler hazirdi, elave metod isledi");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("isci obyekti destroy olur, xeberin olsun");
    }
}
