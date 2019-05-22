import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class iFrames extends CommonAPI {

    //@Test
    public void iframe() {
        driver.switchTo().frame(1);
        //-frameID				-frameName			-frameIndex
        WebElement element = driver.findElement(By.linkText("Sortable"));
        System.out.println(element.getText());
    }

    //@Test
    public void bestBuyPopup() {
        sleepFor(5);
        driver.findElement(By.xpath("//body/div[@role='dialog']/div[@role='document']//button[@type='button']/span[.='×']")).click();
        sleepFor(5);
        System.out.println("clicked");
    }

    @Test
    public void bedBathPopup() {
        sleepFor(5);
        driver.findElement(By.xpath("//div[@id='rclModal']/button[@title='close']")).click();
        sleepFor(5);
        System.out.println("clicked");
    }
}
