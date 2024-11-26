package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumIdLocator {
    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions().addArguments("Start-Maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

        webDriver.get("https://accounts.google.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        WebElement userEmailInputBox = webDriver.findElement(By.id("identifierId"));

        userEmailInputBox.sendKeys("EXAMPLE_EMAIL@GMAIL.COM", Keys.ENTER);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        webDriver.close();
        webDriver.quit();
    }
}
