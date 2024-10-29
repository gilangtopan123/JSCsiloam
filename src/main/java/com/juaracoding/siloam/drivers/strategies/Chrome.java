package com.juaracoding.siloam.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Chrome implements DriverStrategy {

    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        Map<String, String> prefs = new HashMap<>();
        prefs.put("download.default_directory", System.getProperty("user.dir") + File.separator + "downloads");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");
        return new ChromeDriver(options);
    }
}
