package pages.admin_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Admin_RoomsPage {

    public Admin_RoomsPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "entity-menu") public WebElement itemTitlesMenu;
    @FindBy(xpath= "//input[@id='rememberMe']") public WebElement rememberMe;
    @FindBy(xpath = "(//a[@href='/room'])[1]") public WebElement roomButton;
    //https://medunna.com/room?page=1&sort=id,asc    //tr[1]//td[3]//span[text()='DELUXE']
    @FindBy(xpath = "//thead") public WebElement headers;
    @FindBy(xpath = "//th//span[text()='ID']") public WebElement ID;
    @FindBy(xpath = "//th//span[text()='Room Type']") public WebElement RoomType;
    @FindBy(id = "room-heading") public WebElement pageHead;
    @FindBy(id = "jh-create-entity") public WebElement createButton;
    @FindBy(xpath = "//h2") public WebElement createPageHead;
    //https://medunna.com/room/new       class=Toastify__toast-body
    @FindBy(id = "room-roomNumber") public WebElement roomNumberTextbox;
    @FindBy(id = "room-roomType") public WebElement roomTypeddm;
    @FindBy(id = "room-status") public WebElement roomStatusCheckbox;
    @FindBy(id = "room-price") public WebElement roomPriceTextbox;
    @FindBy(id = "room-description") public WebElement roomDescriptionTextbox;
    @FindBy(id = "room-createdDate") public WebElement roomDateTextbox;
    @FindBy(id = "save-entity") public WebElement saveButton;
    @FindBy(id = "cancel-save") public WebElement backButton;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']") public WebElement sucsessMesage;
    //A new Room is created with identifier 222581
    @FindBy(xpath = "//dl[@class='jh-entity-details']") public WebElement viewTable;
    @FindBy(xpath = "//dd[6]//span") public WebElement dateActual;
    @FindBy(id = "jhi-confirm-delete-room") public WebElement deleteButton;

    @FindBy(id = "roomNumberLabel") public WebElement roomNumberH;
    @FindBy(xpath = "//*[text()='This field is required.']") public WebElement requiredField;
    @FindBy(xpath = "//*[text()='This field should be a number.']") public WebElement numberField;
    @FindBy(xpath = "//input[@class='form-control is-touched is-dirty av-valid form-control']") public WebElement validField;
    //form-control is-touched is-dirty av-invalid is-invalid form-control
    @FindBy(id = "roomTypeLabel") public WebElement roomTypeH;
    @FindBy(id = "statusLabel") public WebElement statusH;
    @FindBy(id = "priceLabel") public WebElement priceH;
    @FindBy(id = "descriptionLabel") public WebElement descH;
    @FindBy(id = "createdDateLabel") public WebElement dateH;





}
