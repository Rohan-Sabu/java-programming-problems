public class ThreadsHello extends Thread{

    private final int threadNo;

    public ThreadsHello(int threadNo) {
        this.threadNo = threadNo;
    }

    public void run(){
        for(int i = 0; i < 10; i ++){
            System.out.printf("\n[%s] Hello from Thread - %d", (i + 1), threadNo);
        }
    }

    public static void main(String[] args) {
        ThreadsHello t1 = new ThreadsHello(1);
        ThreadsHello t2 = new ThreadsHello(2);

        t1.start();
        t2.start();
    }
  
}
