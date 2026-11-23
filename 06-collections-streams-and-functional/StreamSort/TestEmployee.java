package StreamSort;

import java.util.List;

public class TestEmployee {
     
    public static void main(String[] args) {
        
        List<Employee> employee = List.of(
            new Employee("Rohan", 1000),
            new Employee("Rahul", 500),
            new Employee("Ram", 10000),
            new Employee("Shyam", 5000),
            new Employee("Mohan", 100)
        );

        employee.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}
