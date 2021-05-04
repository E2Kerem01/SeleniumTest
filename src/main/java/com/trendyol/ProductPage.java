package com.trendyol;

import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage1 {

    public ProductPage(WebDriver driver) {
        this.driver=driver;
    }

    public void sepeteekle() throws InterruptedException {


        //switch.to işlemi
        webelementiBekle(2);
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        webelementiBekle(2);

        //Sepete ekleme
        webElementiBul("css", "button[class='pr-in-btn add-to-bs']>.add-to-bs-tx");
        webelementiBekle(2);

    }


}
