package com.trendyol;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Random;

public class BasePage1  {
    WebDriver webDriver;
    ChromeOptions options = new ChromeOptions();
    WebElement webElement = null;
    WebDriverWait wait;

    public WebElement webElementiBul(String key, String value) {

        switch (key) {
            case "id":
                webElement = webDriver.findElement(By.id(value));
                webElement.click();
                break;
            case "css":
                webElement = webDriver.findElement(By.cssSelector(value));
                webElement.click();
                break;
            case "xpath":
                webElement = webDriver.findElement(By.xpath(value));
                webElement.click();
                break;
            case "classname":
                webElement = webDriver.findElement(By.className(value));
                webElement.click();
                break;
            case "name":
                webElement = webDriver.findElement(By.name(value));
                webElement.click();
                break;
            case "linkText":
                webElement = webDriver.findElement(By.linkText(value));
                webElement.click();
                break;
            default:
                System.out.println("TestClass içerisinde Web Elementi Bul fonksiyonu düzgün çalışmadı...");
                break;
        }
        return webElement;
    }

    public void webElementineGönder(String key, String value, String sendingValue) {
        webElement = webElementiBul(key, value);
        webElement.sendKeys(sendingValue);
        webElement.submit();
    }

    public void webElementControl(String expected, String actual) {
        Assert.assertEquals(expected, actual);
    }

    public void webelementiBekle(int i) throws InterruptedException {
        Thread.sleep(i * 1000);
    }

    public void webElementMoveTo(By by) {
        webElement = webDriver.findElement(by);
        Actions actions = new Actions(webDriver);

        actions.moveToElement(webElement).build().perform();

    }

    public WebElement webElementlerdenBul(int i, By by) {
        webElement = webDriver.findElements(by).get(i);
        return webElement;
    }

    // Random sayı atama
    public int random(int x) {
        Random rand = new Random();
        int num = rand.nextInt(x);

        if (num == 0) {
            return 1;
        } else {
            return num;
        }

    }
}
