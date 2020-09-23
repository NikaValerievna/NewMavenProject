package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

    WebDriver driver = null;

    public Search(WebDriver driver) {
        this.driver = driver;
    }
    private By searchBox = By.xpath("//input[@name='search']");
    private By searchButton = By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit']");


    public void objectToSearch (String name){
        driver.findElement(searchBox).sendKeys(name);
    }
    public void searchButtonClick (){
        driver.findElement(searchButton).click();
    }


}
