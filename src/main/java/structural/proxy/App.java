package structural.proxy;

/**
 * Let’s say we have a class that can run some command on the system.
 * Now if we are using it, its fine but if we want to give this program to a client application,
 * it can have severe issues because client program can issue command to delete some system files or change some settings that you don’t want.
 * Here a proxy class can be created to provide controlled access of the program.
 * **/
public class App {
    public static void main(String[] args){
        CommandExecutor executor = new CommandExecutorProxy("User", "pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf something.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }
}
