package Thread;

public class ThreadSignal extends Thread{

    private TrafficColour colour;

    public ThreadSignal(TrafficColour colour) {
        this.colour = colour;
    }

    public void run(){
        System.out.printf("%s active\n", colour);
        
        try {
            Thread.sleep(colour.getTimeinmillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("%s inactive\n", colour);
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSignal t1 = new ThreadSignal(TrafficColour.RED);
        ThreadSignal t2 = new ThreadSignal(TrafficColour.YELLOW);
        ThreadSignal t3 = new ThreadSignal(TrafficColour.GREEN);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();

    }
    
}
