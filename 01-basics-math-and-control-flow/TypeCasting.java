public class TypeCasting {
    public static void main(String[] args) {
        double d = 10.5;
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;

        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(i);
    }
}