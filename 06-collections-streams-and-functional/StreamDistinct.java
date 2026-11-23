import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct{

    public static void main(String[] args) {
        
        List<Integer> num = List.of(1,2,3,2,5,3,4,6,2);
        List<Integer> result = num.stream()
                                  .distinct()
                                  .collect(Collectors.toList());
        
        System.out.println("Original List: " + num);
        System.out.println("New list after distinct: " + result);

    }
}