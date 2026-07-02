public class Практика_05_MathMethods {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        System.out.println("sum(5, 3) = " + sum(5, 3));
        System.out.println("sum(5, 3, 2) = " + sum(5, 3, 2));
        System.out.println("isEven(4) = " + isEven(4));
        System.out.println("isEven(7) = " + isEven(7));
        printMessage("Привет мир!");
    }
}
