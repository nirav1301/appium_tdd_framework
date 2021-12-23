package test;

import org.testng.annotations.*;
import pages.LoginPage;

import java.lang.reflect.Method;

public class HomePageTest {
    HomePageTest homePageTest;
    @Test
    public void test() {

    }

    @BeforeMethod
    public void beforeMethod(Method m) {
        homePageTest = new HomePageTest();
        System.out.println("\n" + "****** starting test:" + m.getName() + "*****" + "\n");
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
