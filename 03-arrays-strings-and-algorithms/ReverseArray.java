import java.util.Scanner;

public class ReverseArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Reverse the given array");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        if(size == 0){
            System.exit(0);
        }
        int[] arr = new int[size];
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i ++;
        }
        int[] ans = reverse(arr);
        System.out.print("New Reversed array: ");
        int j = 0;
        while(j < ans.length){
            System.out.print(ans[j]);
            if(j < (ans.length - 1)){
                System.out.print(", ");
            }
            j ++;
        }
        sc.close();
    }

    public static int[] reverse(int[] arr){
        int[] ans = new int[arr.length];
        int origindex = (arr.length - 1);
        int ansindex = 0;
        while(origindex >= 0){
            if(ansindex < arr.length){
                ans[ansindex] = arr[origindex];
                ansindex ++;
                }
            origindex --;
        }
        return ans;
    }
}