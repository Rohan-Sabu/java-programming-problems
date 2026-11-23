import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsReverse {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,56,89);
        System.out.println("Original List: " + list);
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
    
}
