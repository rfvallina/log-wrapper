package com.rfvallina.utils.logger.loggr;

import com.rfvallina.utils.logger.LoggerLevel;


public final class LoggrLogger implements com.rfvallina.utils.logger.Logger { 
	
	private LoggerLevel level;
	
	public LoggrLogger(final LoggerLevel level) { 
		this.level = level;
	}
	
	@Override
	public void debug(final String message) {
		Events.create().tags("debug").text(message).post();
	}

	@Override
	public void info(final String message) {
		Events.create().tags("info").text(message).post();
	}

	@Override
	public void error(final String message) {
		Events.create().tags("error").text(message).post();
	}

	@Override
	public void trace(final String message) {
		Events.create().tags("trace").text(message).post();
	}

	@Override
	public void warn(final String message) {
		Events.create().tags("warn").text(message).post();
	}

	@Override
	public boolean isDebugEnabled() {
		if(level.value() <= LoggerLevel.DEBUG.value())
			return true;
		return false;
	}

	@Override
	public boolean isInfoEnabled() {
		if(level.value() <= LoggerLevel.INFO.value())
			return true;
		return false;
	}

	@Override
	public boolean isErrorEnabled() {
		if(level.value() <= LoggerLevel.ERROR.value())
			return true;
		return false;
	}

	@Override
	public boolean isTraceEnabled() {
		if(level.value() <= LoggerLevel.TRACE.value())
			return true;
		return false;
	}

	@Override
	public boolean isWarnEnabled() {
		if(level.value() <= LoggerLevel.WARN.value())
			return true;
		return false;
	}	
}
