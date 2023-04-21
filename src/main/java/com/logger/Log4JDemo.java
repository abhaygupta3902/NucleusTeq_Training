package com.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Log4JDemo {
	
	static Logger logger =(Logger) LogManager.getLogger(Log4JDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	
		logger.trace("This is trace message");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn msg");
		logger.error("This is error msg");
		logger.fatal("This is fatal msg");
	}

}
