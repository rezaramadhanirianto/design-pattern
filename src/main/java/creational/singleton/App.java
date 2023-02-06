package creational.singleton;

public class App {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 + " = " + singleton2);

        StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton2 = StaticBlockSingleton.getInstance();

        System.out.println(staticBlockSingleton1 + " = " + staticBlockSingleton2);
    }
}
