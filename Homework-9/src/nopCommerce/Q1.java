package nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Admin");
        driver.findElement(By.name("LastName")).sendKeys("ABC");
        driver.findElement(By.id("Email")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("AdminABC");
        driver.findElement(By.name("ConfirmPassword")).sendKeys("AdminABC");
        driver.findElement(By.id("register-button")).click();
        System.out.println(driver.findElement(By.className("result")).getText());

    }
}