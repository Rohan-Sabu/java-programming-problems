// Define a Student class with fields like name and age, and use toString to print student details. 

public class Student_toString{

    String name;
    int age;
    int rollno;
    String house;
    
    Student_toString(String n, int a, int r, String h){
        name = n;
        age = a;
        rollno = r;
        house = h;
    }

    public String toString(){
        return "Student details: { Name : " + name + ", Age : " + age + ", Roll Number : " + rollno + ", House : " + house + " }";
    }

    public static void main(String[] args){
        Student_toString stu = new Student_toString("Prashant", 20, 01, "Red");
        System.out.print(stu);
    }
}