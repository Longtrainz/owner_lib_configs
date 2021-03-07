package config;

import org.aeonbits.owner.Config;


public interface GlobalConfig extends Config {

	@Key("proxy")
	@ConverterClass(ProxyConverter.class)
	@DefaultValue("proxy.company.com:4444")
	Proxy getProxy();

}
