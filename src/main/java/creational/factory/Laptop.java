package creational.factory;

public class Laptop extends Computer {

    private String ram, storage;

    public Laptop(String ram, String storage){
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public String getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
