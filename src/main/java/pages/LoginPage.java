package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends MenuPage {

    @AndroidFindBy(id = "edtEmail") private MobileElement userName;
    @AndroidFindBy(id = "edtPassword") private MobileElement password;
    @AndroidFindBy(id = "btnLogin") private MobileElement btnLogin;
    public LoginPage enterUsername(String username){
        return this;
    }
    public LoginPage enterPassword(String password){
        return this;
    }
    public HomePage login(String username,String password){
        enterPassword("data");
        enterUsername("data");
        return  new HomePage();
    }
}
