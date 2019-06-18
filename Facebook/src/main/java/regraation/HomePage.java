package regraation;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSException;

import java.util.logging.XMLFormatter;

public class HomePage extends CommonAPI {

   @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement Email;
   @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement Password;
   @FindBy(xpath = "//*[@id=\"u_0_a\"]")
    WebElement LogIn;
   @FindBy(name ="firstname")
    WebElement FirstName;
   @FindBy(name = "lastname")
    WebElement LastName;
   @FindBy(xpath = "//*[@id=\"u_0_j\"]")
    WebElement MobileNumber;
   @FindBy(xpath = "//*[@id=\"u_0_q\"]")
    WebElement NewPassword;
   @FindBy(id = "month")
    WebElement Month;
   @FindBy(id = "day")
    WebElement Day;
   @FindBy(id = "year")
    WebElement Year;

public void clickOnEmail() throws InterruptedException{
    Email.click();
    Thread.sleep(5000);
}
public void clickOnPassword(){
    Password.click();

}
public void clickOnLogIn(){
    LogIn.click();

}
public void clickOnFirstName(){
    FirstName.click();

}
public void clickOnLastName(){
    LastName.click();

}
public void clickOnMobileNumber(){
    MobileNumber.click();

}
public void clickOnNewPassword()
{
    NewPassword.click();
}
public void clickOnMonth(){
    Month.click();

}
public void clickOnDay(){
    Day.click();

}public void clickOnYear(){
    Year.click();

}


}


