package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US003_RegisterPage {

    public US003_RegisterPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement userIcon;

    @FindBy(xpath = "//*[text()='Registration']")
    public WebElement registrationText;

    @FindBy(xpath = "//input[@id='firstPassword']")
    public WebElement registerNewPasswordBox;

    @FindBy(xpath = "//input[@id='secondPassword']")
    public WebElement registerConfirmPasswordBox;

    @FindBy(xpath = "(//li[@class='point'])[1]")
    public static WebElement passwordStrenght1;

    @FindBy(xpath = "(//li[@class='point'])[2]")
    public static WebElement passwordStrenght2;

    @FindBy(xpath = "(//li[@class='point'])[3]")
    public static WebElement passwordStrenght3;

    @FindBy(xpath = "(//li[@class='point'])[4]")
    public static WebElement passwordStrength4;

    @FindBy(xpath = "(//li[@class='point'])[5]")
    public static WebElement passwordStrength5;









}


