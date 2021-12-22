package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {
    @AndroidFindBy(id = "edtEmail") private MobileElement userName;
    @AndroidFindBy(id = "edtPassword") private MobileElement password;
    @AndroidFindBy(id = "btnLogin") private MobileElement btnLogin;
    private HomePage readData(String username){
        return new HomePage();
    }
}
