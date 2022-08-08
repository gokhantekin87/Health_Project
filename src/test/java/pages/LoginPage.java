package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){PageFactory.initElements(Driver.getDriver(),this);}

 @FindBy(xpath = "//*[@id='account-menu']") public WebElement accountMenu;
 @FindBy(id = "login-item") public WebElement signIn; //SignIn sayfasini acma butonu
 @FindBy(id = "username") public WebElement usernameTextbox;
 @FindBy(id = "password") public WebElement passwordTextbox;
 @FindBy(xpath = "(//span[text()='Sign in'])[3]") public WebElement signInButton; //SignIn sayfasindaki signin buttonu
}