// Design a Course class
// • Instance variables: courseName, enrolledStudents.
// • Static variable: maxCapacity, the maximum number of students for any course.
// • Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName)
// • Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses

public class Course{

    static int maxCapacity = 100;

    String courseName;
    int enrolledStudents = 0;

    Course(String c){
        courseName = c;
    }

    static void setMaxCapacity(int capacity){
        maxCapacity = capacity;
        System.out.println("Max Capacity for each course is " + maxCapacity);
    }

    void enrollStudent(String studentName){
        if(enrolledStudents < maxCapacity){
            System.out.println(studentName + " is enrolled in " + courseName);
            enrolledStudents ++;
        }
    }

    void unenrollStudent(String studentName){   
        if(enrolledStudents > 0){
            System.out.println(studentName + " is unenrolled from " + courseName);
            enrolledStudents --;
        }
        else{
            System.out.println("No students are enrolled in " + courseName);
        }
    }

    public static void main(String[] args){
        Course c1 = new Course("Java Programming");
        Course c2 = new Course("Data Structures");
        Course.setMaxCapacity(50);
        c1.enrollStudent("Rohan");
        c2.enrollStudent("Karan");
        c2.unenrollStudent("Karan");
        c2.unenrollStudent("Karan");
    }
}