import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsFrequency {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,6,8,1,2,7,1,6);
        System.out.println("List is: " + list);
        
        System.out.println("Frequency of 1 is: " + Collections.frequency(list, 1));
        System.out.println("Frequency of 6 is: " + Collections.frequency(list, 6));
        System.out.println("Frequency of 7 is: " + Collections.frequency(list, 7));
    }
    
}
