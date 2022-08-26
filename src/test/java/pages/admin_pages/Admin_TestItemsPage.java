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

}
