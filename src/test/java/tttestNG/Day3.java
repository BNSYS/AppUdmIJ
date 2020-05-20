package tttestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
    @BeforeTest
    public void initialClinout()
    {
        System.out.println("Initial ClinOUT");
    }
    @AfterTest
    public void endClinOut()
    {
        System.out.println("End ClinOUT");
    }

    @Test
    public void weblogin()
    {
        System.out.println("Web login");
    }
    @Test
    public void webLogout()
    {
        System.out.println("Web logOut");
    }

    @Test(enabled = false)
    public void mobileLogin()
    {
        System.out.println("Mobile login");
    }


    @Test(groups = "Smoke")
    public void apiLogin()
    {
        System.out.println("API Login");
    }
    @Test(groups = "Smoke", dependsOnMethods = "apiLogin")
    public void worksapi()
    {
        System.out.println("works");
    } @Test(groups = "Smoke", dependsOnMethods = {"apiLogin", "worksapi"})
    public void apiLogOut()
    {
        System.out.println("API LogOUT");
    }
}
