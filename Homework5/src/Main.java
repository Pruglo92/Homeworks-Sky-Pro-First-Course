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
    }

    public static void task1() {
        int clientOS = (int) (Math.random() * 2);
        switch (clientOS) {
            case 0 -> System.out.println("Установите версию приложения для iOS по ссылке");
            case 1 -> System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int clientOS = (int) (Math.random() * 2);
        int clientDeviceYear = (int) (Math.random() * (2023 - 2005) + 2005);
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
        }
    }

    public static void task3() {
        int year = (int) (Math.random() * (3000 - 1000) + 1000);

        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        }else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = (int) (Math.random() * 120);
        int day = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + day);
        }else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (day + 1));
        }else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (day + 2));
        }else {
            System.out.println("Доставки нет.");
        }
    }

    public static void task5() {
        int monthNumber = (int) (Math.random() * (20 - 1) + 1);

        switch (monthNumber) {
            case 1 -> System.out.println("Месяц Январь - это Зима.");
            case 2 -> System.out.println("Месяц Февраль - это Зима.");
            case 3 -> System.out.println("Месяц Март - это Весна.");
            case 4 -> System.out.println("Месяц Апрель - это Весна.");
            case 5 -> System.out.println("Месяц Май - это Весна.");
            case 6 -> System.out.println("Месяц Июнь - это Лето.");
            case 7 -> System.out.println("Месяц Июль - это Лето.");
            case 8 -> System.out.println("Месяц Август - это Лето.");
            case 9 -> System.out.println("Месяц Сентябрь - это Осень.");
            case 10 -> System.out.println("Месяц Октябрь - это Осень.");
            case 11 -> System.out.println("Месяц Ноябрь - это Осень.");
            case 12 -> System.out.println("Месяц Декаьбрь - это Зима.");
            default -> System.out.println("Такого месяца не существует.");
        }
    }
}