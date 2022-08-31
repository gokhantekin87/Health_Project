package pages.us_pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.util.List;

public class US20AdminPage {
    public US20AdminPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement dprofilSimgesi;



    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInButonu;


    @FindBy(xpath = "//input[@name='username']")
    public WebElement duserName;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement dpassword;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement signInButonu2;


    @FindBy(xpath = "//*[text()='Administration']")
    public WebElement administrationbotunu;

    @FindBy(xpath = "//*[text()='User management']")
    public WebElement userManagementButonu;


    @FindBy(xpath = "//a[text()='»»']")
    public WebElement sonSayfayaGitme;


    @FindBy(xpath = "//a[@class='btn btn-info btn-sm']")
    public List<WebElement> vievbutonu;


    @FindBy(xpath = "(//div[@class='row'])[2]")
    public WebElement bilgilerTablosu;

    @FindBy(xpath = "//span[@class='d-none d-md-inline']")
    public WebElement backButonu;

    @FindBy(xpath = "//span[text()='Edit']")
    public List<WebElement> editButonu;

    @FindBy(xpath = "//input[@name='activated']")
    public WebElement activatedButonu;

    @FindBy(xpath = "//select[@id='authorities']")
    public WebElement profiles;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveBotunu;

    @FindBy(xpath = "//span[text()='Delete']")
    public List<WebElement> deleteButonu;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement deleteButonu2;
}
