package creational.factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd){
        if("Laptop".equalsIgnoreCase(type)) return new Laptop(ram, hdd);
        else if("Notebook".equalsIgnoreCase(type)) return new Notebook(ram, hdd);

        return null;
    }
}
