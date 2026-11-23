class MethodOverloading {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading calc = new MethodOverloading();

        int sum1 = calc.add(5, 10);
        System.out.println("Result: " + sum1);

        int sum2 = calc.add(1, 2, 3);
        System.out.println("Result: " + sum2);

        double sum3 = calc.add(4.5, 2.5);
        System.out.println("Result: " + sum3);
    }
}
