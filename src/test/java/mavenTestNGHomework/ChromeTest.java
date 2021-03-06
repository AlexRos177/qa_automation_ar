package mavenTestNGHomework;

import lombok.extern.log4j.Log4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

@Log4j
public class ChromeTest {
    ChromeDriver driver;

    private final String GOOGLE_URL = "https://www.google.lv/";

    @BeforeTest
    public void setProperties() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("orc.openqa.selenium").setLevel(Level.OFF);
    }

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        log.info("Initialize ChromeDriver");
        driver = new ChromeDriver();
        driver.get(GOOGLE_URL);
    }

    @Test
    public void urlTest() {
        Assert.assertEquals(driver.getCurrentUrl(), GOOGLE_URL);
    }

    @Test
    public void titleTest() {
        Assert.assertEquals(driver.getTitle(), "GOOGLE - Es ticu veiksmei!");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        log.info("Closing ChromeDriver");
        driver.quit();
    }
}