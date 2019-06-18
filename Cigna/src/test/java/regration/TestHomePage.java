package regration;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePage extends CommonAPI {


    String homeUrl ="https://www.cigna.com/";
    HomePage testHomePage;

    @BeforeClass
    public void initializing(){
        driver.get(homeUrl);
        testHomePage = PageFactory.initElements(driver,HomePage.class);

    }
    @Test
    public void testsignIn(){

        TestLogger.log(getClass().getSimpleName() + ": " +
                convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        testHomePage.clickLogInMyCigna();
    }

    @AfterMethod
    public void re_init(){
        driver.get(homeUrl);
    }


}

