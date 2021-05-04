package com.trendyol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage1 {

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // HOME PAGE
    public void girisyapma() throws InterruptedException {

        webElementiBul("css", "input[class='search-box']");
        webelementiBekle(2);
        webElementiBul("css", ".aggrgtn-cntnr-wrppr .fltrs-wrppr:nth-of-type(2) .fltrs>a:nth-of-type(" + random(34) + ")");
        webelementiBekle(2);
        webElementiBul("css", ".search-app-container>.srch-rslt-cntnt");
        webelementiBekle(2);
        webElementiBul("css", ".aggrgtn-cntnr-wrppr .fltrs-wrppr:nth-of-type(3) .fltrs>a:nth-of-type(" + random(5) + ")");
        webelementiBekle(2);
        int i = driver.findElements(By.cssSelector(".prdct-cntnr-wrppr>div")).size();
        webElementiBul("css", ".prdct-cntnr-wrppr>div:nth-of-type(" + random(i) + ")");
        webelementiBekle(2);

    }

}
