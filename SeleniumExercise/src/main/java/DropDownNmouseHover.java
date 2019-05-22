import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownNmouseHover extends CommonAPI {

    //@Test
    public void testDropDown() {
        Select select = new Select(driver.findElement(By.xpath("/html//select[@id='gh-cat']")));
        select.selectByIndex(1);
        sleepFor(5);
        //select.selectByValue(Value);
        //select.selectByVisibleText(Text);
    }

    //@Test
    public void testMouseHover() {
        WebElement element = driver.findElement(By.linkText("Fashion"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        driver.findElement(By.linkText("Jewelry")).click();
        sleepFor(5);
    }


    @Test
    public void mouseScroll() {
        //to scroll to exact place
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,500)");

        //to scroll to view
        WebElement link = driver.findElement(By.linkText("Start selling"));
        js.executeScript("arguments[0].scrollIntoView(true);", link);
        sleepFor(10);
    }
}
