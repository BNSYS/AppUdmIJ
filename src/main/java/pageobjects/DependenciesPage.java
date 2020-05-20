package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DependenciesPage {
    public DependenciesPage (AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement checkBox;

    @AndroidFindBy(xpath = "(//android.widget.RelativeLayout)[2]")
    public WebElement wifiSettings;

    @AndroidFindBy(className = "android.widget.EditText")
    public WebElement textBox;

    @AndroidFindBy(className = "android.widget.Button")
    public List<WebElement> okButton;

}
