package pages.us_pages;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US001_Page{

    public US001_Page(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement Register;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement SSNBox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;

    @FindBy(xpath="(//div[@class='invalid-feedback'])[1]")
    public WebElement SSNHataMesaji;

    @FindBy(xpath="//input[@id='firstName']")
    public WebElement firstName;

    @FindBy (xpath="(//div[@class='justify-content-center row'])[2]")
    public WebElement bosAlan;

    @FindBy(xpath="//input[@name='firstName']")
    public WebElement firstNameHataMesaji;

    @FindBy(xpath="//*[text()='Your LastName is required.']")
    public WebElement lastNameHataMesasji;
    @FindBy(xpath="(//div[@class='invalid-feedback'])[1]")
    public List<WebElement> YourSSNisinvalidmesaji;

    @FindBy(xpath = "//input[@id=\"username\"]")
    public WebElement usernamebox;
    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourUsernameIsRequiredMesaji;
    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourUsernameIsInvalidMesaji;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement thisFieldIsInvalidMesaji;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourEmailIsRequiredMesaji;

    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement emailKutusu;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourUsernameIsInvalidMessage;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement thisFieldIsInvalidMessage;

    @FindBy(xpath = "//div[@class=\"invalid-feedback\"]")
    public WebElement yourEmailIsRequiredMessage;

    @FindBy(xpath = "//input[@name=\"firstPassword\"]")
    public WebElement passwordbox;
//input[@name="firstPassword"]

    //    @FindBy(xpath = "//div[@class='invalid-feedback'][1]")
    //  public WebElement YourFirstNameIsrequiredMesaji;
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement anasayfaInsanIkonu;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement anasayfaInsanIkonuSignInElementi;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUsernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginPasswordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSignInButonu;

    @FindBy(xpath = "//div[@class='invalid-feedback'][1]")
    public WebElement YourFirstNameIsrequiredMesaji;

    @FindBy(xpath = "//div[text()='Registration Saved']") public WebElement registrationSavedPopup;


}