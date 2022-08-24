package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US021_Page {
    public US021_Page(){
        PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(xpath="//button[@type='submit']")
    public WebElement signin2;

    @FindBy(xpath="(//a[@class='btn btn-warning btn-sm'])[1]")
    public WebElement showAppointment;

    @FindBy(xpath="(//span[@class='d-none d-md-inline'])[1]")
    public WebElement editShowTest;

    @FindBy(xpath="(//span['Create or Edit an Appointment'])[18])")
    public WebElement createorEditAppointment;

    @FindBy(xpath = "//select[@id='appointment-status']")
    public WebElement status;

    @FindBy(xpath = "//textarea[@name='anamnesis']")
    public WebElement anamnesis;

    @FindBy(xpath = "//textarea[@name='treatment']")
    public WebElement treatment;

    @FindBy(xpath = "//textarea[@name='diagnosis']")
    public WebElement diagnosis;

    @FindBy(xpath="(//span['Save'])[31]")
    public WebElement save;

    @FindBy(xpath="//select[@name='physician.id']")
    public WebElement doktorSec;
}
