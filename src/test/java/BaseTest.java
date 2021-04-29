import driver.AndroidDriverSingleton;
import org.testng.annotations.AfterSuite;

public class BaseTest {

    @AfterSuite
    public void quitDriver() {
        AndroidDriverSingleton.quitDriver();
    }

}
