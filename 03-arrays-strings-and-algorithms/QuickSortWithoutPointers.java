import java.util.Scanner;

public class QuickSortWithoutPointers{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quick Sort using Divide and Conquer Technique");
        System.out.print("\nEnter the no. of elements in array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while(i < arr.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i ++;
        }
        int[] result = partitionSort(arr);
        System.out.print("Sorted array is ");
        i = 0;
        while(i < result.length){
            System.out.print(result[i] + " ");
            i ++;
        }
        sc.close();
    }
    public static int[] partitionSort(int[] arr) {
        // Base case: if array has 0 or 1 element, it's already sorted
        if (arr.length <= 1) {
            return arr;
        }

        // Choose a pivot (e.g., the middle element)
        int pivot = arr[arr.length / 2];

        // 1. Count how many elements belong in each bucket so we can size our arrays
        int leftCount = 0;
        int midCount = 0;
        int rightCount = 0;

        int i = 0;
        while (i < arr.length) {
            if (arr[i] < pivot) {
                leftCount++;
            } else if (arr[i] == pivot) {
                midCount++;
            } else {
                rightCount++;
            }
            i++;
        }

        // 2. Initialize the bucket arrays with the exact correct sizes
        int[] left = new int[leftCount];
        int[] mid = new int[midCount];
        int[] right = new int[rightCount];

        // 3. Populate the buckets using your while loop logic
        int lIdx = 0, mIdx = 0, rIdx = 0;
        i = 0;
        while (i < arr.length) {
            if (arr[i] < pivot) {
                left[lIdx++] = arr[i];
            } else if (arr[i] == pivot) {
                mid[mIdx++] = arr[i];
            } else {
                right[rIdx++] = arr[i];
            }
            i++;
        }

        // 4. Recursively sort the left and right buckets
        int[] sortedLeft = partitionSort(left);
        int[] sortedRight = partitionSort(right);

        // 5. Combine everything back into a final sorted array
        int[] result = new int[arr.length];
        int resIdx = 0;

        // Copy sorted left
        i = 0;
        while (i < sortedLeft.length) {
            result[resIdx++] = sortedLeft[i];
            i++;
        }
        // Copy middle (pivot values)
        i = 0;
        while (i < mid.length) {
            result[resIdx++] = mid[i];
            i++;
        }
        // Copy sorted right
        i = 0;
        while (i < sortedRight.length) {
            result[resIdx++] = sortedRight[i];
            i++;
        }

        return result; // Return the fully assembled sorted array
    }
}

         
