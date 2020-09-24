package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class HomePage {

    WebDriver driver = null;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        driver.get("https://rozetka.com.ua/");
    }

    public boolean userIconIsPresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).getSeconds());
        return wait.until(presenceOfElementLocated(By.xpath("//a[@class='header-topline__user-link link-dashed']"))).isDisplayed();
    }

    private By searchBox = By.xpath("//input[@name='search']");
    private By searchButton = By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit']");

    public void objectToSearch (String name){
        driver.findElement(searchBox).sendKeys(name);
    }
    public void searchButtonClick (){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(presenceOfElementLocated(searchButton));
        driver.findElement(searchButton).click();
    }
}
