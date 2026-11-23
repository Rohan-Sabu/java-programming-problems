public class ForEachLoop{

    public static void main(String[] args){
        String[] arr = new String[]{
            "Hi", "Hello", "Yo"
        };
        foreach(arr);
    }

    public static void foreach(String[] arr){
        for(String name : arr){
            System.out.print(name + " ");
        }
    }
}