package config;

import org.aeonbits.owner.Config;


public interface ReturnTypes extends Config {

	@Key("double")
	double getDouble();

	@Key("int")
	double getInt();

	@Key("boolean")
	double getBoolean();

	@Key("String")
	double getString();

	@Key("long")
	double getLong();

}
