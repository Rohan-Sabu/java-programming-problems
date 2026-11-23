package Employee;

public class TestEmployee {
    
    public static void main(String[] args) {
        
        EmployeeDetails emp = new EmployeeDetails("Rohan", 20, 100000);
        System.out.println(emp.displayEmployeeDetails());
        emp.setName("Gullu");
        System.out.println(emp.getAge());
        emp.setSalary(90000);
        System.out.println(emp.displayEmployeeDetails());
    }
}
