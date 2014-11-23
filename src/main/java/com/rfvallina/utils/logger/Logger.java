package com.rfvallina.utils.logger;

public interface Logger {
	
	public void debug(final String message);
	public void info(final String message);
	public void error(final String message);
	public void trace(final String message);
	public void warn(final String message);
	
	public boolean isDebugEnabled();
	public boolean isInfoEnabled();
	public boolean isErrorEnabled();
	public boolean isTraceEnabled();
	public boolean isWarnEnabled();
}
