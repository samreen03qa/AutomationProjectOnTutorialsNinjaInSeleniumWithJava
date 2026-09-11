package DailyPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice_Xpathxxx {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        driver.findElement(
            By.xpath("b/html/body/div[1]/header/div/div[1]/div[3]/div/div[2]")).click();

        driver.quit();
    }
}