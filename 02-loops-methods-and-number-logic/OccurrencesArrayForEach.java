import java.util.Scanner;

public class OccurrencesArrayForEach{

    public static int Occurrence(int[] arr, int element){
        int occ = 0;
        for(int num : arr){
            if(num == element){
                occ ++;
            }
        }
        return occ;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of Occurrences of an element in Array using For Each Loop");
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
        System.out.print("Enter the element whose no. of occurrences you want to find: ");
        int element = sc.nextInt();
        int result = Occurrence(arr, element);
        System.out.print(element + " has occurred " + result + " times");
        sc.close();
    }
}