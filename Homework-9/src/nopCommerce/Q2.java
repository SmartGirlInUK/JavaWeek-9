package nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q2 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.name("Email")).sendKeys("admin@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("AdminABC");
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        WebElement msg= driver.findElement(By.cssSelector(".topic-block-title > h2:nth-child(1)"));
        System.out.println(msg.getText());

    }
}
