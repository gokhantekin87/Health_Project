package pages.us_pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US027_AdMesPage {
    public US027_AdMesPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement userIcon;

    @FindBy(id = "login-item")
    public WebElement signIn; //SignIn sayfasini acma butonu

    @FindBy(id = "username")
    public WebElement usernameTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(xpath = "(//span[text()='Sign in'])[3]")
    public WebElement signInButton; //SignIn sayfasindaki signin buttonu

    @FindBy(xpath = "//*[@id='admin-menu']/a/span")
    public WebElement administrationDropdown;

    @FindBy (xpath = "//span[normalize-space()='Items&Titles']")
    public WebElement ıtemsAndTitlesDropDown;

    @FindBy (xpath = "//span[normalize-space()='Messages']")
    public WebElement ıtemsAndTitlesDropdownMessagesButton;

    @FindBy (xpath = "(//*[.='Messages'])[2]")
    public WebElement messagePageMessagesText;

    @FindBy (xpath = "(//table//tbody//tr[position()<=last()])//td[position()<6]")
    public List<WebElement> allMessages;

    @FindBy (xpath = "//table//tbody//tr//td[1]")
    public List<WebElement> messagesIdColumn;

    @FindBy (xpath = "//table//tbody//tr//td[2]")
    public List<WebElement> messagesNameColumn;

    @FindBy (xpath = "//table//tbody//tr//td[3]")
    public List<WebElement> messagesEmailColumn;

    @FindBy (xpath = "//table//tbody//tr//td[4]")
    public List<WebElement> messagesSubjectColumn;

    @FindBy (xpath = "//table//tbody//tr//td[5]")
    public List<WebElement> messagesMessageColumn;

    @FindBy (xpath = "//span[normalize-space()='Create a new Message']")
    public WebElement createANewMessage;

    @FindBy (xpath = "(//*[.='Create or edit a Message'])[4]")
    public WebElement createOrEditAMessagePageText;

    @FindBy (id ="c-message-name")
    public WebElement messageNameTextBox;

    @FindBy (id = "c-message-email")
    public WebElement messageEmailTextBox;

    @FindBy (id = "c-message-subject")
    public WebElement messageSubjectTextBox;

    @FindBy (id = "c-message-message")
    public WebElement messageMessageTextBox;

    @FindBy (xpath = "//*[.='Save']")
    public WebElement createOrEditAMessageSaveButton;

    @FindBy (xpath = "//*[contains(text(),'A new Message is created with identifier')]")
    public WebElement successfullyCreatedANewMessageText;

    @FindBy (xpath = "(//*[.='Edit'])[1]")
    public WebElement messagePageFirstEditButton;

    @FindBy (xpath = "//*[contains(text(),'A Message is updated with identifier')]")
    public WebElement succesfullyUpdatedMessageText;

    @FindBy(xpath = "(//*[.='Delete'])[1]")
    public WebElement messagePageFirstDeleteButton;

    @FindBy(xpath = "//*[contains(text(),'Are you sure you want to delete Message')]")
    public WebElement deleteConfirmationText;

    @FindBy(id="jhi-confirm-delete-cMessage")
    public WebElement deleteConfirmationBoxDeleteButton;

    @FindBy (xpath = "//*[contains(text(),'Message is deleted with identifier')]")
    public WebElement succesfullyDeletedMessageText;






}
