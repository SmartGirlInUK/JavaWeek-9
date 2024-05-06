package Qafox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q2 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[1]/a")).click();
        driver.findElement(By.name("email")).sendKeys("ab.admin@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Admin@abcd");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).submit();
    }
}
