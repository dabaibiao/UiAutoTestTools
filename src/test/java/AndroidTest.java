import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;
import java.io.File;
import java.net.URL;


public class AndroidTest {

    private AndroidDriver<WebElement> driver;

    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", "");
        capabilities.setCapability("appPackage", "io.appium.android.apis");
        capabilities.setCapability("appActivity", ".ApiDemos");
//        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        driver = new AndroidDriver<WebElement>(new URL(""), capabilities);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test()
    public void testCreateSession() {
//        String activity = driver.currentActivity();
//        String pkg = driver.getCurrentPackage();
    }

}
