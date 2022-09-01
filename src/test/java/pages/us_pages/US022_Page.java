package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US022_Page {
    public US022_Page(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="(//td['16556'])[3]")
    public WebElement isim;

    @FindBy(xpath="(//span['Show Appointments'])[42]")
    public WebElement showApp;

    @FindBy(xpath="(//span['Show Appointments'])[45]")
    public WebElement showAppTest;

    @FindBy(xpath = "(//td['Test:128682022-06-30T19:39:46.476223Z'])[2]")
    public WebElement testAdi;
    @FindBy(xpath = "//span[text()='No Tests found']") public WebElement notestfound;

    @FindBy(xpath="//span[@class='d-none d-md-inline']")
    public WebElement viewResult;

    @FindBy(xpath="(//span['ID'])[19]")
    public  WebElement ID;
    @FindBy(xpath="(//span['ID'])[20]")
    public  WebElement nam;
    @FindBy(xpath="(//span['ID'])[21]")
    public  WebElement Result;




}

