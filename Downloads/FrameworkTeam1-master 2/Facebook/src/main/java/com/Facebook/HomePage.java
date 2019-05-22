package com.Facebook;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {
    @FindBy(how = How.LINK_TEXT, using = "Log in")
    public WebElement logInButton;
    @FindBy(how = How.ID, using = "userid")
    public WebElement userName;
    @FindBy(how = How.XPATH, using = "//*[@id='pass']")
    public WebElement password;
    @FindBy(id = "logBt")
    public WebElement submitLogIn;
    public WebElement validLogIn;
    @FindBy(how =How.CLASS_NAME, using = "_6d9w")
    WebElement Event1;
    @FindBy(how =How.CLASS_NAME, using = "_6d9w")
    WebElement Event2;
    @FindBy(how =How.CLASS_NAME, using = "_6d9w")
    WebElement Event3;









    public String validLogIn(String user, String pass) {
        logInButton.click();
        userName.sendKeys(user);
        password.sendKeys(pass);
        submitLogIn.click();
        return driver.getCurrentUrl();

    }
    public void setEvent1(){
        Event1.click();
    }
    public void setEvent2(){
        Event2.click();
    }
    public void setEvent3(){
        Event3.click();
    }







}
