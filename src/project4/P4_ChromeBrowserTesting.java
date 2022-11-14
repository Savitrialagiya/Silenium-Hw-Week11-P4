package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch browser
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println("The title of the page: " +driver.getTitle() );

        //Print the current url
        System.out.println("Current Url is: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("The page source: " + driver.getPageSource());

        //Enter the email from email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("admin@gmail.com");

        //Enter the password from password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //close the browser
        //driver.quit();

    }
}
