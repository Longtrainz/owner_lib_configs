package config;

import org.aeonbits.owner.Config;


@Config.Sources("classpath:${platform}.properties")
@Config.LoadPolicy(Config.LoadType.FIRST)
//@Config.LoadPolicy(Config.LoadType.MERGE)
public interface MobileConfig extends Config {

	@Key("platform.name")
	String platformName();

	@Key("platform.version")
	String platformVersion();

	@Key("application.location")
	String applicationLocation();
}
