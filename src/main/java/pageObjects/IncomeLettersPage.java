package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomeLettersPage extends BasePO {

    @FindBy(id = "compose_button")
    private WebElement composeBTN;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private WebElement navigationDrawerBTN;

    @FindBy(xpath = "//android.widget.LinearLayout//android.widget.TextView[@text='Sent']")
    private WebElement sentBTN;


    public IncomeLettersPage clickComposeBTN() {
        composeBTN.click();
        return this;
    }

    public IncomeLettersPage clickNavigationDrawerBTN() {
        navigationDrawerBTN.click();
        return this;
    }

    public IncomeLettersPage clickSentBTN() {
        sentBTN.click();
        return this;
    }

}
