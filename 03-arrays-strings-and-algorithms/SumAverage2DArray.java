import java.util.Scanner;

public class SumAverage2DArray{

    public static int sum(int[][] arr){
        int sum = 0;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                sum += arr[i][j];
                j ++;
            }
            i ++;
        }
        return sum;
    }

    public static float average(int[][] arr){
        int rows = arr.length;
        if(rows == 0){
            return 0;
        }
        int count = 0;
        int i = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[i].length){
                count ++;
                j ++;
            }
            i ++;
        }
        float avg = (float)sum(arr) / count;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sum and average of elements in 2D array\n");
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
        int sum = sum(arr);
        float avg = average(arr);
        System.out.println("Sum of elements is " + sum);
        System.out.print("Average of elements is " + avg);
        sc.close();
    }
}