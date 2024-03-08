import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        tasks();
    }
    /*
    Выполнял задание по открытой странице в браузере, как выяснилось - поменяли условия задач
    Поэтому по обновленным исходным данным решение после.
     */
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void tasks() {
        //Task 1:
        System.out.println("Task 1:");
        int[] arr  = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Task 2:
        System.out.println("Task 2:");
        arr = generateRandomArray();
        int maxSpending = 0;
        int minSpending = 300_000;
        for (final int current : arr) {
            if (current > maxSpending) {
                maxSpending = current;
            } else if (current < minSpending) {
                minSpending = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSpending + " рублей");

        //Task 3:
        System.out.println("Task 3:");
        arr = generateRandomArray();
        double av = 0;
        for (int i : arr) {
            av += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", av / arr.length) + " рублей");

        //Task 4:
        System.out.println("Task 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
        }
        System.out.println();

        //Task 1 v2:
        System.out.println("Task 1 ver.2:");
        int[] monthBalance = new int[5];
        monthBalance[0] = 134550;
        monthBalance[1] = 165447;
        monthBalance[2] = 165778;
        monthBalance[3] = 126559;
        monthBalance[4] = 132001;
        sum = 0;
        for (int i : monthBalance) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        //Task 2 v2:
        System.out.println("Task 2 ver.2:");
        int max = -1;
        int min = 1_000_000;
        for (int current : monthBalance) {
            if (current > max) {
                max = current;
            } else if (current < min) {
                min = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        //Task 3 v2:
        System.out.println("Task 3 ver.2:");
        double average;
        double summary = 0;
        for (int j : monthBalance) {
            summary += j;
        }
        average = summary / monthBalance.length;
        System.out.println("Средняя сумма трат за месяц составила " + String.format("%.2f", average) + " рублей");

        // Альтернативный вариант (вычитал в паутине):
        double averageArr = Arrays.stream(monthBalance).average().getAsDouble();
        System.out.println("Средняя сумма - " + averageArr + " рублей");

        //Task 4 v2:
        System.out.println("Task 4 ver.2:");
        char[] reverseName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseName.length - 1; i >= 0; i--) {
            System.out.print(reverseName[i]);
        }
        System.out.println();
        // Пытался сделать аналогию решения как ниже, но для char она не подходит?
        // Или я что-то делаю не верно?
        Integer[] reverseName2 = {1 , 36 , 8 , 6 , 15};
        Collections.reverse(Arrays.asList(reverseName2));
        System.out.println(Arrays.toString(reverseName2));

    }
}