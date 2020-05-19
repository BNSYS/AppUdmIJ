package ios;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Safari extends Capabilities {

    public static void main(String[] args) throws MalformedURLException {
        URL servUrl = new URL("http://127.0.0.1:4723/wd/hub");
        DesiredCapabilities capSafari = new DesiredCapabilities();
        capSafari.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        capSafari.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
        capSafari.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
        capSafari.setCapability(MobileCapabilityType.AUTOMATION_NAME, "xCUITest");

        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(servUrl, capSafari);
        driver.navigate().to("http://gmail.com");
        driver.findElementByName("Email").sendKeys("bnsystest");
        driver.findElementByName("Passwd").sendKeys("admin1833");
        driver.findElementByName("signIn").click();




    }




}
