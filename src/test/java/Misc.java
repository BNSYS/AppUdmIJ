import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Misc extends Capabilities {

    public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver<AndroidElement> driver=androidCapabilitiesDevice();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.currentActivity());
        System.out.println(driver.getContext());
        //views - Native , Hybrid, Webview
        System.out.println(driver.getOrientation());
        System.out.println(driver.isDeviceLocked());
        //  driver.hideKeyboard();
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
        //driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

}
