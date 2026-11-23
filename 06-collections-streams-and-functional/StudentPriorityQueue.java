import java.util.Comparator;
import java.util.PriorityQueue;

class Student {
    String name;
    String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}

public class StudentPriorityQueue {
    public static void main(String[] args) {
        
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.grade.compareTo(s2.grade);
            }
        });

        pq.offer(new Student("Alice", "B"));
        pq.offer(new Student("Charlie", "A"));
        pq.offer(new Student("Rohan", "D"));
        pq.offer(new Student("Bob", "B"));
        pq.offer(new Student("David", "C"));

        System.out.println(pq);

        System.out.println("\nProcessing students by grade:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
