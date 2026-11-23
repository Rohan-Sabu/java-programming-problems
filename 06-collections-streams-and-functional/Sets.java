import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Counts no. of unique characters in string\n");
        System.out.print("Enter any String: ");
        String inp = sc.nextLine();
        
        for(char ch : inp.toCharArray()){
            if(ch != ' '){
                set.add(ch);
            }
        }

        System.out.printf("No. of unique characters in the given string are: %d", set.size());
        sc.close();
    }
    
}
