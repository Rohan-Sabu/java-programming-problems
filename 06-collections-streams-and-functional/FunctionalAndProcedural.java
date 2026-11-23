import java.util.stream.IntStream;

public class FunctionalAndProcedural {
    
    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 9 using two ways:\n");

        int number = 9;

        System.out.println("Method 1 Procedural Programming: " + factorial(number));

        IntStream.rangeClosed(2, number)
                 .reduce((a, b) -> a * b)
                 .ifPresent(result -> System.out.println("Method 2 Functional Programming: " + result));
    }
}

