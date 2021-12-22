package test;

import org.testng.annotations.*;
import pages.LoginPage;

public class LoginTest {
    LoginPage loginPage;

    @Test
    public void test() {

    }

    @BeforeMethod
    public void beforeMethod() {
        loginPage = new LoginPage();
    }

    @AfterMethod
    public void afterMethod() {

    }

    @BeforeClass
    public void beforeClass() {

    }

    @AfterClass
    public void afterClass() {

    }
}
