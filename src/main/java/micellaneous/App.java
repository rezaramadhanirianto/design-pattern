package micellaneous;

import micellaneous.dependencyinjection.consumer.Consumer;
import micellaneous.dependencyinjection.injector.EmailServiceInjector;
import micellaneous.dependencyinjection.injector.MessageServiceInjector;
import micellaneous.dependencyinjection.injector.SMSServiceInjector;

public class App {
    public static void main(String[] args) {
        String msg = "Hi User";
        String email = "user@abc.com";
        String phone = "4088888888";
        MessageServiceInjector injector = null;
        Consumer app = null;

        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }
}
