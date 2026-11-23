import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSingleThread implements Runnable{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.printf("Number is %d\n", i+1);
        }
    }

    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            ExecutorSingleThread task = new ExecutorSingleThread();
            service.submit(task);
            service.shutdown();
        }
    }
    
}
