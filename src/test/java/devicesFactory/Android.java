package devicesFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android  implements IDevice{
    private AppiumDriver driver;
    @Override
    public AppiumDriver create() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Hugo Aruni (Galaxy A5)");
        capabilities.setCapability("platformVersion","6");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","ui.HomeActivity");
        capabilities.setCapability("platformName","Android");


        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        return driver;
    }
}
