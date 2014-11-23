package com.fishbowl.hub.utils.logger;

import java.io.IOException;

import org.junit.Test;

import com.fishbowl.hub.utils.BaseTest;
import com.rfvallina.utils.logger.ApplicationLogger;

public class ApplicationLoggerTest extends BaseTest {

	@Test
	public void logMessageTest() throws IOException{
		ApplicationLogger logger = new ApplicationLogger();
		logMessage(logger);
	}
	
	
	private void logMessage(ApplicationLogger logger){
		if(logger.isTraceEnabled())
			logger.trace("trace enabled...");
		if(logger.isDebugEnabled())
			logger.debug("debug enabled...");
		if(logger.isInfoEnabled())
			logger.info("info enabled...");
		if(logger.isWarnEnabled())
			logger.warn("warn enabled...");
		if(logger.isErrorEnabled())
			logger.error("error enabled...");
	}
}
