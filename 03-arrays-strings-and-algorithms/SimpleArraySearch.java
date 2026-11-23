import java.util.Scanner;

public class SimpleArraySearch{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,4,5,7,34,45,59,67,78,98,100};
        System.out.println("Array:");
        int index = 0;
        while(index < arr.length){
            System.out.println(arr[index]);
            index ++;
        }
        System.out.println("Simple Array Search");
        System.out.print("Enter the number you want to search: ");
        int num = sc.nextInt();
        boolean isFound = isFound(arr,num);
        if(isFound){
            System.out.print(num + " is found in the array");
        }
        else{
            System.out.print(num + " is not found in the array");
        }
        sc.close();
    }

    public static boolean isFound(int arr[], int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index ++;
        } 
        return false;
    }
}