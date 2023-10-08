package RadioButtons_CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons_CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement a = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
        a.click();
        System.out.println(a.isSelected());
        WebElement b = driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
        b.click();
        System.out.println(b.isSelected());
        Thread.sleep(2000);
        driver.close();
    }
}
