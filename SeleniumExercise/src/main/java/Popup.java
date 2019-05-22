import base.CommonAPI;
import org.testng.annotations.Test;

public class Popup extends CommonAPI {

    //web based popup
    @Test
    public void popup() {
        driver.switchTo().alert().accept();
        //dismiss();		-accept();		-getText();		-sendKeys();

    }
}
