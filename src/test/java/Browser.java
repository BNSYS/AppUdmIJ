import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;

public class Browser extends Capabilities {
    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = androidCapabilitiesChrome();
        driver.get("http://tut.by");
    }
}
