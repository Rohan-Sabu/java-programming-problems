import java.util.Scanner;

public class StarPatterns{

    public static void main(String[] args){
        System.out.println("Star Patterns");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        RightHalfPyramid(rows);
        ReverseRightHalfPyramid(rows);
        LeftHalfPyramid(rows);
        sc.close();
    }

    public static void RightHalfPyramid(int maxrows){
        System.out.println("Right Half Pyramid Star Pattern");
        int rows = 0;
        while (rows < maxrows){
            System.out.print("* ");
            int i = 0;
            while (i < rows){
                System.out.print("* ");
                i ++;
            }
            System.out.println();
            rows ++;
        }
    }

    public static void ReverseRightHalfPyramid(int maxrows){
        System.out.println("\nReverse Right Half Pyramid Star Pattern");
        int rows = maxrows;
        while (rows > 0){
            int i = 0;
            while (i < rows){
                System.out.print("* ");
                i ++;
            }
            System.out.println();
            rows --;
        }
    }

    public static void LeftHalfPyramid(int maxrows){
        System.out.println("\nLeft Half Pyramid Star Pattern");
        int rows = 1;
        while (rows <= maxrows){
            int j = 0;
            while (j < (maxrows - rows)){
                System.out.print("  ");
                j ++;
            }
            int i = 0;
            while (i < rows){
                System.out.print("* ");
                i ++;
            }
            System.out.println();
            rows ++;
        }
    }

}