public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    private static void task3() {
        System.out.println();
        System.out.println("Задание 3");
        Car car1 = new Car ();
        car1.brand = "Lada";
        car1.model = "Granta";
        car1.engineVolume = 1.7f;
        car1.color = "желтый";
        car1.productionYear = 2015;
        car1.productionCountry = "Россия";
        car1.informationOfTheCar();
        System.out.println();

        Car car2 = new Car ();
        car2.brand = "Audi";
        car2.model = "A8 50 L TDI quattro";
        car2.engineVolume = 3.0f;
        car2.color = "черный";
        car2.productionYear = 2020;
        car2.productionCountry = "Германия";
        car2.informationOfTheCar();
        System.out.println();

        Car car3 = new Car ();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.engineVolume = 3.0f;
        car3.color = "черный";
        car3.productionYear = 2021;
        car3.productionCountry = "Германия";
        car3.informationOfTheCar();
        System.out.println();

        Car car4 = new Car ();
        car4.brand = "Kia";
        car4.model = "Sportage 4-го поколения";
        car4.engineVolume = 2.4f;
        car4.color = "красный";
        car4.productionYear = 2018;
        car4.productionCountry = "Южная Корея";
        car4.informationOfTheCar();
        System.out.println();

        Car car5 = new Car ();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.engineVolume = 1.6f;
        car5.color = "оранжевый";
        car5.productionYear = 2016;
        car5.productionCountry = "Южная Корея";
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
