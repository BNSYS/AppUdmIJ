package ecom.app;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

//No input in to  the text box -> login button click

public class TestCase2 extends Capabilities{
    @Test
    public void toastMsgOnEmptyNameLogin() throws MalformedURLException {

        AndroidDriver driver = androidCapabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        String toastMSG = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");

        Assert.assertEquals(toastMSG,"Please enter your name");
         //name attribute of toast will have a toast msg
    }
}
