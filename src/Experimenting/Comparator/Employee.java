package Experimenting.Comparator;

public record Employee(String firstName, String lastName, Integer age, Integer yearsOfService, char gender) {
    //Тип параметра обязательно ссылочный если будет использоваться компаратор, т.е. Int -> Integer и т.д.
    @Override
    public String toString() {
        return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' +
                ", age=" + age + ", yearsOfService=" + yearsOfService + ", " + gender + '}';
    }
}
