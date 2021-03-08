package owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import config.MobileConfig;


public class MobileTest {
	@Test
	void testMobileConfig() {
		final MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());

		System.out.println(config.platformName());
		System.out.println(config.platformVersion());
		System.out.println(config.applicationLocation());
	}
}
