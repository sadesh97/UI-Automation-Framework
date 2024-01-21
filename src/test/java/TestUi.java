import api.endpoints.Routes;
import api.payloads.User;
import api.utilities.RequestUtil;
import api.utilities.ResponseUtil;
import base.DriverBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.FetchElement;

/*
 created by Sadesh Maheeshakya
 */
public class TestUi extends DriverBase {

    static HomePageEvents homePageEvents = new HomePageEvents();
    static LoginPageEvents loginPageEvents = new LoginPageEvents();

    @Test
    public static void test1() {
        SoftAssert softAssert = new SoftAssert();

        homePageEvents.clickLoginBtn();
        softAssert.assertTrue(loginPageEvents.isLoginPageLoad());
        softAssert.assertAll();



    }

    @Test
    public static void test2() {
        SoftAssert softAssert = new SoftAssert();

        homePageEvents.clickLoginBtn();
        FetchElement.addBreak();
        loginPageEvents.enterEmail("sadeMana");
        loginPageEvents.enterPassword("1234");
        loginPageEvents.clickLoginBtn();
        FetchElement.addBreak();
        softAssert.assertTrue(loginPageEvents.isErrorMessageAppear());
        softAssert.assertAll();

// TEST API
        System.out.println("API used in here-----------------------------------------");
        User user = new User();
        user.setId(1);
        user.setUsername("sadeshM");
        user.setFirstName("Sade");
        user.setLastName("Mana");

        //create
        Response response = RequestUtil.commonPOSTRequest(user, Routes.createUser);
        softAssert.assertEquals(ResponseUtil.getResponseCode(response), "200", "Invalid response code");

        //read
        Response response1 = RequestUtil.commonGETRequest("userName", user.getUsername(), Routes.getUser);
        softAssert.assertEquals(ResponseUtil.getResponseCode(response1), "200", "Invalid response code");
        softAssert.assertEquals(ResponseUtil.getValueFromResponse(response1, "username"), user.getUsername(), "Invalid UserName");

    }


}
