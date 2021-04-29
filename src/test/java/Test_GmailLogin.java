import static utils.DateUtil.getSystemCurrentDate;

import businessObjects.GmailBO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_GmailLogin extends BaseTest {

    private GmailBO gmailBO = new GmailBO();

    private String recipient = "thebest.testacc@gmail.com";
    private String subject = "Super test subject " + getSystemCurrentDate();
    private String body = "Super text body";

    @Test
    public void verifyLetterSent() {
        gmailBO
                .skipInitialPage()
                .sendLetter(recipient, subject, body)
                .openSentLetters();
        Assert.assertEquals(true, gmailBO.isLetterSent(subject));
    }
}
