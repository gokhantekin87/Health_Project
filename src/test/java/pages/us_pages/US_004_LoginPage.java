package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_004_LoginPage {

    public US_004_LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "login-item")
    public WebElement signIn; //SignIn sayfasini acma butonu

    @FindBy(id = "username")
    public WebElement usernameTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signInButton; //SignIn sayfasindaki signin buttonu

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement failMassageToSignIn;

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement signedInUserName;

    @FindBy(xpath = "//input[@name='rememberMe']")
    public WebElement rememberMeBox;

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[2]/div[3]/a/span")
    public WebElement didYouForgetPasswd;

    @FindBy(xpath = "//*[@id='login-page']/div/form/div[2]/div[4]/a")
    public WebElement registerNewAccount;

    @FindBy(xpath="//button[@class='btn btn-secondary']")
    public WebElement cancelButton;



}




