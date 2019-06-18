package testRegration;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regraation.HomePage;

public class TestHomePage extends CommonAPI {

    HomePage testhomepage;


    String url ="https://www.facebook.com/";

    @BeforeMethod
    public void initialization(){
        testhomepage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }
    @AfterMethod
    public void reCap() {
        driver.get(url);
    }

    @Test
    public void clickONEmail()throws InterruptedException {
        testhomepage.clickOnEmail();
    }

    @Test
    public void clickOnPassword() {
       testhomepage.clickOnPassword();
    }

    @Test
    public void clickOnLogIn() {
       testhomepage.clickOnLogIn();

    }
    @Test
    public void clickOnFirstName() {
        testhomepage.clickOnFirstName();


    }
    @Test
    public void clickOnLastName(){
        testhomepage.clickOnLastName();

    }
    @Test
    public void clickOnMobileNumber(){
        testhomepage.clickOnMobileNumber();
    }
    @Test
    public void clickOnNewPassword(){
        testhomepage.clickOnNewPassword();

    }
    @Test
    public void clickOnMonth(){
        testhomepage.clickOnMonth();

    }
    @Test
    public void clickOnDay(){
        testhomepage.clickOnDay();

    }
    @Test
    public void clickOnYear(){
        testhomepage.clickOnYear();
    }





}
