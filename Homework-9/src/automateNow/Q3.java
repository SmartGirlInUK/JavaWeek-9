package automateNow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q3 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://practice-automation.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Form Fields")).click();
        driver.findElement(By.name("name")).sendKeys("ABCD");
        driver.findElement(By.id("submit-btn")).submit();
    }
}
