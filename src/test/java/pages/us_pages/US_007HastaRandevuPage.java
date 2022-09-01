package pages.us_pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_007HastaRandevuPage {

    public US_007HastaRandevuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatientMenu;

    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatMenu;

    @FindBy(xpath = "//a[@href='/make-appointment']")
    public WebElement MakeAnAppointmentButton;

    @FindBy (xpath = "//button[@id='register-submit']")
    public WebElement sendAnAppointmentRequestButton;

    @FindBy (xpath = "//input[@name='phone']")
    public WebElement AppointmentRequestPhoneTextBox;

    @FindBy (xpath = "//strong[text()='Appointment registration saved!']")
    public WebElement appointmentRegistrationSavedFlyingText;

    @FindBy (xpath = "//input[@id='appoDate']")
    public WebElement appointmentRegistrationDateEnterBox;

    @FindBy (xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement profilSimgesi;

    @FindBy (xpath = "//a[@id='login-item']")
    public WebElement signInButton;

    @FindBy ( xpath = "//input[@id='username']")
    public WebElement signInUserNameTextBox;

    @FindBy ( xpath = "//input[@id='password']")
    public WebElement singInPasswordTextBox;

    @FindBy (xpath  = "//button[@class='btn btn-primary']")
    public WebElement sighInSignInButton;


    @FindBy (xpath = "//a[@href='/account/settings']")
    public WebElement profilDropSettings;

    @FindBy (xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")
    public WebElement afterSighInProfilSimgesi;

    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement userSettingsFirstNameTextBox;

    @FindBy (xpath = "//input[@id='lastName']")
    public WebElement userSettingsLastNameTextBox;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement userSettingsEmailTextBox;

//    @FindBy (xpath = "//input[@id='language']")         //Sistemde gözükmüyor,düzen içinde, koyulsaydı bu isimde olurdu diye tahminediyorum
//    public WebElement userSettingsLanguageTextBox;

    @FindBy (xpath = "//strong[text()='Settings saved!']")
    public WebElement settingsSavedFlyingText;

    @FindBy (xpath = "//button[@class='btn btn-primary']" )
    public WebElement settingsSaveButton;



}
