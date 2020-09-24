package devicesFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class BrowserStack implements  IDevice {

    public static String userName = "USER";
    public static String accessKey = "PWD";

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("project", "UCB Deiplopmado");
        caps.setCapability("build", "V0.1");
        caps.setCapability("name", "Contact Manager");
        caps.setCapability("app", "bs://422a50b8f837769ac638d6e4bb52255d72d813e9");

        AppiumDriver driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
        return driver;
    }
}

