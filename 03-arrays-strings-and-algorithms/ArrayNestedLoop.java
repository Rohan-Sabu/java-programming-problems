// Create a class ArrayNestedLoop with a static nested class Statistics. Statistics could have methods 
// like mean(), median(), which operate on an array.

public class ArrayNestedLoop {

    public static class Statistics {

        public static double mean(int[] arr) {
            if (arr == null || arr.length == 0) {
                return 0.0;
            }

            double sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum / arr.length;
        }

        public static double median(int[] arr) {
            if (arr == null || arr.length == 0) {
                return 0.0;
            }

            int[] sorted = arr.clone();

            for (int i = 0; i < sorted.length - 1; i++) {
                for (int j = 0; j < sorted.length - 1 - i; j++) {
                    if (sorted[j] > sorted[j + 1]) {
                        int temp = sorted[j];
                        sorted[j] = sorted[j + 1];
                        sorted[j + 1] = temp;
                    }
                }
            }

            int middle = sorted.length / 2;

            if (sorted.length % 2 == 0) {
                return (sorted[middle - 1] + sorted[middle]) / 2.0;
            } else {
                return sorted[middle];
            }
        }
    }
}

class ArrayOperations {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        double mean = ArrayNestedLoop.Statistics.mean(numbers);
        double median = ArrayNestedLoop.Statistics.median(numbers);

        System.out.println("Array: 5, 2, 9, 1, 7");
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
    }
}
