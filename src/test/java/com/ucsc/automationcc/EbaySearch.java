package com.ucsc.automationcc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EbaySearch {

    WebDriver driver;

    @BeforeTest
    public void initBrowser() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
    }

    @Test
    public void searchMobile() {
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobile phones");
        new Select(driver.findElement(By.xpath("//select[@id='gh-cat']"))).selectByVisibleText("Cell Phones & Accessories");
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        new Actions(driver).scrollByAmount(0, 500).perform();
        driver.findElement(By.xpath("//span[text()='Apple']")).click();
    }

    @AfterTest
    public void quitBrowser() {
        driver.quit();
    }
}
