package base_test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.*;
import utils.PropReader;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;

    @BeforeSuite
    public void startBrowser() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(PropReader.readConfig("site-url"));
        driver.manage().window().maximize();
    }

    @AfterSuite
    public static void stopDriver() {
        try {
            driver.close();
            driver.quit();
        } catch (Throwable e) {
            e.getStackTrace();
        }
    }
}

