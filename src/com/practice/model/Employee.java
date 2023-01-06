package src.com.practice.model;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String gender;

    private String department;
    private String city;

    public Employee(int id, String name, String gender, String deparment, double salary, String city) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.salary = salary;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary + '\'' +
                ", city=" + city +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getId() == employee.getId() && Double.compare(employee.getSalary(), getSalary()) == 0 && Objects.equals(getName(), employee.getName()) && Objects.equals(getGender(), employee.getGender()) && Objects.equals(getDepartment(), employee.getDepartment()) && Objects.equals(getCity(), employee.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSalary(), getGender(), getDepartment(), getCity());
    }
}
