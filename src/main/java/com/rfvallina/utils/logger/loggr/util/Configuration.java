package com.rfvallina.utils.logger.loggr.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	private Configuration() {
	}

	private final static String CONFIG_PROPERTIES = "loggr.properties";
	
	protected static String _apiKey = "";
	protected static String _logKey = "";
	protected static String _server = "";
	protected static String _version = "";
	protected static String _tags = "";
	protected static String _source = "";
	
	public static String getApiKey() {
		if (Common.IsNullOrEmpty(_apiKey)) {
			try {
				Properties props = new Properties();
				InputStream in = Configuration.class.getClassLoader().getResourceAsStream(CONFIG_PROPERTIES);
				props.load(in);
				in.close();

				if (props != null) {
					_apiKey = props.getProperty("loggr.apiKey");
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return _apiKey;
	}

	public static String getLogKey() {
		if (Common.IsNullOrEmpty(_logKey)) {
			try {
				Properties props = new Properties();
				InputStream in = Configuration.class.getClassLoader().getResourceAsStream(CONFIG_PROPERTIES);
				props.load(in);
				in.close();

				if (props != null) {
					_logKey = props.getProperty("loggr.logKey");
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return _logKey;
	}

	public static String getServer() {
		if (Common.IsNullOrEmpty(_server)) {
			try {
				Properties props = new Properties();
				InputStream in = Configuration.class.getClassLoader().getResourceAsStream(CONFIG_PROPERTIES);
				props.load(in);
				in.close();

				if (props != null) {
					_server = props.getProperty("loggr.server");
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return _server;
	}

	public static String getVersion() {
		if (Common.IsNullOrEmpty(_version)) {
			try {
				Properties props = new Properties();
				InputStream in = Configuration.class.getClassLoader().getResourceAsStream(CONFIG_PROPERTIES);
				props.load(in);
				in.close();

				if (props != null) {
					_version = props.getProperty("loggr.version");
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return _version;
	}

	public static String getTags() {
		if (Common.IsNullOrEmpty(_tags)) {
			try {
				_tags = "";

				Properties props = new Properties();
				InputStream in = Configuration.class.getClassLoader().getResourceAsStream(CONFIG_PROPERTIES);
				props.load(in);
				in.close();

				if (props != null) {
					_tags = props.getProperty("loggr.tags");
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return (_tags);
	}

	public static String getSource() {
		if (Common.IsNullOrEmpty(_source)) {
			try {
				_source = "";

				Properties props = new Properties();
				InputStream in = Configuration.class.getClassLoader().getResourceAsStream(CONFIG_PROPERTIES);
				props.load(in);
				in.close();

				if (props != null) {
					_source = props.getProperty("loggr.source");
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return (_source);
	}

}
