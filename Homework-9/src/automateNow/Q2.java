package automateNow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q2 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://practice-automation.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Form Fields")).click();
        driver.findElement(By.id("name")).sendKeys("Admin");
        driver.findElement(By.id("submit-btn")).submit();
    }
}
