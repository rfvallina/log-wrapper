package com.rfvallina.utils.logger;

public enum LoggerLevel {

	TRACE(1),
	DEBUG(2),
	INFO(3),
	WARN(4),
	ERROR(5);
	
	private int level;
	
	LoggerLevel(int level){
		this.level = level;
	}
	
	public int value(){
		return this.level;
	}
	
	public static LoggerLevel getLevel(String levelName){
		if(levelName.equals(TRACE.name()))
			return LoggerLevel.TRACE;
		else if(levelName.equals(DEBUG.name()))
			return LoggerLevel.DEBUG;
		else if(levelName.equals(INFO.name()))
			return LoggerLevel.INFO;
		else if(levelName.equals(WARN.name()))
			return LoggerLevel.WARN;
		else if(levelName.equals(ERROR.name()))
			return LoggerLevel.ERROR;
		
		return null;
	}
}
