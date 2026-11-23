package Employee;

public class EmployeeDetails {
    
    private String name;
    private int age;
    private int salary;

    EmployeeDetails(String n, int a, int s){
        name = n;
        age = a;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int s){
        salary = s;
    }

    String displayEmployeeDetails(){
        return "Employee Details { Name: " + name + ", Age: " + age + ", Salary: " + salary + " }";
    }
}
