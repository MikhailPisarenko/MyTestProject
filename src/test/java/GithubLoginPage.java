import org.apache.xpath.operations.String;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GithubLoginPage {
    public WebDriver driver;

    @FindBy(id = "login_field")
    WebElement userLogin;

    @FindBy(id = "password")
    WebElement userPassword;

    @FindBy(css = "#login> form > div.auth-form-body > input.btn")
    WebElement loginButton;

    public GithubLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements( driver,this);
    }
    public void newLogin(String test, String test2) {
        System.out.println(test);
        System.out.println(test2);
    }
}

