package Evaluation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Evaluation4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com");
        System.out.println("https://www.facebook.com");
        System.out.println("Facebook");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement title = driver.findElement(By.partialLinkText("Create new account"));
        title.click();

        driver.findElement(By.name("firstname")).sendKeys("Rahul");
        driver.findElement(By.name("lastname")).sendKeys("Gupta");
        driver.findElement(By.name("reg_email__")).sendKeys("1234567898");
        driver.findElement(By.id("password_step_input")).sendKeys("123@rahul");
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select d = new Select(day);
        d.selectByVisibleText("10");
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select m = new Select(month);
        m.selectByVisibleText("Jul");
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select y = new Select(year);
        y.selectByVisibleText("1999");
        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

        WebElement signUp = driver.findElement(By.name("websubmit"));
        signUp.click();

        Thread.sleep(10000);
       driver.close();
    }
}
