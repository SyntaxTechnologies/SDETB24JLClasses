package org.example.class10;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PolyBrowser {
    public static void main(String[] args) {


        RemoteWebDriver [] browsers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};

        for(RemoteWebDriver browser:browsers){
            browser.navigate().to("https://www.ebay.com");
            browser.navigate().to("https://facebook.com");
            browser.navigate().back();
            browser.navigate().refresh();
            browser.close();
        }


    }
}
