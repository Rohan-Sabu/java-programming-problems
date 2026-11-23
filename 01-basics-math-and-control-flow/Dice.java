public class Dice{

    int roll(){
        int result = (int) (Math.random() * 6) + 1;
        return result;
    }

    public static void main(String[] args){
        Dice d1 = new Dice();
        System.out.println("Rolling Dice 10 times -> ");
        for(int i = 0; i < 10; i ++){
            System.out.println(d1.roll());
        }
    }
}