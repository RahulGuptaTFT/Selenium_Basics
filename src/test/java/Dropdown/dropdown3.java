package Dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdown3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement country_DropDdown = driver.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]"));
        Select country_DD = new Select(country_DropDdown);

        List<WebElement> month_list = country_DD.getOptions();
        int total_size_month = month_list.size();

        //it will print the total no. of elements present in the month dropdown.
        System.out.println(total_size_month);

        // it will print the all elements from month dropdown.
        for (WebElement ele : month_list){
            System.out.println(ele.getText());
        }
        driver.close();
    }
}
