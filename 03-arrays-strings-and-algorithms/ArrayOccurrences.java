import java.util.Scanner;

public class ArrayOccurrences{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Count of element occurrences in given array");
        System.out.print("\nEnter the no. of elements in array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i ++;
        }
        System.out.print("Enter the element whose no. of occurences you want to find: ");
        int num = sc.nextInt();
        int result = occurrence(arr, num);
        System.out.print("Your element has occurred " + result + " times in array");
        sc.close();
    }

    public static int occurrence(int arr[], int num){
        int occ = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                occ ++;
            
            }
            i ++;
        }
        return occ;
    }
}