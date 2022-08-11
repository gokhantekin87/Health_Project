package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US002_AyhanPage {

    public US002_AyhanPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-haspopup='true']")
    public WebElement character;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[4]")
    public WebElement invalidUsernameFeedback;

    @FindBy(xpath = "(//*[@class='invalid-feedback'])[5]")
    public WebElement invalidEmailFeedback;

}
