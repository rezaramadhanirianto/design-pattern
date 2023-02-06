package behavioral.state;

/**
 * Suppose we want to implement a TV Remote with a simple button to perform action. If the State is ON, it will turn on the TV and if state is OFF, it will turn off the TV.
 * **/
public class App {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();


        context.setState(tvStopState);
        context.doAction();

    }
}
