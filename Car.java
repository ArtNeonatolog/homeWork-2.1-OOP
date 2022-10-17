public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public void informationOfTheCar () {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска" + ", сборка - " + productionCountry + ", цвет кузова - " + color + ", объем двигателя - " + engineVolume + " л.");
    }
}
