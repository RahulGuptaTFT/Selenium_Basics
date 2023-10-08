package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        // 6)- LinkText Locator
        driver.findElement(By.linkText("Forgotten password?")).click();

        // 7)- Partial LinkText Locator
        driver.findElement(By.partialLinkText("Forgotten")).click();

        // 8)- tagName Locator
        System.out.println(driver.findElement(By.tagName("img")).getSize());
//      System.out.println(driver.findElements(By.tagName("img")).size());



    }
}
