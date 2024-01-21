package pageEvents;

import pageObjects.HomePageElements;
import pageObjects.LoginPageElements;

/*
 *1/4/2024 created by Sadesh Manaranju
 */
public class LoginPageEvents {

    public void clickLoginBtn() {
        LoginPageElements.loginBtn().click();
    }

    public void enterEmail(String email){
        LoginPageElements.emailTextBox().click();
        LoginPageElements.emailTextBox().sendKeys(email);
    }

    public void enterPassword(String password){
        LoginPageElements.passwordTextBox().click();
        LoginPageElements.passwordTextBox().sendKeys(password);
    }

    public Boolean isLoginPageLoad(){
        return LoginPageElements.loginBtn().isDisplayed();
    }

    public Boolean isErrorMessageAppear(){
        return LoginPageElements.errorMessage().isDisplayed();
    }

}
