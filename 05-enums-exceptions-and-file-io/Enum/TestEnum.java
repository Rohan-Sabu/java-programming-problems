package Enum;

public class TestEnum {

    public static void main(String[] args) {
        System.out.println("Printing days of the week along with their type");

        for (DayEnum d : DayEnum.values()) {
            System.out.printf("%s -> %s\n", d, d.getType());
        }
    }
    
}
