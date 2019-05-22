import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNdrop extends CommonAPI {

    @Test
    public void dragnDrop() {
        Actions action = new Actions(driver);
        WebElement From1 = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        WebElement To1 = driver.findElement(By.xpath("//*[@id='bank']/li"));
        action.dragAndDrop(From1, To1).build().perform();
        sleepFor(5);
    }
}

