package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialPage extends BasePO {

    @FindBy(id = "welcome_tour_got_it")
    private WebElement gotItBTN;

    @FindBy(id = "action_done")
    private WebElement takeMeToGmailBTN;

    public InitialPage clickGotItBTN() {
        gotItBTN.click();
        return this;
    }

    public InitialPage clickTakeMeToGmailBTN() {
        takeMeToGmailBTN.click();
        return this;
    }

}
