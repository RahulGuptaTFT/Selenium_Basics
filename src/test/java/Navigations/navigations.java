package Navigations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigations {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.get("https://gmail.com");


        driver.navigate().back(); // Take me backward to google
        driver.navigate().refresh();// it will refresh/reload the page
        driver.navigate().forward(); // Take me forward to gmail

    }
}
