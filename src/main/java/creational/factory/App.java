package creational.factory;

public class App {
    public static void main(String[] args){
        Computer laptop = ComputerFactory.getComputer("laptop", "16GB", "500GB");
        Computer notebook = ComputerFactory.getComputer("notebook", "8GB", "500GB");

        System.out.println(laptop.toString());
        System.out.println(notebook.toString());
    }
}
