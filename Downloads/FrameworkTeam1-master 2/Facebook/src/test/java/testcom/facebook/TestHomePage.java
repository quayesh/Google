package testcom.facebook;

import base.CommonAPI;
import com.Facebook.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestHomePage extends CommonAPI {

    HomePage home;
    String url = "http://www.facebook.com//";

    @BeforeClass
    public void initialization() { home= PageFactory.initElements(driver, HomePage.class);
    }
    @AfterMethod
    public void reCap() {
        driver.get(url);
    }

    @Test(enabled = false)
    public void checkValidLogIn() {
        String success = home.validLogIn("email","pass");
        Assert.assertEquals(success, "https://www.facebook.com//");
        System.out.println("Sign in with valid credential passed");
    }
    @Test
    public void clickEvent1() {
        home.setEvent1();
    }
    @Test
    public void clickEvent2() {
        home.setEvent2();
    }
    @Test
    public void clickEvent3() {
        home.setEvent2();
    }























}

