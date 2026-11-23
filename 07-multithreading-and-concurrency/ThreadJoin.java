public class ThreadJoin extends Thread{
    
    private final int ThreadNo;

    public ThreadJoin(int threadNo) {
        ThreadNo = threadNo;
    }

    public void run(){
        System.out.printf("Thread - %d started\n", ThreadNo);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.printf("Thread - %d ended\n", ThreadNo);
        
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoin t1 = new ThreadJoin(1);
        ThreadJoin t2 = new ThreadJoin(2);
        ThreadJoin t3 = new ThreadJoin(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }


}
