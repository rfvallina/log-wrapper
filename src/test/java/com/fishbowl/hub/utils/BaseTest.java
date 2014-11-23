package com.fishbowl.hub.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;

public abstract class BaseTest {

	protected static final String CONFIG_PROPERTIES = "config.properties";
	protected Properties prop;

	@Before
	public void init() throws IOException {
		this.prop = new Properties();
		InputStream is = this.getClass().getClassLoader().getResourceAsStream(CONFIG_PROPERTIES);
		this.prop.load(is);
		is.close();
	}

	@After
	public void end() {	}
}
