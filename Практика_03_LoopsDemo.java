import java.util.Scanner;

public class Практика_03_LoopsDemo {
    public static void main(String[] args) {
        System.out.println("Задание 1: Числа от 1 до 10 (for)");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("Задание 2: Сумма чисел от 1 до 100 (while)");
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Сумма: " + sum + "\n");

        System.out.println("Задание 3: Ввод пароля (do-while)");
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
            if (!password.equals("java123")) {
                System.out.println("Неверный пароль. Попробуйте снова.");
            }
        } while (!password.equals("java123"));
        System.out.println("Доступ разрешён!");
        scanner.close();
    }
}
