package creational.abstracts;

public class App {
    public static void main(String[] args){
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("2 GB","500 GB"));
        Computer notebook = ComputerFactory.getComputer(new NotebookFactory("16 GB","1 TB"));
        System.out.println("AbstractFactory PC Config::"+laptop);
        System.out.println("AbstractFactory Server Config::"+notebook);
    }
}
