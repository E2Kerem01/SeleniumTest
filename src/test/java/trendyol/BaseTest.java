package trendyol;

import com.trendyol.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseTest {


    WebDriver driver;
    ChromeOptions options = new ChromeOptions();

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        options.addArguments("--disable-notifications");
        driver.get("https:/www.google.com");

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
