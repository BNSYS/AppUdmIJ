import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageobjects.DependenciesPage;
import pageobjects.HomePage;
import pageobjects.PreferencePage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Main extends Capabilities {

    public static void main(String[] args) throws MalformedURLException {

        String ipAddress="127.0.0.1";

        AndroidDriver<AndroidElement> driver = androidCapabilities();


        HomePage driverHomePage = new HomePage(driver);
        PreferencePage driverPreference = new PreferencePage(driver);
        DependenciesPage driverDependencies = new DependenciesPage(driver);

        driverHomePage.preference.click();
        driverPreference.dependencies.click();
        driverDependencies.checkBox.click();
        driverDependencies.wifiSettings.click();
        driverDependencies.textBox.sendKeys(ipAddress);
        driverDependencies.okButton.get(1).click();

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));

        //xpath Syntax  //tagName[@attribute='value']
        //driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        //driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        //driver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']").click();
        //driver.findElementById("android:id/checkbox").click();      // android:id/checkbox
        //xpath Syntax   (//tagName[@attribute='value'])[2] handling duplicate instances
        //driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        //driver.findElementByClassName("android.widget.EditText").sendKeys(ipAddress);
        //Handling duplicate instances
        //driver.findElementsByClassName("android.widget.Button").get(1).click();
    }

}
