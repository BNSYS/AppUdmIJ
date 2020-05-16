import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class UIAtom extends Capabilities {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = androidCapabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//locating an element by UIAutomator  driver.findElementsByAndroidUIAutomator("atribute("value")")
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
// validating clickable status of object driver.findElementsByAndroidUIAutomator("new UiSelector().property(true)");
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

    }
}
