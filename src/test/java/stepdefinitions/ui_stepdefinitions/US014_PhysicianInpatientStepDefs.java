package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.us_pages.US014_PhysicianInpatientPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class US014_PhysicianInpatientStepDefs {
    US014_PhysicianInpatientPage us14Page = new US014_PhysicianInpatientPage();

    public US014_PhysicianInpatientStepDefs(){
    }
    @Then("Physician Inpatients sayfasına gecis yapar ve tıklar")
    public void physician_ınpatients_sayfasına_gecis_yapar_ve_tıklar() {
        ReusableMethods.waitFor(2);
        us14Page.inpatientsSekmesi.click();
    }
    @Then("Physician edit butonuna tıklar")
    public void physician_edit_butonuna_tıklar() {
        ReusableMethods.waitFor(2);
        us14Page.editButonu.click();
    }
    @Then("Physician Inpatients bilgilerini gorur")
    public void physician_ınpatients_bilgilerini_gorur() {
        us14Page.inpatientsBilgileri.isDisplayed();
    }

    @Then("Physician unapproved edit butonuna tıklar")
    public void physician_unapproved_edit_butonuna_tıklar() throws InterruptedException {

        JSUtils.scrollDownByJS();
        ReusableMethods.waitFor(5);
        this.us14Page.unapprovedEditButonu.click();
    }
    @Then("Physician status durumunu degistirebilir olduğunu dogrular")
    public void physician_status_durumunu_degistirebilir_olduğunu_dogrular() {
        ReusableMethods.waitFor(2);
        JSUtils.scrollDownByJS();
        Select select = new Select(us14Page.statusDropDown);
        select.selectByValue("STAYING");
        ReusableMethods.waitFor(5);
        Select sel = new Select(us14Page.roomDdown);
        select.selectByValue("401:TWIN null");
        JSUtils.scrollDownByJS();
        //Actions actions=new Actions(Driver.getDriver());
        JSUtils.clickElementByJS(us14Page.unapprovedSaveButton);
        //us14Page.saveButton.click();
        //us14Page.savingTable.isDisplayed();
        //String expectedStatus ="STAYING";
        //String actualStatus =us14Page.statusCubugu.getText();
        //Assert.assertEquals(expectedStatus, actualStatus);
    }
    @Then("Physician staying edit butonuna tıklar")
    public void physicianStayingEditButonunaTıklar() {
        this.us14Page.stayingEditButonu.click();
    }

    @Then("Physician room guncelleyebilir")
    public void physician_room_guncelleyebilir() {
        JSUtils.scrollDownByJS();
        ReusableMethods.waitFor(2);
        JSUtils.scrollDownByJS();
        Select roomSelect = new Select(us14Page.roomDdown);
        roomSelect.selectByVisibleText("907:DELUXE FULL-UNAVAILABLE");
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(us14Page.stayingSaveButton);
        ReusableMethods.waitFor(5);
        JSUtils.scrollDownByJS();
        ReusableMethods.waitFor(2);
        //String expectedRoom = "907";
        String actualRoom= "us14Page.webTableRoom.getText()";
        //us14Page.webTableRoom.getText();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(actualRoom.contains("907"));
    }


}
