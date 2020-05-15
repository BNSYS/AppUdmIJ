import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Capabilities {
    public static AndroidDriver<AndroidElement> androidCapabilities () throws MalformedURLException {
        File f = new File("src/test/resources");
        File fs = new File(f,"original.apk");
        URL servUrl = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2API28");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(servUrl, cap);

        return driver;
    }

}
