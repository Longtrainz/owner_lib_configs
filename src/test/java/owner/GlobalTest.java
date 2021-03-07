package owner;

import static org.assertj.core.api.Assertions.assertThat;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import config.GlobalConfig;
import config.Proxy;


public class GlobalTest {


	@Test
	void testConfig() {
 		final GlobalConfig config = ConfigFactory.create(GlobalConfig.class, System.getProperties());

 		final Proxy proxy = config.getProxy();

 		assertThat(proxy.host).isEqualTo("proxy.company.com");
 		assertThat(proxy.port).isEqualTo(4444);
	}
}
