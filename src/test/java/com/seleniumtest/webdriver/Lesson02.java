package com.seleniumtest.webdriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by vmakaryan on 9/18/2015.
 */
public class Lesson02 {

    protected static WebDriver driver;

    @Test
    public void Lesson2() {

        driver = new FirefoxDriver();

        driver.navigate().to(Constants.BaseUrl);

        driver.findElement(UiElements.LoginFiled()).clear();

        driver.findElement(UiElements.LoginFiled()).sendKeys(Constants.AdminLogin);

        driver.findElement(UiElements.PasswordField()).clear();

        driver.findElement(UiElements.PasswordField()).sendKeys(Constants.AdminPassword);

        driver.findElement(UiElements.LoginButton()).click();

        driver.findElement(UiElements.PostsButton()).click();

        driver.findElement(UiElements.AddNewPostButton()).click();

        driver.findElement(UiElements.PostTitle()).clear();

        driver.findElement(UiElements.PostTitle()).sendKeys(Constants.PostTitle);

        driver.switchTo().frame("content_ifr");

        driver.findElement(UiElements.PostBody()).clear();

        driver.findElement(UiElements.PostBody()).sendKeys(Constants.PostBody);

        driver.switchTo().defaultContent();

        driver.findElement(UiElements.PublishButton()).click();

        driver.findElement(By.xpath(".//*[@id='message']/p/a")).click();

        Assert.assertTrue(driver.findElement(By.xpath(".//*[1]/header/h1")).getText().contains(Constants.PostTitle));

        driver.close();

        driver.quit();

    }
}
