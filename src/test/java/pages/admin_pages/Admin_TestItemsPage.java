package pages.admin_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_TestItemsPage {

    public Admin_TestItemsPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "entity-menu") public WebElement itemTitlesMenu;
    @FindBy(xpath = "(//a[@href='/c-test-item'])[1]") public WebElement testItemButton;
    @FindBy(xpath = "//thead") public WebElement headers;
    //@FindBy(id = "c-test-item-heading") public WebElement pageHead;
    @FindBy(id = "jh-create-entity") public WebElement createButton;
    @FindBy(xpath = "//h2") public WebElement createPageHead;
    @FindBy(id = "c-test-item-name") public WebElement testItemNameTextbox;
    @FindBy(id = "c-test-item-description") public WebElement testItemDescTextbox;
    @FindBy(id = "c-test-item-price") public WebElement testItemPriceTextbox;
    @FindBy(id = "c-test-item-defaultValMin") public WebElement testItemDMinTextbox;
    @FindBy(id = "c-test-item-defaultValMax") public WebElement testItemDMaxTextbox;
    @FindBy(id = "c-test-item-createdDate") public WebElement testItemDateTextbox;
    @FindBy(id = "save-entity") public WebElement saveButton;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']") public WebElement sucsessMesage;
    //A Test Item is deleted with identifier 237537
    //A Test Item is updated with identifier 237539
    //A new Test Item is created with identifier 237540
    @FindBy(xpath = "//th//span[text()='ID']") public WebElement ID;
    @FindBy(xpath = "//dl[@class='jh-entity-details']") public WebElement viewTable;
    @FindBy(xpath = "//dd[6]//span") public WebElement dateActual;
    @FindBy(id = "jhi-confirm-delete-cTestItem") public WebElement deleteButton;

//*****
    @FindBy(id = "nameLabel") public WebElement nameH;
    @FindBy(id = "descriptionLabel") public WebElement descH;
    @FindBy(id = "priceLabel") public WebElement priceH;
    @FindBy(id = "createdDateLabel") public WebElement dateH;
    @FindBy(id = "defaultValMinLabel") public WebElement minH;
    @FindBy(id = "defaultValMaxLabel") public WebElement maxH;
    @FindBy(xpath = "(//*[text()='This field is required.'])[1]") public WebElement requiredField;
    @FindBy(xpath = "(//*[text()='This field is required.'])[2]") public WebElement requiredField2;
    @FindBy(xpath = "//*[text()='This field should be at least 0.']") public WebElement invalidField;
    @FindBy(xpath = "(//input[@class='is-touched is-dirty av-valid form-control'])[1]") public WebElement validField1;


}
