package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.admin_pages.Admin_TestItemsPage;
import utilities.Driver;

import static org.junit.Assert.assertEquals;

public class US017_TestItemStepDefs {

    Admin_TestItemsPage page=new Admin_TestItemsPage();

    String actualID;
    String deleteID;
    String sucsessMessage;

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
        page.testItemNameTextbox.clear();
        page.testItemNameTextbox.sendKeys(name);
    }

    @And("description {string} girer")
    public void descriptionGirer(String desc) {
        page.testItemDescTextbox.clear();
        page.testItemDescTextbox.sendKeys(desc);
    }

    @And("price {string} girer")
    public void priceGirer(String price) {
        page.testItemPriceTextbox.clear();
        page.testItemPriceTextbox.sendKeys(price);
    }

    @And("Default Min. {string} girer")
    public void defaultMinGirer(String dfmin) {
        page.testItemDMinTextbox.clear();
        page.testItemDMinTextbox.sendKeys(dfmin);
    }

    @And("Default Max. {string} girer")
    public void defaultMaxGirer(String dfmax) {
        page.testItemDMaxTextbox.clear();
        page.testItemDMaxTextbox.sendKeys(dfmax);
    }
    @And("created Date {string} girer")
    public void createdDateGirer(String date) {
        page.testItemDateTextbox.sendKeys(date);
    }

    @And("Save butona tiklar")
    public void saveButonaTiklar() {
        page.saveButton.click();
    }

    @And("{string} id li test ogesinin Edit butonuna tiklar")
    public void idLiTestOgesininEditButonunaTiklar(String id) {
        Driver.getDriver().findElement(By.xpath("//a[@href='/c-test-item/"+id+"/edit?page=1&sort=id,asc']")).click();
    }

    @Then("{string} yazisi gorunur oldugunu dogrular")
    public void yazisiGorunurOldugunuDogrular(String message) {
        Assert.assertTrue(page.sucsessMesage.isDisplayed());
        Assert.assertTrue(page.sucsessMesage.getText().contains(message));
        sucsessMessage=page.sucsessMesage.getText();
        System.out.println(sucsessMessage);
        actualID=sucsessMessage.substring(43);
        System.out.println(actualID);
    }

    @And("yeni olusturulan test ogesinin sayfasina navigate eder")
    public void yeniOlusturulanTestOgesininSayfasinaNavigateEder() {
        page.ID.click();
    }

    @Then("yeni test ogesinin id sinin gorunur oldugunu dogrular")
    public void yeniTestOgesininIdSininGorunurOldugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//a[text()='"+actualID+"']")).isDisplayed());
    }

    @And("test ogesinin view butonuna tiklar")
    public void testOgesininViewButonunaTiklar() {
        Driver.getDriver().findElement(By.xpath("(//a[@href='/c-test-item/"+actualID+"'])[2]")).click();
    }

    @Then("yeni test ogesinin bilgilerinin {string} {string} {string} {string} {string} oldugunu dogrular")
    public void yeniTestOgesininBilgilerininOldugunuDogrular(String n, String d, String p, String dmin, String dmax) {
        Assert.assertTrue(page.viewTable.getText().contains(n));
        Assert.assertTrue(page.viewTable.getText().contains(d));
        Assert.assertTrue(page.viewTable.getText().contains(p));
        Assert.assertTrue(page.viewTable.getText().contains(dmin));
        Assert.assertTrue(page.viewTable.getText().contains(dmax));
    }

    @Then("date {string} oldugunu dogrular")
    public void dateOldugunuDogrular(String date) {
        Assert.assertTrue("EXPECTED DATE ---> "+date+" \nACTUAL DATE ---> "+page.dateActual.getText()+" ",
                page.viewTable.getText().contains(date));
    }


    @And("{string} id li test ogesinin View butonuna tiklar")
    public void idLiTestOgesininViewButonunaTiklar(String arg0) {
        
    }

    @Then("{string} yazisi oldugunu dogrular")
    public void yazisiOldugunuDogrular(String arg0) {
    }
}
