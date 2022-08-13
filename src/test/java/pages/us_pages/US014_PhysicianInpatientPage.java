package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US014_PhysicianInpatientPage {
    public US014_PhysicianInpatientPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//*[text()='My Inpatients']")
    public WebElement inpatientsSekmesi;

    @FindBy(xpath="(//div[@class='btn-group flex-btn-group-container'])[1]")
    public WebElement editButonu;

    @FindBy(xpath="//div[@class='jh-card card']")
    public WebElement inpatientsBilgileri;


    @FindBy(xpath="//select[@id='in-patient-status']")
    public WebElement statusDropDown;

    @FindBy(xpath="//*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr[2]/td[10]/div/a")
    public WebElement unapprovedEditButonu;
    ////*[@id="app-view-container"]/div/div/div/div/div/table/tbody/tr[5]/td[10]/div/a
    //(//div[@class='btn-group flex-btn-group-container'])[6]
    @FindBy(xpath="//select[@class='form-control is-touched is-pristine av-valid form-control']")
    public WebElement statusCubugu;

    @FindBy(xpath="//*[@id='save-entity']")
    public WebElement unapprovedSaveButton;
    ////*[@id="save-entity"]  css->button[type='submit'] , //*[text()='Save']
    //xpath = "//button[@class='btn btn-primary']

    @FindBy(xpath="//*[@id='save-entity']")
    public WebElement stayingSaveButton;

    @FindBy(xpath="//*[@id='in-patient-room']")
    public WebElement roomDdown;
    ////*[@id="in-patient-room"]   //select[@id='in-patient-room']
    @FindBy(xpath="//*[@id='app-view-container']/div/div/div/div/div/table/tbody/tr[3]/td[10]/div/a")
    public WebElement stayingEditButonu;
    ////*[@id="app-view-container"]/div/div/div/div/div/table/tbody/tr[3]/td[10]/div/a
    //div[@class='btn-group flex-btn-group-container'])[3]
    @FindBy(xpath="//tbody//tr[3]//td[7]")
    public WebElement webTableRoom;

    ////tbody//tr[3]//td[7]

}
