package com.seleniumtest.webdriver;

import org.openqa.selenium.By;

/**
 * Created by vmakaryan on 9/18/2015.
 */
public class UiElements {

    public static By LoginFiled()
    {
        return By.xpath(".//*[@id='user_login']");
    }

    public static By PasswordField()
    {
        return By.xpath(".//*[@id='user_pass']");
    }

    public static By LoginButton()
    {
        return By.xpath(".//*[@id='wp-submit']");
    }

    public static By PostsButton()
    {
        return By.xpath(".//*[@id='menu-posts']/a/div[3]");
    }

    public static By AddNewPostButton()
    {
        return By.xpath(".//*[@id='wpbody-content']/div[4]/h1/a");
    }

    public static By PostTitle()
    {
        return By.xpath(".//*[@id='title']");
    }

    public static By PostBody()
    {
        return By.xpath(".//*[@id='tinymce']");
    }

    public static By PublishButton()
    {
        return By.xpath(".//*[@id='publish']");
    }

}

