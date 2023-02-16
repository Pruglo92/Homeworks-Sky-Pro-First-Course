import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2023);
        System.out.println();
        checkOsAndDeviceYear(0, 2023);
        System.out.println();
        System.out.println("Итоговое колличество дней доставки " + getDeliveryTime(50));
    }

    public static void checkLeapYear(int year) {
        System.out.println("Задача №1");
        if (year == 0) {
            throw new RuntimeException("Год не может быть 0");
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkOsAndDeviceYear(int clientOS, int clientDeviceYear) {
        System.out.println("Задача №2");

        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear == 0) {
            throw new RuntimeException("Год создания девайса не может быть 0.");
        } else if (clientOS > 1) {
            throw new RuntimeException("Операционная система указана не верно, укажите ОС согласно правилу:" +
                    " 0 - iOS, " +
                    "1 - Android");
        }
        switch (clientOS) {
            case 0:
                if (clientDeviceYear == currentYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else throw new RuntimeException("Год создания устройства ещё не наступил.");
                break;
            case 1:
                if (clientDeviceYear == currentYear) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else if (clientDeviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else throw new RuntimeException("Год создания устройства ещё не наступил.");
                break;
        }
    }

    public static int getDeliveryTime(int deliveryDistance) {
        System.out.println("Задача №3");

        int day = 1;
        if ((deliveryDistance <= 0)) {
            throw new RuntimeException("Расстояние доставки должно быть больше нуля.");
        }
        if (deliveryDistance <= 20) {
            return day;
        } else if (deliveryDistance <= 60) {
            return day + 1;
        } else if (deliveryDistance <= 100) {
            return day + 2;
        } else {
            throw new RuntimeException("Доставки на данное растояние нет.");
        }
    }
}