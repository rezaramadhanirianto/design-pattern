package micellaneous.dependencyinjection.injector;

import micellaneous.dependencyinjection.consumer.Consumer;
import micellaneous.dependencyinjection.consumer.MyDIApplication;
import micellaneous.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
