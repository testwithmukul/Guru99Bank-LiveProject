//Here, whole purpose is of Encapsulation. lol!

package org.guru99;

import base.util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day2 {

    static WebDriver driver;    //Created a static instance to be used across all STATIC - classes and methods!

    //Creating setup() to read initialization parameters from Util.java
    public static void Setup(){

        System.setProperty("webdriver.chrome.driver", util.Chrome_Path);
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(util.Wait_Time));

        driver.get(util.Base_Url + "/V4/");

    }

    public static void main(String[] args){

        //Setup ChromeDriver
        Setup();

        //Getting and Entering Credentials
        driver.findElement(By.xpath("//input[@onkeyup = 'validateuserid();']")).sendKeys(util.User_Name);
        driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys(util.Password);

        //Clicking on Login Button
        driver.findElement(By.xpath("//input[contains(@value, 'LOGIN')]")).click();

        //Verifying the output
        String title = driver.getTitle();

        if (title.equals(util.Expected_Output)) {
            System.out.println("Wohooooo! Matched.");
        } else {
            System.out.println("Better luck next time!");
        }

        driver.quit();


    }


}
