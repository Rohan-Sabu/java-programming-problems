import java.util.function.BinaryOperator;

public class LambdaMultiplication {

    public static void main(String[] args) {
        
        BinaryOperator<Integer> multi = (a,b) -> a * b;
        int result = multi.apply(4, 9);
        System.out.printf("Result is %d", result);
    }
    
}
