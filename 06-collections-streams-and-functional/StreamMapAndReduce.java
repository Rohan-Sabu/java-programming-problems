import java.util.List;

public class StreamMapAndReduce {
    
    public static void main(String[] args) {
        
        List<String> list = List.of("1", "2", "3", "4", "5");

        list.stream()
            .map(Integer::parseInt)
            .map(num -> Math.pow(num, 2))
            .reduce(Double :: sum)
            .ifPresent(System.out::println);
    }
}
