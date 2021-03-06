package ios;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Capabilities {

    public static IOSDriver iOSCapabilities () throws MalformedURLException {
        //File f = new File("src/test/resources");
        //File fs = new File(f,"original.ipa");
        URL servUrl = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 Plus");
        //cap.setCapability(MobileCapabilityType., "13.2.1");
        //cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "xCUITest");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);

        cap.setCapability(MobileCapabilityType.APP, "/Users/admin/Desktop/UICat/UICatalog.app");
        IOSDriver driver = new IOSDriver(servUrl, cap);

        return driver;
    }

    public static IOSDriver iOSRealCapabilities () throws MalformedURLException {
        //File f = new File("src/test/resources");
        //File fs = new File(f,"original.ipa");
        URL servUrl = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone SE");
        //real device caps
//        cap.setCapability("xcodeOrgId","xxxxx");
//        cap.setCapability("xcodeSigningId","iPhone Developer");
//        cap.setCapability("udid","xxxxxx");
//        cap.setCapability("updateWDABundleId","xxxxxxx");
        //end
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        cap.setCapability(MobileCapabilityType.APP, "/Users/admin/Desktop/UICat/UICatalog.app");

        IOSDriver driver = new IOSDriver(servUrl, cap);

        return driver;
    }

}
