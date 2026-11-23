import java.util.Scanner;

public class DeleteNoFromArray{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Deletes the given element from array and gives new array");
    System.out.print("Enter size of array: ");
    int size = sc.nextInt();
    int[] ans;
    int[] arr = new int[size];
    int i = 0;
    while(i < arr.length){
        System.out.print("Enter element " + (i + 1) + ": ");
        arr[i] = sc.nextInt();
        i ++;
    }
    System.out.print("Enter the number you want to delete: ");
    int num = sc.nextInt();
    ans = newarr(arr, num);
    System.out.print("The new array is: ");
    int j = 0;
    while(j < ans.length){
        System.out.print(ans[j]);
        if(j < (ans.length - 1)){
        System.out.print(", ");
        }
        j ++;
    }
    sc.close();
}

public static int[] newarr(int[] arr, int num){
    if(arr.length <= 0){
        System.exit(0);
    }
    int count = 0;
    int i = 0;
    while(i < arr.length){
        if(arr[i] == num){
            count ++;
        }
        i ++;
    }
    int[] ans = new int[arr.length - count];
    int origindex = 0;
    int ansindex = 0;
    while(origindex < arr.length){
        if(arr[origindex] != num){
            ans[ansindex] = arr[origindex];
            ansindex ++;
        }
        origindex ++;
    }
    return ans;
}
}