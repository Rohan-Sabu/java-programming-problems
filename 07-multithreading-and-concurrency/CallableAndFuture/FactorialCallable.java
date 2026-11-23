package CallableAndFuture;

import java.util.concurrent.Callable;

public class FactorialCallable implements Callable<Integer>{

    private int num;
    
    public FactorialCallable(int num) {
        this.num = num;
    }

    public Integer call() throws Exception{
        Thread.sleep(2000);

        if(num <= 1){
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
        
    }   
}
