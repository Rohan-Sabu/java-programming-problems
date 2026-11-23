import java.util.Scanner;

public class ArraySumAverage{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum and Average of elements of given array");
        System.out.print("Enter the no. of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i ++;
        }
        long sum = sum(arr);
        double avg = average(arr);
        System.out.println("Sum of elements is " + sum);
        System.out.println("Average of elements is " + avg);
        sc.close();
    }

    public static long sum(int arr[]){
        long sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            i ++;
        }
        return sum;
    }

    public static double average(int arr[]){
        double avg = (double)sum(arr) / arr.length;
        return avg;
    }
    
}