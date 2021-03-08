package owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import config.CredentialsConfig;


public class CredentialsTest {

	@Test
	void testCredentials() {
		CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class, System.getProperties());

		System.out.println(config.username());
		System.out.println(config.password());

	}
}

