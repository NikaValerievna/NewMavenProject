package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver = null;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By enterProfile = By.xpath("//a[@class='header-topline__user-link link-dashed']");
    private By enterUsername = By.xpath("//input[@id='auth_email']");
    private By enterPassword = By.xpath("//input[@id='auth_pass']");
    private By loginButton = By.xpath("//button[@class='button button--large button--green auth-modal__submit']");

    public void profileButtonClick (){
        driver.findElement(enterProfile).click();
    }
    public void usernameInput (String name){
        driver.findElement(enterUsername).sendKeys(name);
    }
    public void passwordInput (String name){
        driver.findElement(enterPassword).sendKeys(name);
    }
    public void loginClick (){
        driver.findElement(loginButton).click();
    }

}
