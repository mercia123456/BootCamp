package regration;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.XMLFormatter;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"headerLoka ogoLink\"]/div")
    WebElement HomePage;
    @FindBy(xpath = "//*[@id=\"navUtility\"]/div/div/ul/li[2]/a")
    WebElement OpenAnAccount;

    public void clickOnHomePage(){
        HomePage.click();
    }
    public void clickOnOpenAnAccount(){
        OpenAnAccount.click();
    }

}
