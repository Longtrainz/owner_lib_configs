package owner;

import static com.codeborne.selenide.Selenide.open;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;

import config.SelenideConfig;


public class SelenideTest {

	@BeforeEach
	public void initBrowser() {
		final SelenideConfig config = ConfigFactory.create(SelenideConfig.class, System.getProperties());
		Configuration.browser = config.getBrowser();
	}

	@Test
	void testOpenPage() {
		open("https://github.com");
		//additional checks
	}

	@Test
	void testSecondPage() {
		open("https://github.com");
		//additional checks
	}
}
