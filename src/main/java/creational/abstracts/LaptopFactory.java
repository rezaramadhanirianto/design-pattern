package creational.abstracts;

public class LaptopFactory implements ComputerAbstractFactory {

    private String ram, hdd;

    public LaptopFactory(String ram, String hdd){
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new Laptop(ram, hdd);
    }
}
