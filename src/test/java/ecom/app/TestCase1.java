package ecom.app;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

// Type in text in the box -> hide keyboard -> select radio button -> cllick on the drop box -> scroll the list ->
//select the country -> click the button

public class TestCase1 extends Capabilities{

    @Test
    public void loginAllValid() throws MalformedURLException {

        AndroidDriver driver = androidCapabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ivanns");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//*[@text='Female']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
        driver.findElement(By.xpath("//*[@text='Argentina']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        String headerText = driver.findElement(By.xpath("//*[@text='Products']")).getAttribute("Text");

        Assert.assertEquals(headerText, "Products");
    }
}
