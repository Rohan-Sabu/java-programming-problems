import java.util.List;

public class StreamFilterForEach {
    
    public static void main(String[] args) {
        
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        list.stream()
            .filter(list1 -> list1 % 2 == 1)
            .forEach(list1 -> System.out.println(list1));
    }
}
