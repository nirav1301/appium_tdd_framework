package test;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.*;
import pages.LoginPage;

import java.io.InputStream;

public class LoginTest {
    LoginPage loginPage;
    InputStream datais;
    JSONObject loginUsers;

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
    public void beforeClass() throws Exception {
        try {
            String dataFileName = "data/loginUsers.json";
            datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
            JSONTokener tokener = new JSONTokener(datais);
            loginUsers = new JSONObject(tokener);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (datais != null) {
                datais.close();
            }
        }

    }
    @AfterClass
    public void afterClass(){
        
    }

}
