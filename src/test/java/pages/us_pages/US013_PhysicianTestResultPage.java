package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US013_PhysicianTestResultPage {
    public US013_PhysicianTestResultPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//li[@id='account-menu']")
    public WebElement signInSekmesi;

    @FindBy(xpath="//*[text()='Sign in']")
    public WebElement signInButonu;

    @FindBy(xpath="//input[@name='username']")
    public WebElement usernameKutusu;

    @FindBy(xpath="//input[@name='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement signInButonu2;

    @FindBy(xpath="//li[@id='entity-menu']")
    public WebElement myPages;

    @FindBy(xpath="//*[text()='My Appointments']")
    public WebElement myAppointments;

    @FindBy(xpath="(//div[@class='btn-group flex-btn-group-container'])[1]")
    public WebElement editSekmesi;

    @FindBy(xpath="//a[@class='btn btn-danger btn-sm']")
    public WebElement showTestResultSekmesi;

    @FindBy(xpath="//a[@class='btn btn-info btn-sm']")
    public WebElement viewTestResultButonu;

    @FindBy(xpath="//div[@class='table-responsive']")
    public WebElement testResultBody;

    @FindBy(xpath="//button[@class='btn btn-warning btn-sm']")
    public WebElement requestInpatientButonu;

}
