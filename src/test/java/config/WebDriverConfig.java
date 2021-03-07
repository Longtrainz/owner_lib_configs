package config;

import org.aeonbits.owner.Config;


public interface WebDriverConfig extends Config {

	@Key("webDriverUrl")
	String getWebDriverUrl();

	@Key("webDriverBrowser")
	String getWebDriverBrowser();

	@Key("baseUrl")
	String getBaseUrl();

	@Key("enabled")
	boolean isEnabled();
}
