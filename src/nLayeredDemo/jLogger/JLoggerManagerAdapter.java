package nLayeredDemo.jLogger;

import nLayeredDemo.core.JLoggerService;

public class JLoggerManagerAdapter implements JLoggerService {

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager=new JLoggerManager();
		manager.log(message);
		
	}

}
