package Experimenting.Records;

public record PersonRecord(String name, Integer age, Integer salary, Boolean isDead) {

    public void hey(){
        System.out.println("Hey");
    }

    public PersonRecord(String name, Integer age, Integer salary, Boolean isDead) {
        this.name = name;
        this.age = 18;
        this.salary = salary;
        this.isDead = isDead;
    }

}
