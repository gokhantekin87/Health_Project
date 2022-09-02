package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US024_page {

    public US024_page(){
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement MyPAGESpatient;

    @FindBy(xpath = "//span[text()='Show Tests']")
    public WebElement showtest;

    @FindBy(xpath = "//span[text()='View Results']")
    public WebElement viewresukt;



    @FindBy(xpath = "//table[@class='table']")
    public WebElement table;


    @FindBy(xpath = "//span[text()='Show Invoice']")
    public WebElement ShowInvoice;

    @FindBy(xpath = "(//th[@style='font-size: 25px;'])[2]")
    public static WebElement date;

    @FindBy(xpath = "(//th[@style='font-size: 25px;'])[4]")
    public static WebElement SSNn;

    @FindBy(xpath = "(//th[@style='font-size: 25px;'])[6]")
    public static WebElement namee;

    @FindBy(xpath = "(//th[@style='font-size: 25px;'])[8]")
    public static WebElement PaymentMethod;

    @FindBy(xpath = "(//th[@style='font-size: 25px;'])[10]")
    public static WebElement totalcost;


    @FindBy(xpath = "(//span[@style='color: rgb(255, 255, 255);'])[6]")
    public WebElement contact;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement contactname;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement contactemail;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement contactsubject;

    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement contactmesaj;

    @FindBy(xpath = "//span[text()='Send']")
    public WebElement contactsend;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']\n")
    public WebElement mesajbasarili;

//strong[text='Your message has been received']














}
