import java.util.Scanner;

public class MaxArrayForEachLoop{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Maximum number in Array using For Each Loop");
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        if(arr.length == 0){
            System.exit(0);
        }
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i ++;
        }

        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(max < num){
                max = num;
            }
        }
        System.out.print("Maximum number in the array is " + max);
        sc.close();
    }
}