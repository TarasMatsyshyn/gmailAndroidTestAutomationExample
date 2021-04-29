package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComposePage extends BasePO {

    @FindBy(id = "to")
    private WebElement toIPF;

    @FindBy(id = "subject")
    private WebElement subjectIPF;

    @FindBy(id = "body")
    private WebElement letterIPF;

    @FindBy(id = "send")
    private WebElement sendBTN;

    public ComposePage typeRecipient(String recipient) {
        toIPF.sendKeys(recipient);
        return this;
    }

    public ComposePage typeSubject(String subject) {
        subjectIPF.sendKeys(subject);
        return this;
    }

    public ComposePage typeLetter(String letter) {
        letterIPF.sendKeys(letter);
        return this;
    }

    public ComposePage clickSend() {
        sendBTN.click();
        return this;
    }

}
