package com.trendyol;

import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage1 {

    public ProductPage(WebDriver webDriver) {
        this.webDriver=webDriver;
    }

    public void sepeteekle() throws InterruptedException {


        //switch.to işlemi
        webelementiBekle(2);
        webDriver.switchTo().window(webDriver.getWindowHandles().toArray()[1].toString());
        webelementiBekle(2);

        //Sepete ekleme
        webElementiBul("css", "button[class='pr-in-btn add-to-bs']>.add-to-bs-tx");
        webelementiBekle(2);

    }

    public  BasketPage BasketpageNavigate(){
        return new BasketPage(webDriver);
    }
}
