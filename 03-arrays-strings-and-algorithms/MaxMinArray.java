import java.util.Scanner;

public class MaxMinArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Largest and Smallest element in array");
        System.out.print("\nEnter the no. of elements in array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i ++;
        }
        int max = max(arr);
        int min = min(arr);
        System.out.println("Largest element is " + max);
        System.out.print("Smallest element is " + min);
        sc.close();
    }

    public static int max(int arr[]){
        if (arr.length == 0) {
        System.out.println("Error: Array is empty!");
        System.exit(0);
        }
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length){
            if(arr[i] > max){
                max = arr[i];
            }
            i ++;
        }
        return max;
    }

    public static int min(int arr[]){
        if (arr.length == 0) {
        System.out.println("Error: Array is empty!");
        System.exit(0);
        }
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length){
            if(arr[i] < min){
                min = arr[i];
            }
            i ++;
        }
        return min;
    }
}