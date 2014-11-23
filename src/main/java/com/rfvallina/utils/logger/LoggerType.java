package com.rfvallina.utils.logger;

public enum LoggerType {
	SLF4J,
	LOGGR;

	public static LoggerType getType(final String type) {
		return LoggerType.valueOf(type.toUpperCase().trim());
	}
}
