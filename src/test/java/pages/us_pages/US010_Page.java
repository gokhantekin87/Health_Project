package pages.us_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US010_Page {

    public US010_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    public WebElement choiceElement(List<WebElement> myStoreMenu, String str) {
        WebElement element = null;
        for (WebElement w : myStoreMenu) {
            if (w.getText().equalsIgnoreCase(str)) {
                element = w;
            }
        }
        return element;
    }
}