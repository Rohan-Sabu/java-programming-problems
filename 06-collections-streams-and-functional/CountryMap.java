import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("INDIA", "NEW DELHI");
        map.put("JAPAN", "TOKYO");
        map.put("AUSTRALIA", "CANBERRA");
        map.put("FRANCE", "PARIS");
        map.put("BRAZIL", "BRASILIA");

        Scanner sc = new Scanner(System.in);
        System.out.println("Capital of Country\n");
        System.out.print("Enter the name of Country: ");
        String country = sc.next().toUpperCase();
        if(map.containsKey(country)){
            System.out.printf("Capital of %s is %s", country, map.get(country));
        }
        else{
            System.out.print("Sorry, we don't know the capital");
        }
        sc.close();
    }
    
}
