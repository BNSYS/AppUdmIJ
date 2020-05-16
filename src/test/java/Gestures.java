import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.WebElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Gestures extends Capabilities {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = androidCapabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        //Tap
        TouchAction t = new TouchAction(driver);

        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
        t.tap(tapOptions().withElement(element(expandList))).perform();

        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();

        //Long Tap
        WebElement popUp = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        t.longPress(longPressOptions().withElement(element(popUp)).withDuration(ofSeconds(4))).release().perform();
        //System.out.println(driver.findElementById("android:id/title").isDisplayed());

        driver.findElementByXPath("//*[@text='Sample action']").click();
        driver.navigate().back();
        driver.navigate().back();
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        driver.findElementByXPath("//*[@text='Views']").click();
        driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
        driver.findElementByXPath("//*[@text='2. Inline']").click();
        driver.findElementByXPath("//*[@content-desc='9']").click();

        //Swipe

    }

}
