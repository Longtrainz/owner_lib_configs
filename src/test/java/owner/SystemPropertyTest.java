package owner;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class SystemPropertyTest {

	@Test
	@Disabled
	void systemPropertyTest() {
		Assertions.assertThat(System.getProperty("browser")).isEqualTo("firefox");
	}
}
