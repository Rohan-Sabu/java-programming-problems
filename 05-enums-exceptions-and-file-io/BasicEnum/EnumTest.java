package BasicEnum;

public class EnumTest {

    public static void main(String[] args) {
        System.out.println("Printing all the days of week: ");
        for (Day d : Day.values()) {
            System.out.println(d);        
        }
        
    }
    
}
