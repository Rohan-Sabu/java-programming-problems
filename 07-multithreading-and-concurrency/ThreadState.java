public class ThreadState extends Thread{

    public void run(){
        try {
            Thread.sleep(4000);
            System.out.printf("From inside run - %s\n", getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("Created the thread - %s\n", t1.getState());
        
        t1.start();
        t1.join();

        System.out.printf("Ended the thread - %s\n", t1.getState());
    }
}