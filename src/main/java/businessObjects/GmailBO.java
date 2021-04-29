package businessObjects;

import pageObjects.ComposePage;
import pageObjects.InitialPage;
import pageObjects.IncomeLettersPage;
import pageObjects.SentLettersPage;

public class GmailBO {

    private InitialPage initialPage;
    private ComposePage composePage;
    private IncomeLettersPage incomeLettersPage;
    private SentLettersPage sentLettersPage;

    public GmailBO() {
        initialPage = new InitialPage();
        composePage = new ComposePage();
        incomeLettersPage = new IncomeLettersPage();
        sentLettersPage = new SentLettersPage();
    }

    public GmailBO skipInitialPage() {
        initialPage
                .clickGotItBTN()
                .clickTakeMeToGmailBTN();
        return this;
    }

    public GmailBO sendLetter(String recipient, String subject, String body) {
        incomeLettersPage.clickComposeBTN();
        composePage
                .typeRecipient(recipient)
                .typeSubject(subject)
                .typeLetter(body)
                .clickSend();
        return this;
    }

    public GmailBO openSentLetters(){
        incomeLettersPage
                .clickNavigationDrawerBTN()
                .clickSentBTN();
        return this;
    }

    public boolean isLetterSent(String subject) {
        return sentLettersPage.isSentLetterDisplayed(subject);
    }
}
