package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P4_MultiBrowserTesting {
    static String browser = "firefox";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else {
            System.out.println("Browser is wrong");
        }
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
