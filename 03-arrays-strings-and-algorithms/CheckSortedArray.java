import java.util.Scanner;

public class CheckSortedArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Checks whether given array is sorted or not");
        System.out.print("\nEnter no. of elements in array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i ++;
        }
        boolean isSorted = isSorted(arr);
        if(isSorted){
            System.out.print("The array is sorted");
        }
        else{
            System.out.print("The array is not sorted");
        }
        sc.close();
    }

    public static boolean isSorted(int[] arr){
        if(arr.length == 1){
            return true;
        }
        if(arr.length == 0){
            System.exit(0);
        }
        boolean isAscending = true;
        boolean isDescending = true;
        int i = 0;
        while(i < (arr.length - 1)){
            if(arr[i] > arr[i + 1]){
                isAscending = false;
            }
            if(arr[i] < arr[i + 1]){
                isDescending = false;
            }
            i ++;
        } 
        return isAscending || isDescending;
    }
}