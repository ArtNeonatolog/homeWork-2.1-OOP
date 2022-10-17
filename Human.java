public class Human {
    String name;
    int age;
    String cityOfLife;
    String position;

    public int yearOfBirth () {
        age = 2022 - age;
        return age;
    }
    public void informationOgHuman () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfLife + ". Я родился (ась) в " + age + " году. Будем знакомы!");
    }

    public void informationOgHuman2 () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + cityOfLife + ". Я родился (ась) в " + age + " году. Я работаю на должности " + position + ". Будем знакомы!");
    }
}
