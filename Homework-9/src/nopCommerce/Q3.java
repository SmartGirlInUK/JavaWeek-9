package nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q3 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/ul/li[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"products-orderby\"]/option[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"products-pagesize\"]/option[1]")).click();
    }
}
