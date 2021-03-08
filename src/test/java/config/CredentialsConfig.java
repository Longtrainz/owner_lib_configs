package config;

import org.aeonbits.owner.Config;


@Config.Sources({
		"file:C:/Users/Vladyslav_Bukach/Downloads/test/credentials.properties",
		"classpath:credentials.properties",
})
public interface CredentialsConfig extends Config {

	@Key("username")
	String username();

	@Key("password")
	String password();
}
