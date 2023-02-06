package creational.abstracts;

public class NotebookFactory implements ComputerAbstractFactory {

    private String ram, hdd;

    public NotebookFactory(String ram, String hdd){
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new Notebook(ram, hdd);
    }
}
