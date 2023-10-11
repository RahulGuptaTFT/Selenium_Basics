package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class DD_Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.manage().window().maximize();
        driver.navigate().refresh();

        WebElement dd1 = driver.findElement(By.xpath("//select[@id='first']"));
        Select s1 = new Select(dd1);
        s1.selectByVisibleText("Iphone");
        s1.selectByValue("Apple");
        List<WebElement> str = s1.getOptions();
        for(WebElement ele : str){
            System.out.println(ele.getText());
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
