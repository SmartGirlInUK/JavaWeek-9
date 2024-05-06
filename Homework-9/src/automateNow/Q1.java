package automateNow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice-automation.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Form Fields")).click();

        driver.findElement(By.id("name")).sendKeys("Admin");
        driver.findElement(By.id("submit-btn")).submit();
    }
}
