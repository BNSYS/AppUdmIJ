import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Main extends Capabilities {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = androidCapabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']").click();

       // android:id/checkbox
    }

}
