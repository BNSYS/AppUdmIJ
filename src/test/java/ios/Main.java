package ios;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Main extends Capabilities {

    public static void main(String[] args) throws MalformedURLException {

        IOSDriver<IOSElement> driver = iOSCapabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByAccessibilityId("Alert Views").click();
        //driver.findElementByXPath("//*[@value='Text Entry']").click();
        driver.findElementByName("Text Entry").click();
        //driver.findElementByXPath("//*[@type:'XCUIElementTypeOther']").sendKeys("Hihellommmmm");
        driver.findElementByAccessibilityId("OK").click();
        //driver.findElementByName("UICatalog").click();
        driver.navigate().back();

        // Scrolling new version
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "up");
        //scroll to element
        //params.put("element", ((RemoteWebElement) element).getId());
        js.executeScript("mobile: swipe", params);

        driver.findElementByAccessibilityId("Steppers").click();
        driver.findElementByName("Increment").click();
        driver.findElementByName("Increment").click();
        System.out.println(driver.findElementsByClassName("XCUIElementTypeStaticText").get(1).getText());

        driver.navigate().back();

        driver.findElementByAccessibilityId("Picker View").click();
        driver.findElementByAccessibilityId("Green color component value").sendKeys("235");
        driver.findElementByAccessibilityId("Red color component value").sendKeys("50");
        driver.findElementByAccessibilityId("Blue color component value").sendKeys("130");

        driver.navigate().back();



// Scrolling old version
//        Dimension size = driver.manage().window().getSize();
//        int x = size.getWidth()/2;
//        int startY = (int) (size.getHeight()*0.60);
//        int endY = (int) (size.getHeight()*0.10);
//        driver.swipe(x, startY, x, endY, 200);


    }
}
