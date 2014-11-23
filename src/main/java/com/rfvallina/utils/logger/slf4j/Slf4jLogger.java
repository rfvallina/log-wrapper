package com.rfvallina.utils.logger.slf4j;

import org.slf4j.Logger;

public final class Slf4jLogger implements com.rfvallina.utils.logger.Logger { 
	private Logger log;
	
	public Slf4jLogger(final Logger log) { 
		this.log = log;
	}
	
	@Override
	public void debug(final String message) {
		this.log.debug(message);
	}

	@Override
	public void info(final String message) {
		this.log.info(message);
	}

	@Override
	public void error(final String message) {
		this.log.error(message);
	}

	@Override
	public void trace(final String message) {
		this.log.trace(message);
	}

	@Override
	public void warn(final String message) {
		this.log.warn(message);
	}

	@Override
	public boolean isDebugEnabled() {
		return this.log.isDebugEnabled();
	}

	@Override
	public boolean isInfoEnabled() {
		return this.log.isInfoEnabled();
	}

	@Override
	public boolean isErrorEnabled() {
		return this.log.isErrorEnabled();
	}

	@Override
	public boolean isTraceEnabled() {
		return this.log.isTraceEnabled();
	}

	@Override
	public boolean isWarnEnabled() {
		return this.log.isWarnEnabled();
	}	
}
