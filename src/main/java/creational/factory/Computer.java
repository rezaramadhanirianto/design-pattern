package creational.factory;

public abstract class Computer {
    public abstract String getRam();
    public abstract String getStorage();

    @Override
    public String toString() {
        return "Ram = " + getRam() + ", Storage = " + getStorage();
    }
}
