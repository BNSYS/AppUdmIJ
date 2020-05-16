import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions; //added
import static io.appium.java_client.touch.LongPressOptions.longPressOptions; //added
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import org.openqa.selenium.WebElement;
import static java.time.Duration.ofSeconds; //added
import static io.appium.java_client.touch.offset.ElementOption.element; //added

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
        t.longPress(longPressOptions().withElement(element(popUp)).withDuration(ofSeconds(2))).release().perform();
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
        //Script:long press on element -> 2sec time out -> move to another element  -> release
        WebElement swipeStart = driver.findElementByXPath("//*[@content-desc='15']");
        WebElement swipeEnd = driver.findElementByXPath("//*[@content-desc='45']");
        TouchAction swipe = new TouchAction(driver);
        swipe.longPress(longPressOptions().withElement(element(swipeStart)).withDuration(ofSeconds(2))).moveTo(element(swipeEnd)).release().perform();

        //Scrolling

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");

        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        //Drag n Dropp
        //Scenario : Long press -> move to the destanation -> release
        driver.findElementByXPath("//*[@text='Views']").click();
        driver.findElementByXPath("//*[@text='Drag and Drop']").click();

        TouchAction dragNdrop = new TouchAction(driver);
        WebElement dragNdropStart = driver.findElementsByClassName("android.view.View").get(0);
        WebElement dragNdropEnd = driver.findElementsByClassName("android.view.View").get(1);

        dragNdrop.longPress(longPressOptions().withElement(element(dragNdropStart))).moveTo(element(dragNdropEnd)).release().perform();
        //Shortcut way to do it if no need to use internal waits and others
        // dragNdrop.longPress(element(dragNdropStart)).moveTo(element(dragNdropEnd)).release().perform();

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));



    }

}
