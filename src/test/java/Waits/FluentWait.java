package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;


import java.time.Duration;

public class FluentWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Rahul Gupta");

        // This is fluent wait
        Wait<WebDriver> fluent = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        WebElement SearchButton = fluent.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[1]/div[3]/form[1]/div[1]" +
                "/div[1]/div[4]/center[1]/input[1]")));
        SearchButton.click();

        Thread.sleep(4000);
        driver.close();

    }
}
