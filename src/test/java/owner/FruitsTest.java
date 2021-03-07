package owner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import config.FruitsConfig;


public class FruitsTest {
	@Test
	void testFruits() {
		FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());

		assertThat(config.getFruits()).containsExactlyInAnyOrder("banana","apple", "orange");
	}
}
