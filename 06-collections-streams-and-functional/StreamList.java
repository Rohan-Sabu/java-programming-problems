import java.util.List;

public class StreamList {

    public static void main(String[] args) {
        
        List<String> list = List.of("Java", "is", "fun");
        list.stream()
            .forEach(list1 -> System.out.println(list1));
    }
    
}
