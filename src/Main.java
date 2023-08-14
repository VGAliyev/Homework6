public class Main {
    public static void main(String[] args) {

        System.out.println("Homework 6");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Task 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n");
    }

    public static void task2() {
        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("\n");
    }

    public static void task3() {
        System.out.println("Task 3");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("\n");
    }

    public static void task4() {
        System.out.println("Task 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("\n");
    }

    public static void task5() {
        System.out.println("Task 5");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println("Високосный год: " + i);
        }

        System.out.println("\n");
    }

    public static void task6() {
        System.out.println("Task 6");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        System.out.println("\n");
    }

    public static void task7() {
        System.out.println("Task 7");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("\n");
    }

    public static void task8() {
        System.out.println("Task 8");

        int deposit = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total += deposit;
        }

        System.out.println("За год отложили " + total + " рублей.\n");
    }

    public static void task9() {
        System.out.println("Task 9");

        double total = 0.0;

        for (int i = 1; i <= 12; i++) {
            total += 29000;
            total = total + total/100;
            String formatedTotal = String.format("%.2f", total); // Форматирование до двух знаков после запятой (копейки)
            System.out.println("Месяц " + i + ", сумма накоплений равна " + formatedTotal + " рублей.");
        }
        System.out.println("\n");
    }

    public static void task10() {
        System.out.println("Task 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + " * " + i + " = " + 2 * i);
        }

        System.out.println("\n");
    }
}