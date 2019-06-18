package regration;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    ///Page Object Model

    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a")
    public static WebElement LogInToMyCigna;

    @FindBy(xpath = "//*[@id=\"username\"]")
    public static WebElement Username;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public static WebElement Password;

    @FindBy(xpath = "//*[@id=\"loginbutton\"]")
    public static WebElement LogIn;

    @FindBy(xpath = "//*[@id=\"register\"]")
    public static WebElement Register;

    //write method


    public void clickLogInMyCigna() {
        LogInToMyCigna.click();

    }

    public void writeUsername(String username) {


    }

    public void writePassWord(String password) {


    }

    public void clickClogIN() {
        LogIn.click();
    }

    public void clickRegister(){
        Register.click();
    }


}
