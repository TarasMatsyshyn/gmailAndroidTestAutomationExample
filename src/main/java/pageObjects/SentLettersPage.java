package pageObjects;

import driver.AndroidDriverSingleton;
import org.openqa.selenium.By;

public class SentLettersPage extends BasePO {

    public boolean isSentLetterDisplayed(String subject) {
        String xpath = String.format("//android.view.View[contains(@content-desc, '%s')]", subject);
        return AndroidDriverSingleton.getDriver().findElement(By.xpath(xpath)).isDisplayed();
    }

}
