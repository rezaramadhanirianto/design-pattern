package behavioral.mediator;

/**
 * Air traffic controller is a great example of mediator pattern where the airport control room works as a mediator for communication between different flights.
 * Mediator works as a router between objects and it can have it’s own logic to provide way of communication.
 * **/
public class App {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "User");
        User user2 = new UserImpl(mediator, "Lisa");
        User user3 = new UserImpl(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hi All");

    }
}
