package RahulShettyAcademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]/input")).click();
        driver.findElement(By.id("autocomplete")).sendKeys("India");
        driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]/option[4]")).click();
        driver.findElement(By.id("checkBoxOption1")).click();
        driver.findElement(By.id("checkBoxOption3")).click();
        driver.findElement(By.name("enter-name")).sendKeys("Minal");
        driver.findElement(By.id("confirmbtn")).click();
    }
}