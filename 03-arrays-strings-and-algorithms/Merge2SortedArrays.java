import java.util.Scanner;

public class Merge2SortedArrays{

    public static int[] newarr(int[] arr1, int[] arr2){
        int[] newarr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length || j < arr2.length){
            if(j == arr2.length || (i < arr1.length) && (arr1[i] < arr2[j])){
                newarr[k] = arr1[i];
                i ++;
                k ++;
            }
            else{
                newarr[k] = arr2[j];
                j ++;
                k ++;
            }
        }
        return newarr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Merge 2 sorted arrays");
        System.out.print("\nEnter size of 1st array: ");
        int size = sc.nextInt();
        if(size <= 0){
            System.exit(0);
        }
        int[] arr1 = new int[size];
        int i = 0;
        while(i < arr1.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
            i ++;
        }
        System.out.print("Enter size of 2st array: ");
        int size2 = sc.nextInt();
        if(size2 <= 0){
            System.exit(0);
        }
        int[] arr2 = new int[size2];
        int j = 0;
        while(j < arr2.length){
            System.out.print("Enter element " + (j + 1) + ": ");
            arr2[j] = sc.nextInt();
            j ++;
        }
        int[] newarr = newarr(arr1, arr2);
        System.out.print("The merged array is ");
        int k = 0;
        while(k < newarr.length){
            System.out.print(newarr[k]);
            if(k < (newarr.length - 1)){
                System.out.print(", ");
            }
            k ++;
        }
        sc.close();
    }
}
