package Experimenting.Records;

public class Main {
    public static void main(String[] args) {
        PersonClass personClass = new PersonClass("Gleb",18,-10000,true );
        PersonRecord personRecord = new PersonRecord("Gleb",18,-10000,true );

        System.out.println(personClass);
        System.out.println(personRecord);

        System.out.println(personRecord.name());
        personRecord.hey();
    }
}
