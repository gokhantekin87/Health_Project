package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US001_Page {
        public US001_Page() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//a[@aria-haspopup='true']")
        public WebElement manIcon;

        @FindBy(xpath = "//span[text()='Register']")
        public WebElement Register;

        @FindBy(xpath = "//input[@name='ssn']")
        public WebElement SSNBox;

        @FindBy(xpath = "//input[@name='firstName']")
        public WebElement firstNameBox;

        @FindBy(xpath = "//input[@name='lastName']")
        public WebElement lastName;

    }
