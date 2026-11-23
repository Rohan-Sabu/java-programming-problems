import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMultipleThread implements Runnable{

    public void run(){
        System.out.printf("Started with thread %s\n", Thread.currentThread().getName());

        try {
            Thread.sleep(getRandom() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Ended with thread %s\n", Thread.currentThread().getName());
    }

    public int getRandom(){
        double random = Math.random() * 5 + 1;
        return (int) random;
    }

    public static void main(String[] args) throws InterruptedException {
        try (ExecutorService service = Executors.newFixedThreadPool(5)) {
            for (int i = 0; i < 10; i++) {
                ExecutorMultipleThread task = new ExecutorMultipleThread();
                service.submit(task);
            }

            service.shutdown();
        
            if(! service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.print("Emergency Shurdown");
                service.shutdownNow();
            }
        }
    }
    
}
