import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.URL;


public class AndroidTest {

    private AndroidDriver<WebElement> driver;

    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android");
//        capabilities.setCapability("app", "E:\\test\\zy.apk");
        capabilities.setCapability("appPackage", "com.csii.zybk.ui");
        capabilities.setCapability("appActivity", "com.zybank.mobilebank.WelcomeActivity");
//        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability("automationName","UiAutomator2");
//        capabilities.setCapability("udid", serialNumber);
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test()
    public void testCreateSession() {
        driver.findElementById("com.csii.zybk.ui:id/tv_login").click();
        driver.findElementById("com.csii.zybk.ui:id/etUsername").sendKeys("156");

    }

}
