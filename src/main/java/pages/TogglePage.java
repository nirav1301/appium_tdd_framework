package pages;

import base.BasePage;

public class TogglePage extends MenuPage {
    public LoginPage pressLogoutButton(){
        return new LoginPage();
    }
}
