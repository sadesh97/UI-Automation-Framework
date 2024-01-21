package pageObjects;

import org.openqa.selenium.WebElement;
import utils.Constants;
import utils.FetchElement;

/*
 *1/4/2024 created by Sadesh Manaranju
 */
public interface HomePageElements {

    String loginBtn = "//span[@class='icon icon-xs mdi-chart-bar']";

    static WebElement loginBtn() {
        return FetchElement.getWebElement(Constants.xPath, HomePageElements.loginBtn);
    }


}
