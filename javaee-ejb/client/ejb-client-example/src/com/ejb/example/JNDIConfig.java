package com.ejb.example;

import java.util.Properties;

import javax.naming.Context;

public class JNDIConfig {

	public static Properties getConfigs() {
		Properties jndiProperties = new Properties();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		return jndiProperties;
	}
}
