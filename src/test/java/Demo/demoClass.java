package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class demoClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nxtgenaiacademy.com/demo-site/");
        WebElement a = driver.findElement(By.xpath("//input[@id='vfb-5']"));
        a.sendKeys("Rahul");
        driver.findElement(By.id("vfb-7")).sendKeys("Gupta");
        WebElement b = driver.findElement(By.className("vfb-choice"));
        System.out.println(b.isSelected());
        driver.findElement(By.name("vfb-13[address]")).sendKeys("Jogipura");
        driver.findElement(By.cssSelector("#vfb-13-address-2")).sendKeys("CityKart");
        WebElement country = driver.findElement(By.xpath("//select[@id='vfb-13-country']"));
        Select c = new Select(country);
         c.selectByVisibleText("Albania");
         List<WebElement> allName = c.getOptions();
         for(WebElement ele : allName){
             System.out.println(ele.getText());
         }
        WebElement date = driver.findElement(By.xpath("//select[@id='vfb-16-hour']"));
        Select d = new Select(date);
        d.selectByVisibleText("03");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> allDate = d.getOptions();
        for(WebElement ele : allDate){
            System.out.println(ele.getText());
        }
        driver.navigate().to("https://www.google.com");
       // driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.close();
    }
}
