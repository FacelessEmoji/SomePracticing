package Experimenting.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Comparator <Employee> employeeFirstNameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.firstName().compareTo(o2.firstName());
            }
        };
        //норм

        Comparator <Employee> employeeComparator = Comparator.comparing(Employee::firstName)
                .thenComparing(Employee::gender).reversed();
        // тут reversed работает

        Comparator <Employee> employeeLastNameComparator = (o1,o2) -> o1.lastName().compareTo(o2.lastName());
        //норм

        Comparator<Employee> employeeAgeComparator = (o1, o2) -> o1.age().compareTo(o2.age()); // - по возрастанию age
        //employeeAgeComparator.reversed(); - параша не работает
        //employeeAgeComparator = Comparator.reverseOrder(); - чувствую себя обманутым

        //Comparator<Employee> employeeAgeComparator = (o2, o1) -> o1.age().compareTo(o2.age()); // - по убыванию age

        ArrayList<Employee> employees = new ArrayList<>();


        Employee employee = new Employee("Ames", "Bricsson", 32, 7, 'm');
        Employee employee1 = new Employee("Bick", "Ackson", 56, 15, 'm');
        Employee employee2 = new Employee("Datalia", "Black", 25, 3,'f');
        Employee employee3 = new Employee("Charles", "Stethem", 40, 10,'m');
        Employee employee4 = new Employee("Eane", "Springly", 38, 1,'f');

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        SortedSet<Employee> employeeSortedSet = new TreeSet<>(employeeComparator);

        employeeSortedSet.add(employee);
        employeeSortedSet.add(employee1);
        employeeSortedSet.add(employee2);
        employeeSortedSet.add(employee3);
        employeeSortedSet.add(employee4);

        employeeSortedSet.forEach(System.out::println);

/*        employees.stream().filter(x -> x.age() > 30).sorted().forEach(System.out::println);*/
        //крашит с ошибкой

        //employees.stream().filter(x -> x.age() > 30).forEach(System.out::println);
        // норм

/*        employees.stream().filter(x -> x.age() > 30)
                .sorted(Comparator.comparing(Employee::firstName)
                        .thenComparing(Employee::lastName))
                                .forEach(System.out::println);*/
        //норм

/*        employees.stream()
                .filter(x -> x.age() > 30)
                .filter(x -> x.yearsOfService() > 5)
                .sorted(employeeFirstNameComparator)
                .sorted(employeeLastNameComparator)
                .forEach(System.out::println);
    */
    //отрабатывает вначале 1-ый компаратор, потом второй, все работает четко

/*        employees.stream()
                .filter(x -> x.yearsOfService() < 10)
                .sorted(employeeAgeComparator)
                .forEach(System.out::println);*/
        //Норм, возрастание и убывание см. выше
    }
}