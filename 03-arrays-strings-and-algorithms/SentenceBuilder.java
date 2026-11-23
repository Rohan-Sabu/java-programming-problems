// Take an array of words and concatenate them into a single string using StringBuilder.

public class SentenceBuilder {
    public static void main(String[] args) {
        
        String[] arr = new String[] {
            "Learning", "Java", "objects,", "classes,", "and", "loops", 
            "is", "becoming", "so", "much", "fun!"
        };
        
        StringBuilder sb = new StringBuilder();
        
        for (String str : arr) {
            sb.append(str).append(" ");
        }
       
        System.out.println(sb);
    }
}