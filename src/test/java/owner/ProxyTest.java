package owner;

import static org.assertj.core.api.Assertions.assertThat;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import config.ProxyConfig;


public class ProxyTest {

	@Test
	void testProxy() {
		final ProxyConfig config = ConfigFactory.create(ProxyConfig.class, System.getProperties());

		assertThat(config.host()).isEqualTo("proxy.company.com");
		assertThat(config.port()).isEqualTo(4444);
		assertThat(config.enabled()).isEqualTo(true);
	}
}
