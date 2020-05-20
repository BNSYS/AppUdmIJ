import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Capabilities {
    public static AndroidDriver<AndroidElement> androidCapabilities () throws MalformedURLException {
        File f = new File("src/test/resources");
        File fs = new File(f,"original.apk");
        URL servUrl = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2API28");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(servUrl, cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }


        public static AndroidDriver<AndroidElement> androidCapabilitiesDevice () throws MalformedURLException {
            File f = new File("src/test/resources");
            File fs = new File(f,"original.apk");
            URL servUrl = new URL("http://127.0.0.1:4723/wd/hub");

            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(servUrl, cap);

            return driver;
        }

    public static AndroidDriver<AndroidElement> androidCapabilitiesChrome () throws MalformedURLException {

        URL servUrl = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities cap = new DesiredCapabilities();
        //cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(servUrl, cap);

        return driver;
    }


    /*public static AndroidDriver<AndroidElement> androidCapabilitiesInstalledAPK () throws MalformedURLException {
        //File f = new File("src/test/resources");
        //File fs = new File(f,"original.apk");
        URL servUrl = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2API28");
        cap.setCapability(MobileCapabilityType.APP, "io.com.appium.android.apis");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        //cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(servUrl, cap);

        return driver;
    }*/

    public static AndroidDriver<AndroidElement> iOSCapabilities () throws MalformedURLException {
        File f = new File("src/test/resources");
        File fs = new File(f,"original.ipa");
        URL servUrl = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "SE");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(servUrl, cap);

        return driver;
    }


}
