public class Практика_04_ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 7, 42, 18};

        System.out.print("Все элементы массива: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sum = 0;
        int max = numbers[0];
        boolean contains42 = false;

        for (int num : numbers) {
            sum += num;
            if (num > max) max = num;
            if (num == 42) contains42 = true;
        }

        System.out.println("Сумма всех элементов: " + sum);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Содержит ли число 42? " + contains42);
    }
}
