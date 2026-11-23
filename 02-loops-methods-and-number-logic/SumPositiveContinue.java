// Create a program using continue to sum all positive numbers entered by the user, skip any negative numbers

import java.util.Scanner;

public class SumPositiveContinue{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add positive numbers in array, skip negative numbers using Continue Statement");
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
        int sum = 0;
        for(int num : arr){
            if(num < 0){
                continue;
            }
            sum += num;
        }
        System.out.print("Sum of positive numbers in array is " + sum);
        sc.close();
    }
}