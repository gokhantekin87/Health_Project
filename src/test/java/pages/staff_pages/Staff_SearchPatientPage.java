package pages.staff_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Staff_SearchPatientPage {

    Staff_SearchPatientPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//tbody")public WebElement paientTbody;
}
