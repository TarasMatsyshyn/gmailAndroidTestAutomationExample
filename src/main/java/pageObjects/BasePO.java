package pageObjects;

import driver.AndroidDriverSingleton;
import org.openqa.selenium.support.PageFactory;


public class BasePO {
    public BasePO() {
        PageFactory.initElements(AndroidDriverSingleton.getDriver(), this);
    }
}
