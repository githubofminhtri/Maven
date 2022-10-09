package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setup {
    public WebDriver driver;
    public setup() {
    }
    public WebDriver setupdDriver(WebDriver driver){
        this.driver=driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://hyt-sandbox.kardsys.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
    public void tearDown(WebDriver driver){
        this.driver=driver;
        driver.quit();
    }
}
