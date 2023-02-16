public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача №1");

        int[] book = generateRandomArray();
        int sum = 0;
        for (int i : book) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача №2");

        int[] book = generateRandomArray();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : book) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " +
                "Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("Задача №3");

        int[] book = generateRandomArray();

        double sum = 0;

        for (int i : book) {
            sum = sum + i;
        }

        double averageAmount = sum / 30.D;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageAmount);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача №4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}