package creational.builder;

public class App {
    public static void main(String[] args){
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .build();

        System.out.println(comp);
    }
}
