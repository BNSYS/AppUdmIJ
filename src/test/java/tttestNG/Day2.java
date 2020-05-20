package tttestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {
    @Test(groups = "Smoke")
    public void helloTest ()
    {
        System.out.println("Helllo Day2");
    }

    @Test(dataProvider = "getUserLoginData" )
    public void byTest (String username, String password)
    {
        System.out.println("Byy Day2");
        System.out.println(username+" "+password);
    }

    @DataProvider
    public Object[][] getUserLoginData()
    {
        Object[][] userData = new Object[3][2];
        userData[0][0] = "user1";
        userData[0][1] = "pwd1";
        userData[1][0] = "user2";
        userData[1][1] = "pwd2";
        userData[2][0] = "user3";
        userData[2][1] = "pwd3";

        return userData;
    }

}
