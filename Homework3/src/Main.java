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
        System.out.println();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");

        byte a = 1;
        short b = 2;
        int c = 4;
        long d = 8L;
        float e = 4.0F;
        double f = 8.0D;

        System.out.println("Значение переменной a c типом byte равно " + a);
        System.out.println("Значение переменной b c типом short равно " + b);
        System.out.println("Значение переменной c c типом int равно " + c);
        System.out.println("Значение переменной d c типом long равно " + d);
        System.out.println("Значение переменной e c типом float равно " + e);
        System.out.println("Значение переменной f c типом double равно " + f);
    }
    public static void task2() {
        System.out.println("Задача 2");

        byte a = 67;
        short b = 569;
        int c = 27897;
        long d = 987678965549L;
        float e = 2.786F;
        double f = 27.12D;
        char g = (char) -159;

    }
    public static void task3() {
        System.out.println("Задача 3");

        byte classA = 23;
        byte classB = 27;
        byte classC = 30;
        short paper = 480;

        byte paperQuantity = (byte) (paper / (classA + classB + classC));

        System.out.println("На каждого ученика рассчитано " + paperQuantity + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");

        byte performance = 16 / 2; //Производительность машины за 1 минуту
        short performanceInTwentyMinutes = (short) (performance * 20);
        short performancePerDay = (short) (performance * 60 * 24);
        int performanceInThreeDay = performance * 60 * 24 * 3;
        int performancePerMonth = performance * 60 * 24 * 30; //За месяц берём 30 дней по дефолту, т.к. в условии задачи данный факт не указывается


        System.out.println("За 20 минут машина произвела " + performanceInTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + performancePerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + performanceInThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + performancePerMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");

        byte allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte paintForClass = (byte) (whitePaint + brownPaint);
        byte numberOfClasses = (byte) (allPaint / paintForClass);
        byte allWhitePaint = (byte) (whitePaint * numberOfClasses);
        byte allBrownPaint = (byte) (brownPaint * numberOfClasses);

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + allWhitePaint +
                " банок белой краски и " + allBrownPaint + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");

        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;

        short breakfastInGrams = (short) (banana * 5 + milk * 2 + iceCream * 2 + egg * 4);
        float breakfastInKilograms = breakfastInGrams / 1000F;

        System.out.println("Завтрак спортсмена равен " + breakfastInGrams + " грамм.");
        System.out.println("Завтрак спортсмена равен " + breakfastInKilograms + " килограмм.");
    }
    public static void task7() {
        System.out.println("Задача 7");

        short weightLossMin = 250;
        short weightLossMax = 500;
        short excessWeight = 7 * 1000; //Лишний вес переводим в граммы
        short numberOfDaysMax = (short) (excessWeight / weightLossMin);
        short numberOfDaysMin = (short) (excessWeight / weightLossMax);
        short numberOfDaysAverage = (short) ((numberOfDaysMin + numberOfDaysMax) / 2);

        System.out.println("На похудение уйдёт " + numberOfDaysMax + " дней, если худеть на 250 грамм в день.");
        System.out.println("На похудение уйдёт " + numberOfDaysMin + " дней, если худеть на 500 грамм в день.");
        System.out.println("На похудение уйдёт в среднем " + numberOfDaysAverage + " день.");
    }
    public static void task8() {
        System.out.println("Задача 8");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int newSalaryMasha = (int) (salaryMasha + (salaryMasha * 0.1));
        int newSalaryDenis = (int) (salaryDenis + (salaryDenis * 0.1));
        int newSalaryKristina = (int) (salaryKristina + (salaryKristina * 0.1));

        int salaryMashaInYear = salaryMasha * 12;
        int salaryDenisInYear = salaryDenis * 12;
        int salaryKristinaInYear = salaryKristina * 12;

        int newSalaryMashaInYear = newSalaryMasha * 12;
        int newSalaryDenisInYear = newSalaryDenis * 12;
        int newSalaryKristinaInYear = newSalaryKristina * 12;

        int mashaSalaryDifference = newSalaryMashaInYear - salaryMashaInYear;
        int denisSalaryDifference = newSalaryDenisInYear - salaryDenisInYear;
        int kristinaSalaryDifference = newSalaryKristinaInYear - salaryKristinaInYear;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на "
                + mashaSalaryDifference + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на "
                + denisSalaryDifference + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на "
                + kristinaSalaryDifference + " рублей");
    }
}