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
        task7();
        System.out.println();
        task8();
    }

    public static void task1() {
        System.out.println("Задача №1");

        int salary = 15_000;
        int total = 0;
        int month = 0;

        while (total <= 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача №2");
        int count = 0;
        while (count < 10) {
            count++;
            System.out.print(count + " ");
        }
        System.out.println();
        for (; count > 0; count--) {
            System.out.print(count + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача №3");

        int populationOfTheCountry = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int year = 1;

        while (year <= 10) {
            populationOfTheCountry = populationOfTheCountry / 1000 * (fertility - mortality) + populationOfTheCountry;
            System.out.println("Год " + year + ", численность населения составляет " + populationOfTheCountry);
            year++;
        }
    }

    public static void task4() {
        System.out.println("Задача №4");

        int depositAmount = 15_000;
        int month = 1;
        while (depositAmount < 12_000_000) {
            depositAmount = depositAmount + depositAmount / 100 * 7;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + depositAmount + " рублей");
            month++;
        }
    }

    public static void task5() {
        System.out.println("Задача №5");

        int depositAmount = 15_000;
        int month = 1;
        while (depositAmount < 12_000_000) {
            depositAmount = depositAmount + depositAmount / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + depositAmount + " рублей");
            }
            month++;
        }
    }

    public static void task7() {
        System.out.println("Задача №7");

        int firstFriday = (int) (Math.random() * (8 - 1) + 1);

        while (firstFriday <= 31) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday = firstFriday + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача №8");

        int year = 0;
        while (year < 2123) {
            year += 79;
            if (year > 1823 && year <= 2123) {
                System.out.println(year);
            }
        }
    }
}