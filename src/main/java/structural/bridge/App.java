package structural.bridge;

/**
 * Decouple an abstraction from its implementation so that the two can vary independently
 * **/
public class App {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
