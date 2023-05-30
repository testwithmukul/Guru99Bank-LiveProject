package org.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_verify {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/mukul/Documents/Testing/Automation/drivers/chrome/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("https://www.demo.guru99.com/V4/index.php");

        driver.findElement(By.xpath("//input[@onkeyup = 'validateuserid();']")).sendKeys("mngr505814");
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("YqazUra");

        driver.findElement(By.xpath("//input[contains(@value, 'LOGIN')]")).click();
        driver.close();

    }
}
