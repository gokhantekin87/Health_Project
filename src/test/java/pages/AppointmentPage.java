package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pojos.Appointment;
import utilities.Driver;

public class AppointmentPage {
    public AppointmentPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='ssn']")
    WebElement ssn;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='phone']")
    WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='appoDate']")
    WebElement appoitmentDateTime;
    @FindBy(xpath = "//button[@id='register-submit']")
    WebElement sendAnAppointmentRequestButton;

}
