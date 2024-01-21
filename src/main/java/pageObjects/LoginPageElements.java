package pageObjects;

import org.openqa.selenium.WebElement;
import utils.Constants;
import utils.FetchElement;

/*
 *1/4/2024 created by Sadesh Manaranju
 */
public interface LoginPageElements {

    String loginBtn = "//div[@class='ui fluid large blue submit button']";
    String emailTextBox = "//input[@placeholder='Email']";
    String passwordTextBox = "//input[@placeholder='Password']";

    String errorMessage = "//div[@class='header'][contains(text(),'Something went wrong')]";

    static WebElement loginBtn() {
        return FetchElement.getWebElement(Constants.xPath,loginBtn);
    }

    static WebElement emailTextBox(){
        return FetchElement.getWebElement(Constants.xPath,emailTextBox);
    }

    static WebElement passwordTextBox(){
        return FetchElement.getWebElement(Constants.xPath,passwordTextBox);
    }

    static WebElement errorMessage(){
        return FetchElement.getWebElement(Constants.xPath,errorMessage);
    }


}
