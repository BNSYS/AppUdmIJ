package tttestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Main {

    @Test
    public void testCaseLogin()
    {
        System.out.println("Hello");
    }
    @Test
    public void testCaseLogin2()
    {
        System.out.println("Hello");
    }
    @BeforeSuite
    public void beforeSuitSetup()
    {
        System.out.println("Initial Suit setup");
    }
    @AfterSuite
    public void afterSuitSetup()
    {
        System.out.println("End Suit setup");
    }

}
