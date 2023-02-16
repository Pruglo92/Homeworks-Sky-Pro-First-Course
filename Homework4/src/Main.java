public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();
        task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int age = (int) (Math.random() * (30 - 1) + 1);
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    " то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int temperature = (int) (Math.random() * (10 - 1) + 1);
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int speed = (int) (Math.random() * (70 - 50) + 50);
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штра.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int age = (int) (Math.random() * (100 - 2) + 2);
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет.");
        }else if (age > 24 && age <= 65) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу.");
        }else if (age > 65) {
            System.out.println("Если возраст человека равен " + age + ", то он пенсионер. (◕‿◕)");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");

        int age = (int) (Math.random() * (18 - 1) + 1);
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }else if (age <= 14) {
            System.out.println("Если возраст ребенка равен " + age +
                    ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }else {
            System.out.println("Если возраст ребенка равен " + age +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");

        int wagonCapacity = 102;
        double scale = Math.pow(10, 2);
        int seatPlaceLoad = (int) (Math.random() * 60);
        int standingPlaceLoad = (int) (Math.random() * 42);
        int wagonLoad = standingPlaceLoad + seatPlaceLoad;
        double wagonLoadPercent = Math.ceil((wagonLoad / (wagonCapacity * 0.01)) * scale) / scale;

        if (wagonLoad < 102) {
            System.out.println("Вагон загружен на " + wagonLoadPercent + "%, в вагоне емеется " + (60 - seatPlaceLoad) +
                    " свободных сидячих мест и " + (42 - standingPlaceLoad) + " свободных стоячих мест.");
        }else {
            System.out.println("Вагон загружен на 100%, свободные места отсутствуют.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");

        int one = (int) (Math.random() * 10);
        int two = (int) (Math.random() * 10);
        int three = (int) (Math.random() * 10);

        if (one >= two && one >= three) {
            System.out.println("Большее из трёх чисел " + one);
        }else if (two >= one && two >= three) {
            System.out.println("Большее из трёх чисел " + two);
        }else {
            System.out.println("Большее из трёх чисел " + three);
        }
    }
}