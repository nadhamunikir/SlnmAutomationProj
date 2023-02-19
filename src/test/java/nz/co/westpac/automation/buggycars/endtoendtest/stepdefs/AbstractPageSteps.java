package nz.co.westpac.automation.buggycars.endtoendtest.stepdefs;

import nz.co.westpac.automation.buggycars.helpers.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class AbstractPageSteps {

    protected static WebDriver driver = null;

    protected WebDriver getDriver() {
        if (driver == null) {
            String projPath = System.getProperty("user.dir");
            System.out.println("browserName\t" + System.getProperty("browserName"));

            if (System.getProperty("browserName").equals("Chrome")) {
                System.setProperty("webdriver.chrome.driver", projPath + "/src/test/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
            }
            if (System.getProperty("browserName").equals("Edge")) {
                System.setProperty("webdriver.edge.driver", projPath + "/src/test/resources/drivers/msedgedriver.exe");
                driver = new EdgeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        }
        return driver;
    }

    public void quitDriver(){
        driver.quit();
    }
}