package Qafox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[1]/a")).click();
        driver.findElement(By.linkText("Continue")).click();
        driver.findElement(By.id("input-firstname")).sendKeys("Admin");
        driver.findElement(By.name("lastname")).sendKeys("abcd");
        driver.findElement(By.id("input-email")).sendKeys("ab.admin@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("08564965846");
        driver.findElement(By.name("password")).sendKeys("Admin@abcd");
        driver.findElement(By.id("input-confirm")).sendKeys("Admin@abcd");
        driver.findElement(By.name("agree")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).submit();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText());

    }
}
