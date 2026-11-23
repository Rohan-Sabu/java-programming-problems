package FunctionalInterface;

public class Testing {

    public static void main(String[] args) {
        
        IsPrimeFunctionalInterface p1 = num -> {
            if (num <= 1) {
                return false; // 0, 1, and negatives are not prime
            }

            for (int i = 2; i < num; i++) {
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.print(p1.isPrime(17));
    }
    
}
