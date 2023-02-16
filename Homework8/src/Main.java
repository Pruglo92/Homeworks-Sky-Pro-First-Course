import java.util.Arrays;

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

    public static void task1() {
        System.out.println("Задача №1");

        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        double[] arrayDouble = {1.57, 7.654, 9.986};

        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    public static void task2() {
        System.out.println("Задача №2");

        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        for (int i : arrayInt) {
            System.out.print(i);
            if (!(i == arrayInt[arrayInt.length - 1])) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] arrayDouble = {1.57, 7.654, 9.986};

        for (double d : arrayDouble) {
            System.out.print(d);
            if (!(d == arrayDouble[arrayDouble.length - 1])) {
                System.out.print(", ");
            }
        }
        System.out.println();

        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};

        for (String s : seasons) {
            System.out.print(s);
            if (!(s.equals(seasons[seasons.length - 1]))) {
                System.out.print(", ");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача №3");

        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[arrayInt.length - i - 1]);
            if (!(arrayInt[i] == arrayInt[arrayInt.length - 1])) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] arrayDouble = {1.57, 7.654, 9.986};

        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[arrayDouble.length - 1 - i]);
            if (!(arrayDouble[i] == arrayDouble[arrayDouble.length - 1])) {
                System.out.print(", ");
            }
        }
        System.out.println();

        String[] seasons = new String[]{"Winter", "Spring", "Summer", "Autumn"};

        for (int i = 0; i < seasons.length; i++) {
            System.out.print(seasons[seasons.length - 1 - i]);
            if (!(seasons[i].equals(seasons[seasons.length - 1]))) {
                System.out.print(", ");
            }
        }
    }

    public static void task4() {
        System.out.println("Задача №4");

        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

        for (int i = 0; i < arrayInt.length; i++) {
            if (!(arrayInt[i] % 2 == 0)) {
                arrayInt[i] = arrayInt[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}