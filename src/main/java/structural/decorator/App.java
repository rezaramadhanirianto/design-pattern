package structural.decorator;

/**
 * Suppose we want to implement different kinds of cars - we can create interface Car to define the assemble method and then we can have a Basic car,
 * furthermore we can extend it to Sports car and Luxury Car.
 * **/
public class App {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
