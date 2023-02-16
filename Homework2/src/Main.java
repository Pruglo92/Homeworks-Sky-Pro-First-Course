public class Main {
    public static void main(String[] args) {
        //Задачи 1-3
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        //Задачи 6-7
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer1Weight - boxer2Weight;
        System.out.println("Общий вес двух бойцов равен " + totalWeight + "кг.");
        System.out.println("Разница в весе бойцов " + weightDifference);
        System.out.println();

        weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе бойцов " + weightDifference);
        weightDifference = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе бойцов " + weightDifference);
        System.out.println();

        //Задача 8
        var numberOfHours = 640;
        var workTime = 8;
        var numberOfEmployees = numberOfHours / workTime;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек.");
        System.out.println();

        numberOfEmployees = numberOfEmployees + 94;
        numberOfHours = numberOfEmployees * workTime;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + numberOfHours +
                " часов работы может быть поделено между сотрудниками");

    }
}