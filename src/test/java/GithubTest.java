

import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class GithubTest {
    private WebDriver driver;
    public String baseUrl = "https://github.com/login" ;
    String test = "test";
    String test2 = "test";

    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        baseUrl = "https://github.com/login";
        }

    @Test(priority = 0)
    public void githubLogin(){
        driver.get(baseUrl);
        GithubLoginPage loginPage = new GithubLoginPage(driver);
        loginPage.newLogin(test, test2);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();

    }

}
