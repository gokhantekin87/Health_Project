package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.admin_pages.Admin_TestItemsPage;
import utilities.Driver;

import static org.junit.Assert.assertEquals;

public class US017_TestItemStepDefs {

    Admin_TestItemsPage page=new Admin_TestItemsPage();

    @And("admin Test Items sayfasina gecis yapar")
    public void adminTestItemsSayfasinaGecisYapar() {
        page.itemTitlesMenu.click();
        page.testItemButton.click();
    }

    @And("Create a new test item butonuna tiklar")
    public void createANewTestItemButonunaTiklar() {
        page.createButton.click();
    }

    @Then("Create or edit test item sayfasinin acildigini dogrular")
    public void createOrEditTestItemSayfasininAcildiginiDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("c-test-item/new"));
        assertEquals(page.createPageHead.getText(),"Create or edit a Test Item");
    }

    @And("Name {string} girer")
    public void nameGirer(String name) {
        page.testItemNameTextbox.sendKeys(name);
    }

    @And("description {string} girer")
    public void descriptionGirer(String desc) {
        page.testItemDescTextbox.sendKeys(desc);
    }

    @And("price {string} girer")
    public void priceGirer(String price) {
        page.testItemPriceTextbox.sendKeys(price);
    }

    @And("Default Min. {string} girer")
    public void defaultMinGirer(String dfmin) {
        page.testItemDMinTextbox.sendKeys(dfmin);
    }

    @And("Default Max. {string} girer")
    public void defaultMaxGirer(String dfmax) {
        page.testItemDMaxTextbox.sendKeys(dfmax);
    }
    @And("created Date {string} girer")
    public void createdDateGirer(String date) {
        page.testItemDateTextbox.sendKeys(date);
    }


}
