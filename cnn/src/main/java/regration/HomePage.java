package regration;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

import static base.CommonAPI.convertToString;

public class HomePage extends CommonAPI {

    /* @FindBy(css = ".search_button.cnn-icon")
   WebElement searchtab;
   @FindBy(id= "search-input.cnn-icon")
   WebElement searchInput;
   */
    @FindBy(xpath = "//*[@class='nav__logo']")
    WebElement Homebotton;

    public void setHomebotton() {
        String text = Homebotton.getTagName();
        System.out.println(text);
        Assert.assertEquals(text, "a");
    }

    /*public void clickonsearch(){
        searchtab.click();
    }
*/
    @FindBy(css = "#menu")
    WebElement selectingMenu;

    @FindBy(xpath = "//div[@id='nav']/div/div[2]/a[2]")
    WebElement clickOnTech;

    @FindBy(xpath = "//a[@class='nav-menu-links__link' and text()='Markets']")
    WebElement marketInBuseness;

    @FindBy(css = "button:nth-child(2)>svg>path")
    WebElement tredeScrolling;

    @FindBy(id = "downshift-0-input")
    WebElement inputSearchInBusiness;

    @FindBy(xpath = "//img[@class='media__image']")
    WebElement testImage;

    @FindBy(xpath = "//section[@id='business-zone-1']/div[2]/div/div/ul/li/article/div/div/a/img")
    WebElement topTitleImage;

    @FindBy(css = "//label[text()='Credit Cards']")
    WebElement craditCardChosing;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-2.cn-container_F95CD326-B566-A6B8-7773-DD5C7E528839.cn--expandable.cn--collapsed li:nth-child(6)")
    WebElement storisSix;

    @FindBy(css = ".cn.cn-list-xs.cn--idx-2.cn-container_F95CD326-B566-A6B8-7773-DD5C7E528839.cn--expandable.cn--collapsed")
    WebElement topStoris;



    public void gotoMenu() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Menu Button in Business Page");
        selectingMenu.click();
    }

    public void getBusinessPage() {
        clickOnTech.click();
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Tech Button in Business Page");
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void seeMarketaGlance() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Go To Market in Business Page");
        marketInBuseness.click();
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void image1() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify IMAGE in Business Page");
        boolean img = testImage.isDisplayed();
        Assert.assertTrue(img);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void seeNikeTrade(String locator) throws Exception {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Search for" + locator);
        inputSearchInBusiness.sendKeys(locator, Keys.ENTER);
        driver.navigate().to("https://www.cnn.com/business");
        Thread.sleep(2000);
    }

    public void tradeScrolclick() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Trade Button in Business Page");
        boolean selected = tredeScrolling.isDisplayed();
        Assert.assertTrue(selected);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setTopTitleImage() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Top IMAGE in Business Page");
        boolean titleVideo = topTitleImage.isDisplayed();
        Assert.assertTrue(titleVideo);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void craditCard() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Credit Card Button in Business Page");
//        craditCardChosing.click();
        String str = craditCardChosing.getText();
        System.out.println(str);
        Assert.assertEquals(str, "Credit Cards");
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setStorisSix() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Content in Health Page");
        String str = storisSix.getText();
        Assert.assertEquals(str, str);
        driver.navigate().to("https://www.cnn.com/business");
    }

    public void setTopStoris() {
        TestLogger.log(getClass().getSimpleName() + "  " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + "-> " + "Verify Top Stories in Health Page");
        String st = topStoris.getText();
        System.out.println(st);
        driver.navigate().to("https://www.cnn.com/business");
    }






}
