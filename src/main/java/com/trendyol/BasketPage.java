package com.trendyol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage1 {

    public void urunalma() throws InterruptedException {
        //Sepete gitme
        webElementiBul("css", "a[class='link account-basket']>p[class='link-text']");
        webelementiBekle(2);
        webElementiBul("css", ".i-trash");
        webElementiBul("css", "button[ng-click='removeItemAsMember()']");


        // Hesaptan çıkış yapma
        webelementiBekle(2);
        webElementMoveTo(By.cssSelector("div[class='link account-user']>p"));
        webelementiBekle(2);
        webElementiBul("css", "i[class='i-logout']");
    }

    public BasketPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
