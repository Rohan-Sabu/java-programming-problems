public class BreakAndContinue{

    public static void main(String[] args){
        System.out.print("Before Loop\n");
        for(int i = 0; i <= 10; i ++){
            if(i == 5){
                continue;
            }
            if(i == 9){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("\nOutside Loop");
    }
}