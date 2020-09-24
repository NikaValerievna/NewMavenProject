package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Search {

    WebDriver driver = null;

    public Search(WebDriver driver) {
        this.driver = driver;
    }

    public boolean firstObjectNameIsPresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).getSeconds());
        return wait.until(presenceOfElementLocated(By.xpath("//a[@title='Фотоаппарат Nikon Z50 + DX 16-50mm VR Kit (VOA050K001) Официальная гарантия!']"))).isDisplayed();
    }
}
