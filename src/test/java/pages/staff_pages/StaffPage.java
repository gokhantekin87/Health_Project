package pages.staff_pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StaffPage {

    public StaffPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='MY PAGES']")public WebElement staffMyPage;
    @FindBy(xpath = "//span[text()='Search Patient']")public WebElement searchPatient;
    @FindBy(xpath = "//span[text()='In Patient']")public WebElement staffInPatient;
}
