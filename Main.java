public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    private static void task3() {
        System.out.println();
        System.out.println("Задание 3");
        Car car1 = new Car ("Lada", "Granta", 1.7f, "желтый", 2015, "Россия");
        car1.informationOfTheCar();
        System.out.println();

        Car car2 = new Car ("Audi", "A8 50 L TDI quattro", 3.0f, "черный", 2020, "Германия");
        car2.informationOfTheCar();
        System.out.println();

        Car car3 = new Car ("BMW", "Z8", 3.0f, "черный", 2021, "Германия");
        car3.informationOfTheCar();
        System.out.println();

        Car car4 = new Car ("Kia", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея");
        car4.informationOfTheCar();
        System.out.println();

        Car car5 = new Car ("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");
        car5.informationOfTheCar();
        System.out.println();

    }
    private static void task2() {
        System.out.println();
        System.out.println("Задание 2");
        Human human1 = new Human();
        human1.name = "Максим";
        human1.age = 35;
        human1.yearOfBirth();
        human1.cityOfLife = "Минск";
        human1.position = "бренд-менеджер";
        human1.informationOgHuman2();
        System.out.println();

        Human human2 = new Human();
        human2.name = "Аня";
        human2.age = 29;
        human2.yearOfBirth();
        human2.cityOfLife = "Москва";
        human2.position = "методист образовательных программ";
        human2.informationOgHuman2();
        System.out.println();

        Human human3 = new Human();
        human3.name = "Катя";
        human3.age = 28;
        human3.yearOfBirth();
        human3.cityOfLife = "Калининград";
        human3.position = "продакт-менеджер";
        human3.informationOgHuman2();
        System.out.println();

        Human human4 = new Human();
        human4.name = "Артем";
        human4.age = 27;
        human4.yearOfBirth();
        human4.cityOfLife = "Москва";
        human4.position = "директор по развитию бизнеса";
        human4.informationOgHuman2();
        System.out.println();
    }
    private static void task1() {
        Human human1 = new Human();
        System.out.println();
        System.out.println("Задание 1");
        human1.name = "Максим";
        human1.age = 35;
        human1.yearOfBirth();
        human1.cityOfLife = "Минск";
        human1.informationOgHuman();
        System.out.println();

        Human human2 = new Human();
        human2.name = "Аня";
        human2.age = 29;
        human2.yearOfBirth();
        human2.cityOfLife = "Москва";
        human2.informationOgHuman();
        System.out.println();

        Human human3 = new Human();
        human3.name = "Катя";
        human3.age = 28;
        human3.yearOfBirth();
        human3.cityOfLife = "Калининград";
        human3.informationOgHuman();
        System.out.println();

        Human human4 = new Human();
        human4.name = "Артем";
        human4.age = 27;
        human4.yearOfBirth();
        human4.cityOfLife = "Москва";
        human4.informationOgHuman();
        System.out.println();
    }
}
