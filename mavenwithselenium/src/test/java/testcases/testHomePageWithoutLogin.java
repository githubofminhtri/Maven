package testcases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.setup;
import pages.homePageWithoutLogin;

public class testHomePageWithoutLogin {
    
    WebDriver driver;
    setup setup;
    homePageWithoutLogin homePageWithoutLogin;
   
    @BeforeClass
    public void setup(){
       setup = new setup();
       driver=setup.setupdDriver(driver);
       homePageWithoutLogin =new homePageWithoutLogin(driver);
    }
    @Test
    public void changeLanguage(){
        
        homePageWithoutLogin.selectLanguage();
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult, "https://hyt-sandbox.kardsys.com/?lang=EN");
    }
    @Test
    public void login() throws InterruptedException{
        //homePageWithoutLogin =new homePageWithoutLogin(driver);
        homePageWithoutLogin.openLoginPage();
        homePageWithoutLogin.loginToHYTPage("aria@kardapp.net", "1234@Tps");
        Thread.sleep(10000);
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult, "https://hyt-sandbox.kardsys.com/products");

    }
    @AfterClass
    public void tearDown(){
       setup = new setup();
       setup.tearDown(driver);
    }
}
