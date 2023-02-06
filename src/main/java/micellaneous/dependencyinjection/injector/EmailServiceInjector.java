package micellaneous.dependencyinjection.injector;

import micellaneous.dependencyinjection.consumer.Consumer;
import micellaneous.dependencyinjection.consumer.MyDIApplication;
import micellaneous.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
