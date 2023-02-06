package micellaneous.dependencyinjection.consumer;

import micellaneous.dependencyinjection.service.MessageService;

public class MyDIApplication implements Consumer{

	private MessageService service;
	
	public MyDIApplication(MessageService svc){
		this.service=svc;
	}
	
	public MyDIApplication(){}
	
	public void setService(MessageService service) {
		this.service = service;
	}

	@Override
	public void processMessages(String msg, String rec){
		this.service.sendMessage(msg, rec);
	}

}
