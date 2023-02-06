package creational.abstracts;

public class Notebook extends Computer {

    private String ram, storage;

    public Notebook(String ram, String storage){
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
        return "Notebook{" +
                "ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
