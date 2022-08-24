package pages.admin_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {

    public AdminPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "entity-menu") public WebElement itemTitlesMenu;
    @FindBy(xpath = "(//a[@href='/room'])[1]") public WebElement roomButton;
    @FindBy(xpath = "(//a[@href='/c-test-item'])[1]") public WebElement testItemButton;
}
