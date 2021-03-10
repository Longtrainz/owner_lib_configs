package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${environment}.properties")
public interface EnvironmentConfig extends Config {

	@Key("browser")
	String browser();

	@Key("browser.version")
	String browserVersion();

	@Key("remote.url")
	String remoteUrl();

	@Key("video.storage")
	String videoStorage();
}
