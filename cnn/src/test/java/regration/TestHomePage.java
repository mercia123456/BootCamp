package regration;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class TestHomePage extends CommonAPI {

    HomePage homepage;
    String url = "https://www.cnn.com/";
    HomePage homePage;

    @BeforeClass
    public void initialize() {
        driver.get(url);
        homePage = PageFactory.initElements(driver, HomePage.class);

    }

    @AfterClass
    public void init() {
        driver.get(url);
    }

    @Test
    public void homebuttontest() {
        TestLogger.log(getClass().getSimpleName() + " " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + " " + "Veryfy Home Button");
        homePage.setHomebotton();
    }

    @Test
    public void menubtn() throws Exception {
        homePage.gotoMenu();
        driver.navigate().to(url);
    }

    @Test
    public void pageTech() throws Exception {
        homePage.getBusinessPage();
    }

    @Test
    public void glaceAtMarket() throws Exception {
        homePage.seeMarketaGlance();
    }

    @Test
    public void imageTesting1() throws Exception {
        homePage.image1();
    }

    @Test
    public void nikeTraging() throws Exception {
        homePage.seeNikeTrade("Nike");
        driver.navigate().to(url);
    }

    @Test
    public void tradeScrolTest() throws Exception {
        homePage.tradeScrolclick();
    }

    @Test
    public void testTopTitleImage() throws Exception {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        homePage.setTopTitleImage();
    }

    @Test
    public void testCraditCard() throws Exception {
        homePage.craditCard();
    }

    /* @Test
     public void testPaidContent()throws Exception{
         homepage.paidContentImage();
     }
 */
    @Test
    public void testSetStorisSix() {
        homePage.setStorisSix();
    }

    @Test
    public void testSetTopStoris() {
        homePage.setTopStoris();
    }



}