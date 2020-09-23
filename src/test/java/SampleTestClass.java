import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.Search;
import utils.WebDriverFactory;

public class SampleTestClass {
    WebDriver driver = null;
    LoginPage loginPage = null;
    HomePage homePage = null;
    Search search = null;

    @BeforeMethod
    public void setUp(){
        WebDriverFactory.createInstance("Chrome");
        driver = WebDriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        search = new Search(driver);
    }

    @Test
    public void successfulLogin() throws InterruptedException {
        homePage.navigateTo();
        loginPage.profileButtonClick();
        loginPage.usernameInput("nika1993valerievna@gmail.com");
        loginPage.passwordInput("Rozetka2020");
        loginPage.loginClick();
        search.objectToSearch("Фотоаппарат Nikon");
        search.searchButtonClick();
        Assert.assertTrue(homePage.firstObjectNameIsPresent());
        //Assert.assertTrue(homePage.userIconIsPresent());
    }
//img[@alt="User profile for webinar5"]
//    String str=driver.getTitle();
//        Assert.assertTrue(str.contains("Интернет-магазин ROZETKA"));
//    @Test
//    public void SampleTestMethod(){
//        driver.get("https://www.google.com/");
//        driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Nika Valerievna");
//        Assert.assertTrue(true);
//    }

    @AfterMethod
    public void tearDown(){
        WebDriverFactory.getDriver().quit();
    }
}
