package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class P4_EdgeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch Url
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println("Title of the page is: " + driver.getTitle());
        //Print the current Url
        System.out.println("Current Url is: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("The page source is: " + driver.getPageSource());
        //Print the email from email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("admin@gmail.com");
        //Print the password from password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        //Close Browser
       // driver.quit();
    }
}
