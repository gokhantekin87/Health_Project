package pages.admin_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

 public class Admin_PatientPage {


    public Admin_PatientPage(){PageFactory.initElements(Driver.getDriver(),this);};

     @FindBy(xpath = "//a[@aria-haspopup='true']")
     public WebElement accountButton;

     @FindBy(xpath = "//a[@class='dropdown-item']")
     public WebElement signInButton;

     @FindBy(xpath ="//input[@name='username']")
     public WebElement usernameBox;

     @FindBy(xpath = "//input[@name='password']")
     public WebElement passwordBox;

     @FindBy(xpath = "//button[@type='submit']")
     public WebElement sign2Button;

     @FindBy(xpath = "//span[text()='Items&Titles']")
     public WebElement itemsButton;

     @FindBy(xpath = "//span[text()='Patient']")
     public WebElement patientButton;

     @FindBy(xpath = "//a[@id='jh-create-entity']")
     public WebElement createPatientButton;


     @FindBy(xpath = "//input[@name='firstName']")
     public WebElement firstnameBox;


     @FindBy(xpath = "//input[@name='lastName']")
     public WebElement lastnameBox;

  @FindBy(xpath = "//input[@name='birthDate']")
  public WebElement birthDateBox;

     @FindBy(xpath = "//input[@name='birthDate']")
     public WebElement emailBox;


     @FindBy(xpath = "//input[@name='phone']")
     public WebElement phoneBox;

     @FindBy(xpath = "//select[@name='gender']")
     public WebElement genderBox;

     @FindBy(xpath = "//select[@name='bloodGroup']")
     public WebElement bloodGroupBox;

     @FindBy(xpath = "//input[@name='adress']")
     public WebElement adressBox;

     @FindBy(xpath = "//select[@name='user.id']")
     public WebElement userIdBox;

     @FindBy(xpath = "//select[@name='country.id']")
     public WebElement countryIdBox;

     @FindBy(xpath = "//option[@value='80065']")
     public WebElement usaBox;


     @FindBy(xpath = "//select[@name='cstate.id']")
     public WebElement cStateBox;

     @FindBy(xpath = "//option[@value='43522']")
     public WebElement californiaOption;

     @FindBy(id = "save-entity")
     public WebElement saveButton;

     @FindBy(xpath = "//div[@role='alert']")
     public WebElement kayitBasarili;
     //div[text()='A new Patient is created with identifier 207733']kayıt basarılı
     @FindBy(xpath = "//div[@role='alert']")
     public WebElement islemBasarili;

     @FindBy(xpath = "//a[@class='page-link']")
     public WebElement sonSayfaButton;

     @FindBy(xpath = "//span[text()='Created Date']")
     public WebElement createDateButton;

     @FindBy(xpath = "(//span[text()='Delete'])[1]")
     public WebElement deleteButton;

     @FindBy(xpath = "(//button[@type='button'])[4]")
     public WebElement delete2Button;

     @FindBy(xpath = "//div[@class='Toastify__toast-body']")
     public WebElement serverErrorButton;

     @FindBy(xpath = "//div[@class='Toastify__toast-body']")
     public WebElement güncelemeBasariliButton;

     @FindBy(xpath = " (//th[@class='hand'])[1]")
     public WebElement patientsIdButton;



}
