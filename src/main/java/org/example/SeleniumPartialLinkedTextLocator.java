package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumPartialLinkedTextLocator {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions().addArguments("Start-Maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

        webDriver.get("https://login.yahoo.com/");
        Thread.sleep(2000);
        WebElement forgotUserLink = webDriver.findElement(By.partialLinkText("Forgot"));
        forgotUserLink.click();

        Thread.sleep(10000);
        webDriver.close();
        webDriver.quit();
    }
}
