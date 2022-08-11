package pages.staff_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Staff_SearchPatientPage {

    public Staff_SearchPatientPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//tbody")public WebElement patientTbody;
    @FindBy(xpath = "//input[@name='ssn']")public WebElement ssnTextbox;
    @FindBy(xpath= "//a[@href='/patient-update/16561']")public WebElement editButton; //no: 16561
    @FindBy(xpath= "//span[text()='Delete']")public WebElement deleteButton; //any

    //*[text()='A Patient is updated with identifier 16558']
  /*  #        |FEMALE           |
            #        |AB+              |
            #        |12/08/57 12:08|
            */
//-----Create and Edit a Patient Page-----
    @FindBy(id = "patient-id")public WebElement patientIdTextbox;
    @FindBy(id= "patient-firstName")public WebElement patientFirstnameTextbox;
    @FindBy(id = "patient-lastName")public WebElement patientLastnameTextbox;
    @FindBy(id = "patient-birthDate")public WebElement patientBirthTextbox;
    @FindBy(id = "email")public WebElement patientEmailTextbox;
    @FindBy(id = "patient-phone")public WebElement paitientPhoneTextbox;
    @FindBy(id = "patient-gender")public WebElement patientGenderddm;
    @FindBy(id = "patient-bloodGroup")public WebElement patientBloodGroupddm;
    @FindBy(id = "patient-adress")public WebElement patientAdressTextbox;
    @FindBy(id = "patient-description")public WebElement patientDescTextbox;
    @FindBy(id = "patient-user")public WebElement patientUserddm;
    @FindBy(id = "patient-country")public WebElement patientCountryddm;
    @FindBy(id = "patient-cstate")public WebElement patientStateddm;
    @FindBy(id = "save-entity")public WebElement saveButton;


}
