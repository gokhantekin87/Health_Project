package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_018Page {
    public US_018Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitles;
    @FindBy(xpath = "(//*[text()='Physician'])[1]")
    public WebElement physicianSekmesi;
    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement createNewPhysician;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement useCheckbox;
    @FindBy(xpath = "//input[@id='searchSSN']")
    public WebElement ssnSearch;
    @FindBy(xpath = "//*[text()='Search User']")
    public WebElement searchUserButton;
    @FindBy(xpath = "//*[text()='User found with search SSN']")
    public WebElement dogrulamaMesaji;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstnameField;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement birthDate;
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;
    @FindBy(xpath = "//input[@name='adress']")
    public WebElement adress;
    @FindBy(xpath = "//select[@id='physician-gender']")
    public WebElement genderDdm;
    @FindBy(xpath = "//select[@id='physician-speciality']")
    public WebElement specialityField;
    @FindBy(xpath = "//select[@id='physician-bloodGroup']")
    public WebElement bloodGroupDdm;

    @FindBy(xpath = "//input[@id='physician-description']")
    public WebElement description;
    @FindBy(xpath = "//input[@id='file_image']")
    public WebElement dosyaSec;
    @FindBy(xpath = "//input[@name='examFee']")
    public WebElement examFee;
    @FindBy(xpath = "//select[@id='physician-country']")
    public WebElement countryDdm;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Physicians']")
    public WebElement phsicianHead;
    /*TC04*/
    @FindBy(xpath = "(//*[text()='Medunna'])[1]")
    public WebElement medunnaAltBaslik;
    @FindBy(xpath = "//td[3]")
    public List<WebElement> firstnameTable;
    //(xpath="(//a[@class='btn btn-primary btn-sm'])[14]")

    //TC05
    @FindBy(xpath="//a[@class='btn btn-danger btn-sm']")
    public WebElement deleteButton;

    @FindBy(xpath="//div[@class='Toastify__toast-body']")
    public WebElement silinemediMesaji;

    @FindBy(xpath="//button[@id='jhi-confirm-delete-physician']")
    public WebElement deleteButtonPenc;

    @FindBy(xpath = "//thead")
    public WebElement basliklar;

    //TC06
    @FindBy(xpath="//td[1]")
    public WebElement drSEC;

    @FindBy(xpath="//*[text()='An unexpected error has occurred.']")
    public WebElement secilemediMesaji;


}

