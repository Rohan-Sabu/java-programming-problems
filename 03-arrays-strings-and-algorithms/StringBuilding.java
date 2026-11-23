public class StringBuilding{

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("First ");
        str.append(1);
        str.append(", now Second ");
        str.append(2);
        System.out.print(str.toString());
    }
}