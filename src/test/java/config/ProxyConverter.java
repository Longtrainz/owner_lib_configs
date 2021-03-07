package config;

import java.lang.reflect.Method;

import org.aeonbits.owner.Converter;


public class ProxyConverter implements Converter {


	@Override
	public Object convert(Method method, String input) {
		final String[] data = input.split(":");
		return new Proxy(data[0], Integer.parseInt(data[1]));
	}
}
