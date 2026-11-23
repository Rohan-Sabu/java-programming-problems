package ThreadSynchronize;

public class Threadcounter extends Thread{

    private Counter counter;

    public Threadcounter(Counter counter) {
        this.counter = counter;
    }

    public void run(){
        for(int i = 1; i <= 1000; i ++){
            counter.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Threadcounter t1 = new Threadcounter(counter);
        Threadcounter t2 = new Threadcounter(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.printf("Total Count is %d", counter.getCount());
    }    
}
