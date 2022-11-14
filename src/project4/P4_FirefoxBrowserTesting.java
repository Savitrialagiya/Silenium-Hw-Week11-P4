package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P4_FirefoxBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Launch Url
        driver.get(baseUrl);
        //Print the title of the page
        System.out.println("The title of the page: " + driver.getTitle());
        //Print the current Url
        System.out.println("The current Url is: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("The page source is: " + driver.getPageSource());
        //Enter email from email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("admin@gmail.com");

        //Enter password from password field
        //Enter the password from password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //close the browser
        //driver.quit();





    }
}
