import java.util.Scanner;

public class DiagonalSum2DArray{

    public static int LeftDiagonalSum(int[][] arr){
        int sum = 0;
        int i = 0;
        while(i < arr.length){
            sum += arr[i][i];
            i ++;
        }
        return sum;
    }

    public static int RightDiagonalSum(int[][] arr){
        int sum = 0;
        int i = 0;
        int column = 0;
        while(i < arr.length){
            column = (arr[i].length - 1 - i);
            sum += arr[i][column];
            i ++;
        }
        return sum;
    }

    public static int DiagonalSum(int [][] arr){
        int left = LeftDiagonalSum(arr);
        int right = RightDiagonalSum(arr);
        int sum = left + right;
        if(arr.length % 2 != 0){
            int index = arr.length / 2;
            sum -= arr[index][index];
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum of diagonal elements of 2D array\n");
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
        int sum = DiagonalSum(arr);
        System.out.print("Sum of diagonal elements is: " + sum);
        sc.close();
    }
}