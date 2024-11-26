package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumNameLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions().addArguments("Start-Maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

        webDriver.get("https://google.com");
        Thread.sleep(2000);
        webDriver.findElement(By.id("W0wltc")).click();
        Thread.sleep(1000);
        WebElement searchBox =  webDriver.findElement(By.name("q"));
        searchBox.sendKeys("html tutorial", Keys.ESCAPE);
        Thread.sleep(1000);
        // Can be used instead of Keys.Enter when "we feel lucky"
        webDriver.findElement(By.name("btnI")).click();

        Thread.sleep(10000);
        webDriver.close();
        webDriver.quit();
    }
}
