package com.seleniumtest.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by vmakaryan on 9/16/2015.
 */
public class Lesson01 {

    protected static WebDriver driver;
    @Test
    public void Lesson01(){

        driver = new FirefoxDriver();

        driver.navigate().to("http://localhost:40840/wp-login.php?loggedout=true");

        driver.findElement(By.xpath(".//*[@id='user_login']")).clear();

        driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");

        driver.findElement(By.xpath(".//*[@id='user_pass']")).clear();

        driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("q82V@CZd*Fr6mHiorb");

        driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();

        driver.close();

        driver.quit();

    }


}
