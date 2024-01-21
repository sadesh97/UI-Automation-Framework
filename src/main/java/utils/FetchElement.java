package utils;

import base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import static base.DriverBase.driver;

/*
 * created by Sadesh Manaranju
 */
public class FetchElement {

//    public static WebElement getWebElement(String identifierType, String identifierValue) {
//        switch (identifierType) {
//            case "XPATH":
//                return DriverBase.driver.findElement(By.xpath(identifierValue));
//            case "CSS":
//                return DriverBase.driver.findElement(By.cssSelector(identifierValue));
//            case "ID":
//                return DriverBase.driver.findElement(By.id(identifierValue));
//            case "NAME":
//                return DriverBase.driver.findElement(By.name(identifierValue));
//            case "CLASSNAME":
//                return DriverBase.driver.findElement(By.className(identifierValue));
//
//            default:
//                return null;
//        }
//    }


    public static WebElement getWebElement(String identifierType, String identifierValue) {
        return switch (identifierType) {
            case "XPATH" -> driver.findElement(By.xpath(identifierValue));
            case "CSS" -> driver.findElement(By.cssSelector(identifierValue));
            case "ID" -> driver.findElement(By.id(identifierValue));
            case "NAME" -> driver.findElement(By.name(identifierValue));
            case "CLASSNAME" -> driver.findElement(By.className(identifierValue));
            default -> null;
        };
    }

    public static List<WebElement> getWebElements(String identifierType, String identifierValue) {
        return switch (identifierType) {
            case "XPATH" -> driver.findElements(By.xpath(identifierValue));
            case "CSS" -> driver.findElements(By.cssSelector(identifierValue));
            case "ID" -> driver.findElements(By.id(identifierValue));
            case "NAME" -> driver.findElements(By.name(identifierValue));
            case "CLASSNAME" -> driver.findElements(By.className(identifierValue));
            default -> null;
        };
    }


    public static void addBreak(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


}
