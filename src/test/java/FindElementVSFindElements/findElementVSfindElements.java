package FindElementVSFindElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElementVSfindElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");

        // findElement() => Return the single web element

        //1 - send text
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchBox.sendKeys("abc");

        //2 - get text
        WebElement ele= driver.findElement(By.xpath("//body/div[6]/div[4]//a"));
        System.out.println(ele.getText());

        //3 - throw exception
        //WebElement ele1= driver.findElement(By.xpath("//body/div[6]/div[4]//k"));

//-----------------------------------------------------------------------------------------------------------------

        // findElements() => Return the multile web elements

        //1 - get multiple text from diff elements
        List<WebElement> elements = driver.findElements(By.xpath("//body/div[6]/div[4]/div[1]//a"));
        for (WebElement ele3 : elements){
            System.out.println(ele3.getText());
        }
        //2 - get total number of elements
        List<WebElement> total = driver.findElements(By.xpath("//body/div[6]/div[4]/div[1]//a"));
        System.out.println(total.size());

        //3 - none elements exception will not throw
        List<WebElement> fake = driver.findElements(By.xpath("//body/div[6]/div[4]/div[1]//b"));
        System.out.println(fake.size());

        driver.close();
    }
}
