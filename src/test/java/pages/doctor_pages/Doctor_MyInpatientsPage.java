package pages.doctor_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Doctor_MyInpatientsPage {
    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement myPagesButton;

    @FindBy(xpath="//*[text()='My Inpatients']")
    public WebElement inpatientsSekmesi;

}
