package CallableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestCallable{

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> result = new ArrayList<>();

            for (int i = 1; i <= 10; i++) {
                FactorialCallable task = new FactorialCallable(i);
                result.add(service.submit(task));
                
            }

            for (Future<Integer> future : result) {
                System.out.printf("Result is %d\n", future.get());
            }
            service.shutdown();

            if(! service.awaitTermination(20, TimeUnit.SECONDS)){
                System.out.println("Emergency Shutdown");
                service.shutdownNow();
            }
        }
    }
}