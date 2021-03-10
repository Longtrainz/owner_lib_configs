package tests;

import com.codeborne.selenide.Configuration;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static tests.AttachmentsHelper.*;

import config.EnvironmentConfig;
import io.qameta.allure.selenide.AllureSelenide;


public class TestBase {
    @BeforeAll
    static void setup() {
//        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.startMaximized = true;
//        Configuration.browser = "firefox";

//        if (System.getProperty("remote_driver") != null) {
            // config for Java + Selenide
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
//            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
//            Configuration.remote = System.getProperty("remote_driver");
            Configuration.remote = "http://167.71.48.36:4444/wd/hub";

            // config for Java + Selenium
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "chrome");
//        capabilities.setCapability("browserVersion", "87.0");
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", true
//        ));
//        RemoteWebDriver driver = new RemoteWebDriver(
//                URI.create("http://selenoid:4444/wd/hub").toURL(),
//                capabilities
//        );
//        }
    }


//    static EnvironmentConfig config = ConfigFactory.create(EnvironmentConfig.class, System.getProperties());
//
//    @BeforeAll
//    public static void setUp() {
//        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
//        Configuration.browser = config.browser();
//        Configuration.browserVersion = config.browserVersion();
//        Configuration.startMaximized = true;
//
//        if (config.remoteUrl() != null) {
//            // config for Java + Selenide
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability("enableVNC", true);
//            capabilities.setCapability("enableVideo", true);
//            Configuration.browserCapabilities = capabilities;
////            Configuration.remote = config.remoteUrl();
//
//        }
//    }

    @AfterEach
    public void afterEach() {
        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser console logs", getConsoleLogs());
        if (System.getProperty("video_storage") != null)
            attachVideo();
        closeWebDriver();
    }
}
