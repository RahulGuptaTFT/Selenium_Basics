package Dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class dropDown2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement country_DropDdown = driver.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]"));
        Select country_DD = new Select(country_DropDdown);

        // it will return month
        WebElement Selected_country = country_DD.getFirstSelectedOption();
        System.out.println(Selected_country.getText());

        //  it will select the match of index passed.

        //1 it will select march.
        country_DD.selectByIndex(3);
        Thread.sleep(3000);

        //it will return March
        WebElement Selected_country1 = country_DD.getFirstSelectedOption();
        System.out.println(Selected_country1.getText());

    }
}
