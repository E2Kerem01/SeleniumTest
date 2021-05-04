package trendyol;


import com.trendyol.BasketPage;
import com.trendyol.HomePage;
import com.trendyol.LoginnPage;
import com.trendyol.ProductPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class LoginTest extends BaseTest {

    @Test
    public void trendyol() throws InterruptedException {

        LoginnPage loginnPage = new LoginnPage(driver);
        loginnPage.loginislem();

        HomePage homePage = new HomePage(driver);
        homePage.girisyapma();

        ProductPage productPage = new ProductPage(driver);
        productPage.sepeteekle();

        BasketPage basketPage = new BasketPage(driver);
        basketPage.urunalma();

    }


}
