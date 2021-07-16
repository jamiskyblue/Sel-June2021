package com.jami.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverLaunch2 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");


        driver.findElement(By.linkText("register")).click();
        //driver.findElement(By.xpath("//a[@_sp='m570.l2621']")).click();
        driver.findElement(By.id("firstname")).sendKeys("MD JAMIL");
        Thread.sleep(2000);
        driver.findElement(By.id("lastname")).sendKeys("BOKSH");
        Thread.sleep(5000);
        driver.quit();
    }
}
