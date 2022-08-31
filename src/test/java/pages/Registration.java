package pages;


import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Registration {
    public Registration() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement profilSimgesi;
    @FindBy(xpath = "(//*[text()='Register'])[1]")
    public WebElement register;
    @FindBy(xpath = "(//input[@id='ssn'])[1]")
    public WebElement ssn;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement registerButton;
    @FindBy(xpath = "//*[text()='Registration Saved']")
    public WebElement successMessageRegistrationSaved;
    @FindBy(xpath = "//*[text()='Your SSN is invalid']")
    public WebElement verifyYourSsnIsInvalidTextVisible;
    @FindBy(xpath = "//*[text()='Your SSN is required.']")
    public WebElement verifyYourSsnIsRequiredVisible;
    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement firstNameRequiredText;
    @FindBy(xpath = "//*[text()='Your LastName is required.']")
    public WebElement lastNameRequiredText;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUserName;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement LoginPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButonu2;
    @FindBy(xpath = "//div[@class='info jhi-item-count']")
    public WebElement userCount;

    @FindBy(xpath = "//*[text()='Your username is required.']")
    public WebElement userNameRequiredText;
    @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement emailRequiredText;
    @FindBy (xpath = "//*[text()='This field is invalid']")
    public WebElement inValidRequiredEmailText;

    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement registerPagePasswordBox;

    @FindBy(xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordStrength1;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 153, 0);'])[2]")
    public WebElement passwordStrength2;

    @FindBy(xpath = "(//li[@style='background-color: rgb(153, 255, 0);'])[4]")
    public WebElement passwordStrength4;

    @FindBy(xpath = "(//li[@style='background-color: rgb(0, 255, 0);'])[5]")
    public WebElement passwordStrength5;

}
