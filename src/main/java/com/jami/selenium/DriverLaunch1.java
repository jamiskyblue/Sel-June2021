package com.jami.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverLaunch1 {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium Books");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@aria-label='Google Search']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
