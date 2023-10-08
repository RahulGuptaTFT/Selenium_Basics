package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        // 1)- id Locator
        WebElement uname = driver.findElement(By.id("email"));
        uname.sendKeys("rahulgupta2740@gmail.com");

        // 2)- name Locator
        driver.findElement(By.name("pass")).sendKeys("7wergjhgfgg");

        Thread.sleep(2000);

        // 3)- classname Locator => Sometimes class names may not be unique
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']"))).click();


        // 4)- xpath Locator => to get this we have to choose the line and then right click and choose from copy to copy xPath
        //driver.findElement(By.xpath("//*[@id=\"u_0_5_oA\"]")).click();

        // 5)- css Locator
        //driver.findElement(By.cssSelector("#loginbutton")).click();

        Thread.sleep(10000);
        driver.quit();

    }
}
