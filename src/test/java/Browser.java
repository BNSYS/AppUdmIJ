import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.springframework.util.Assert;

import java.net.MalformedURLException;

public class Browser extends Capabilities {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = androidCapabilitiesChrome();
//        //driver.get("http://tut.by");
//        driver.get("http://facebook.com");
//        driver.findElementByXPath("//*[@id='m_login_email']").sendKeys("qwerty");
//        driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("123");
//        //driver.findElementByName("pass").sendKeys("12345");
//        driver.findElementByXPath("//button[@value='Войти']").click();

        driver.get("http://cricbuzz.com");
        driver.findElementByXPath("//a[@href='#menu']").click();
        driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
        System.out.println(driver.getCurrentUrl());

        //Scroll in Web foems  min 250
        JavascriptExecutor scrollWebForm = (JavascriptExecutor) driver;
        scrollWebForm.executeScript("window.scrollBy(0,480)","");
        Assert.isTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"), "Is a header");



    }
}
