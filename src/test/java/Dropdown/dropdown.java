package Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement country_DropDdown = driver.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]"));
        Select country_DD = new Select(country_DropDdown);

        //  it will select the match of index passed.

        //1 it will select march.
        country_DD.selectByIndex(1);
        Thread.sleep(1000);

        //2 it will select Oct.
        country_DD.selectByValue("ANDORRA");
        Thread.sleep(1000);

        //3 it will select Aug.
        country_DD.selectByVisibleText("ARMENIA");
    }
}
