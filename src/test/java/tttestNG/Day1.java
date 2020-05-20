package tttestNG;

import com.beust.jcommander.Parameter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
    @BeforeMethod
    public void preconditionsD1 ()
    {
        System.out.println("Preconditions Day1");
    }

    @AfterMethod
    public void postconditionsD1 ()
    {
        System.out.println("Postconditions Day1");
    }

    @Parameters("URL")
    @Test(groups = "Smoke")
    public void helloTest ()
    {
        System.out.println("Helllo Day1");
    }

    @Parameters("URL")
    @Test(groups = "Smoke")
    public void byTest (String urlName)
    {
        System.out.println("Byy Day1");
        System.out.println(urlName);
    }
}
