package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pojos.Appointment;
import utilities.Driver;

import java.util.List;

public class AppointmentPage {
    public AppointmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Erkam Uzun

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement appoitmentDateTime;

    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement sendAnAppointmentRequestButton;

    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesButton;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement makeAnAppoitment;
    @FindBy(xpath = "//*[text()='Your FirstName is required.']")
    public WebElement firstNameRequiredYazi;
    @FindBy(xpath = "//*[text()='Your SSN is required.']")
    public WebElement ssnRequiredYazi;
    @FindBy(xpath = "//*[text()='Phone number is required.']")
    public WebElement phoneNumberIsRequiredYazi;
    @FindBy(xpath = "//*[text()='Your LastName is required.']")
    public WebElement lastNameIsRequiredYazi;
    @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement emailIsRequiredYazi;



    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement adminsitrationIkon;
    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagment;
    @FindBy(xpath = "(//li[@class='page-item'])[8]")
    public WebElement lastPageButton;
    @FindBy(xpath = "//tbody//tr//td[9]")
    public List<WebElement> baslıkLıst;

    @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[2]")
    public WebElement adamIkon;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[3]")
    public WebElement accountSettings;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement settingsSavedYazi;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement myAppoitmentsButton;


    @FindBy(xpath = "(//*[text()='Poalt1 Alemdar1'])[2]")
    public WebElement polatButton;
    @FindBy(xpath = "//h2")
    public WebElement patientBaslık;



}
