import java.util.List;

public class StreamFilterReduce {

    public static void main(String[] args) {
        
        List<String> list = List.of("Java is Fun,", "its one of the", "hello", "best languages", "world");
        
        String result = list.stream()
                            .filter(list1 -> list1.length() > 10)
                            .reduce("", (a,b) -> a + " " + b);

        System.out.print(result);
    }
    
}
