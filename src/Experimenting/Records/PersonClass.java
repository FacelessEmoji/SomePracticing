package Experimenting.Records;

import java.util.Objects;

public class PersonClass {
    private String name;
    private Integer age;
    private Integer salary;
    private Boolean isDead;

    public PersonClass(String name, Integer age, Integer salary, Boolean isDead) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.isDead = isDead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Boolean getDead() {
        return isDead;
    }

    public void setDead(Boolean dead) {
        isDead = dead;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonClass)) return false;
        PersonClass that = (PersonClass) o;
        return getName().equals(that.getName()) && getAge().equals(that.getAge()) && getSalary().equals(that.getSalary()) && isDead.equals(that.isDead);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getSalary(), isDead);
    }

    @Override
    public String toString() {
        return "PersonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", isDead=" + isDead +
                '}';
    }
}
