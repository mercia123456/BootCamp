package TestRegration;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regration.HomePage;

public class TestHomePage extends CommonAPI {

       HomePage testhomepage;


        String url ="https://www.amazon.com/";

        @BeforeMethod
        public void initialization(){
            testhomepage = PageFactory.initElements(driver, HomePage.class);
            driver.get(url);
        }
        /*@Test
        public void clicksignIn(){
            testhomepage.clicksignIn();
            testhomepage.signin();
        }
        @Test
        public void clickforgetpass(){
            testhomepage.clicksignIn();
            testhomepage.forgetpass();
        }*/
        @Test
        public void searchbooks(){
            testhomepage.purchase();
        }


    }

