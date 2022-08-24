package pages.us_pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class US028_Page {
    public US028_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement accountMenu;

    @FindBy(xpath = "//a[@id='login-item']//*[name()='svg']")
    public WebElement homePageSignIn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement signInPageSignInButton;

    @FindBy(xpath = "//span[normalize-space()='Bilal Ergin']")
    public WebElement adminPage;

    @FindBy(xpath = "//span[normalize-space()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(xpath = "//span[normalize-space()='Country']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//span[normalize-space()='Countries']")
    public WebElement countriesHeader;

    @FindBy(xpath = "//span[normalize-space()='Create a new Country']")
    public WebElement createANewCountryButton;

    @FindBy(xpath = "//input[@id='country-name']")
    public WebElement countryNameBox;

    @FindBy(xpath = "//span[normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement alertNewCountryCreated;

    @FindBy(xpath = "//*[@id=\"entity-menu\"]/div/a[8]/span")
    public WebElement stateCityHeader;

    @FindBy(xpath = "//*[@id=\"jh-create-entity\"]/span")
    public WebElement createANewStateCity;

    @FindBy(xpath = "//input[@id='c-state-name']")
    public WebElement stateCityNameBox;

    @FindBy(xpath = "//select[@id='c-state-state']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement stateCityAlert;

    @FindBy(xpath = "//tbody//tr[last()]/td[4]/div/a[3]")
    public WebElement deleteCountry;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-country']//span[contains(text(),'Delete')]")
    public WebElement deleteConfirm;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div")
    public WebElement deletedMessage;
}
