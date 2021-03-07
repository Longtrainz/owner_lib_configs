package config;

import java.util.List;

import org.aeonbits.owner.Config;


public interface FruitsConfig extends Config {

	@Key("fruits")
	@Separator(",")
	@DefaultValue("banana,apple,orange")
	List<String> getFruits();
}
