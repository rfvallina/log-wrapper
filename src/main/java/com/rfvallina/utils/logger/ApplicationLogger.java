package com.rfvallina.utils.logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.LoggerFactory;

import com.rfvallina.utils.logger.loggr.LoggrLogger;
import com.rfvallina.utils.logger.slf4j.Slf4jLogger;

public class ApplicationLogger implements com.rfvallina.utils.logger.Logger {
	private static final String LOGGER_TYPE_ARGUMENT_NOT_DEFINED = "Logger type injected value is not defined. Check your configuration script";
	private static final String LOGGER_TYPE_ARGUMENT_ERROR = "Logger type injected value is not recognized. Check your configuration script";
	private static final String CONFIG_PROPERTIES = "config.properties";

	private String type;
	private String level;

	private com.rfvallina.utils.logger.Logger _logger;

	public ApplicationLogger() {
		Properties prop = new Properties();
		InputStream in = this.getClass().getClassLoader().getResourceAsStream(CONFIG_PROPERTIES);
		try {
			try {
				prop.load(in);
			} catch (IOException e) {
				System.out.println("Error while loading " + CONFIG_PROPERTIES + ": " + e.getMessage());
				System.exit(1);
			}
			this.type = prop.getProperty("logger.type");
			this.level = prop.getProperty("logger.level");
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					System.out.println("Error while closing " + CONFIG_PROPERTIES + ": " + e.getMessage());
					System.exit(1);
				}
			}
		}
	}

	public ApplicationLogger(String type) {
		this.type = type;
	}

	private com.rfvallina.utils.logger.Logger getLogger() {
		if (type == null)
			throw new RuntimeException(LOGGER_TYPE_ARGUMENT_NOT_DEFINED);
		LoggerType loggerType = LoggerType.getType(type);

		if (null == _logger) {
			synchronized (com.rfvallina.utils.logger.Logger.class) {
				switch (loggerType) {
				case SLF4J:
					_logger = new Slf4jLogger(LoggerFactory.getLogger(this.getClass()));
					break;
				case LOGGR:
					_logger = new LoggrLogger(LoggerLevel.getLevel(this.level));
					break;
				default:
					throw new RuntimeException(LOGGER_TYPE_ARGUMENT_ERROR);
				}
			}
		}

		return _logger;
	}

	@Override
	public void debug(final String message) {
		this.getLogger().debug(message);
	}

	@Override
	public void info(final String message) {
		this.getLogger().info(message);
	}

	@Override
	public void error(final String message) {
		this.getLogger().error(message);
	}

	@Override
	public void trace(final String message) {
		this.getLogger().trace(message);
	}

	@Override
	public void warn(final String message) {
		this.getLogger().warn(message);
	}

	@Override
	public boolean isDebugEnabled() {
		return this.getLogger().isDebugEnabled();
	}

	@Override
	public boolean isInfoEnabled() {
		return this.getLogger().isInfoEnabled();
	}

	@Override
	public boolean isErrorEnabled() {
		return this.getLogger().isErrorEnabled();
	}

	@Override
	public boolean isTraceEnabled() {
		return this.getLogger().isTraceEnabled();
	}

	@Override
	public boolean isWarnEnabled() {
		return this.getLogger().isWarnEnabled();
	}
}
