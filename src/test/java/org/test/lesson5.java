package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lesson5 {

    @Test
    public void fillField(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name=\"wg\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"wg\"]")).sendKeys("123");
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name=\"wg\"]")).isDisplayed());

    }
//    @Test
//    public void selectPounds(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://healthunify.com/bmicalculator/");
//        driver.findElement(By.xpath("//select[@name=\"opt1\"]")).click();
//        driver.findElement(By.xpath("//option[@value=\"pounds\"]")).click();
//        Assert.assertTrue(driver.findElement(By.xpath("//input[@name=\"opt1\"]")).isDisplayed());
//
//    }


}