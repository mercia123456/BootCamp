package regration;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    HomePage testhomepage;


    String url ="https://online.citi.com";

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
    public void clickOnHomePage()throws InterruptedException {
        testhomepage.clickOnHomePage();
    }
    @Test
    public void clickOnOpenAnAccount(){
        testhomepage.clickOnOpenAnAccount();
    }


}
