package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement userIcon;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement registerSsnBox;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement registerFirstNameBox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement registerLastNameBox;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement RegisterNewPasswordBox;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement registerConfirmPasswordBox;

    @FindBy(xpath = "//button[@id='register-submit')")
    public WebElement registerButton;


}
