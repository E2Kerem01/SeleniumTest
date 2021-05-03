package com.trendyol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginnPage extends BasePage1 {


    public LoginnPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void loginyapma() throws InterruptedException {

        webelementiBekle(2);
        webElementineGönder("css", "input[type='text']", "trendyol");
        webElementiBul("css", "a[href='https://www.trendyol.com/']");
        webElementControl("En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da", webDriver.getTitle());
        webelementiBekle(2);
        webElementiBul("css", "div[class='link account-user']");


        webElementineGönder("id", "login-email", "markher5235@outlook.com");
        webElementineGönder("id", "login-password-input", "aliveli4950");
        webElementiBul("class", "q-primary q-fluid q-button-medium q-button submit");
        webelementiBekle(2);

        webElementControl("Hesabım", webDriver.findElement(By.cssSelector("div[class='link account-user']>p[class='link-text']")).getText());
        webElementMoveTo(By.cssSelector("a[href='/butik/liste/5/elektronik']"));
        webelementiBekle(2);
        webElementiBul("css", "div[id='sub-nav-5'] .category-box>ul[class='sub-item-list'] a[href='/cep-telefonu-x-c103498']");

    }

    public HomePage HomePageNavigate(){
        return new HomePage(webDriver);
    }
}