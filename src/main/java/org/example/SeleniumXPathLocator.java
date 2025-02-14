package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumXPathLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions().addArguments("Start-Maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

        webDriver.get("https://login.yahoo.com/");
        Thread.sleep(2000);
        webDriver.findElement(By.xpath("//*[@id=\"login-username\"]"))
                .sendKeys("MY_YAHOO@YAHOO.COM", Keys.ENTER);

        Thread.sleep(10000);
        webDriver.close();
        webDriver.quit();
    }
}
