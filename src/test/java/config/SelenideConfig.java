package config;

import org.aeonbits.owner.Config;


public interface SelenideConfig extends Config {

	@Key("webDriverBrowser")
	@DefaultValue("firefox")
	String getBrowser();
}
