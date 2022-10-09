package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePageWithoutLogin {
    WebDriver driver;
    By userDropDown = By.xpath("//a[@id='dropdown-user']");
    By dropDownLanguage = By.xpath("//a[@id='navbarDropdownMenuLink']");
    By usOption = By.xpath("//a[@id='us']");
    By loginButtonAtHomeScreen = By.xpath("//a[@id='dropdown-user']//following::a[@href='/login']");
    By email = By.xpath("//input[@type='email']");
    By pass = By.xpath("//input[@type='password']");
    By loginButtonAtLoginScreen = By.xpath("//input[@type='submit' and @value='Log in']");
    By requestPassMenu = By.xpath("//*[@href='/forgotpassword']");
    By emailRequestPass = By.xpath("//input[@id='edit-name']");
    By requestPassButton = By.xpath("//input[@id='edit-submit']");
    //constructor
    public homePageWithoutLogin(WebDriver driver) {
        this.driver=driver;
    }
    //getter setter
    // public By getEmail() {
    //     return email;
    // }
    // public void setEmail(String email) {
    //     this.email = email;
    // }
    // public By getPass() {
    //     return pass;
    // }
    // public void setPass(By pass) {
    //     this.pass = pass;
    // }
    // public By getEmailRequestPass() {
    //     return emailRequestPass;
    // }
    // public void setEmailRequestPass(By emailRequestPass) {
    //     this.emailRequestPass = emailRequestPass;
    // }
    //set email 
    private void setEmail(String email) {
        driver.findElement(this.email).sendKeys(email);
        
    }  
    //set pass 
    private void setPass(String pass) {
        driver.findElement(this.pass).sendKeys(pass);
        
    }   
    //click on login button
    public void clickOnLoginButtonAtHomeScreen(){
        driver.findElement(loginButtonAtHomeScreen).click();
    }
    public void clickOnLoginButtonAtLoginScreen(){
        driver.findElement(loginButtonAtLoginScreen).click();
    }
    public void clickOnUserDropDown(){
        driver.findElement(userDropDown).click();
    }
    public void openLoginPage(){
        clickOnUserDropDown();
        clickOnLoginButtonAtHomeScreen();
    }
    public void selectLanguage(){
        driver.findElement(dropDownLanguage).click();
        driver.findElement(usOption).click();
    }
    //login function
    public void loginToHYTPage(String email, String pass){
        
        setEmail(email);
        setPass(pass);
        clickOnLoginButtonAtLoginScreen();

    }    

    
}