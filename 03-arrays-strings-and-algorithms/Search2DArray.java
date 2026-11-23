import java.util.Scanner;

public class Search2DArray{

    public static void search(int[][] arr, int num){
        int i = 0;
        boolean found = false;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                if(arr[i][j] == num){
                    System.out.print("Your number was found at row " + (i + 1) + " and column " + (j + 1));
                    found = true;
                }
                j ++;
            }
            i ++;
        }
        if (!found){
                System.out.print("Your number is not found");
            }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Search any element in 2D array\n");
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int [rows][columns];
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                System.out.print("Enter element of row " + (i + 1) + " and column " + (j + 1) + ": ");
                arr[i][j] = sc.nextInt();
                j ++;
            }
            i ++;
        }
        System.out.print("Enter the number you want to search: ");
        int num = sc.nextInt();
        search(arr, num);
        sc.close();
    }
}