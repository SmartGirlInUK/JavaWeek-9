package Qafox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q3 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Show AllDesktops")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div/button[1]/i")).click();
        driver.findElement(By.xpath("//*[@id=\"input-sort\"]/option[6]")).click();
        driver.findElement(By.linkText("HTC Touch HD")).click();
        driver.findElement(By.id("button-cart")).click();
        driver.findElement(By.xpath("//*[@id=\"cart-total\"]")).click();
    }
}