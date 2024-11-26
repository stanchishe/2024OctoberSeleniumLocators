package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class SeleniumXPathLocatorList {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions().addArguments("Start-Maximized");
        WebDriver webDriver = new ChromeDriver(chromeOptions);

        webDriver.get("https://login.yahoo.com/");
        Thread.sleep(2000);
        // Create a list of all elements that fit the Xpath "//li"
        List<WebElement> liWebElements = webDriver.findElements(By.xpath("//li"));
        Thread.sleep(2000);
        for (WebElement liElement : liWebElements) {
            System.out.println(liElement.getText());
        }

        Thread.sleep(10000);
        webDriver.close();
        webDriver.quit();
    }
}
