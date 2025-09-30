package org.example.class10;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.navigate().to("https://www.ebay.com");
        chromeDriver.navigate().to("https://facebook.com");
        chromeDriver.navigate().back();
        chromeDriver.navigate().refresh();
        chromeDriver.close();

        // 1000 test cases for each test case 10 lines 10000

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.navigate().to("https://www.ebay.com");
        firefoxDriver.navigate().to("https://facebook.com");
        firefoxDriver.navigate().back();
        firefoxDriver.navigate().refresh();
        firefoxDriver.close();


        SafariDriver safariDriver = new SafariDriver();
        safariDriver.navigate().to("https://www.ebay.com");
        safariDriver.navigate().to("https://facebook.com");
        safariDriver.navigate().back();
        safariDriver.navigate().refresh();
        safariDriver.close();


    }
}
