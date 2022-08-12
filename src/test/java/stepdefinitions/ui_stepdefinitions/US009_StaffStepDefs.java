package stepdefinitions.ui_stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.staff_pages.StaffPage;
import pages.staff_pages.Staff_SearchPatientPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

import static utilities.ReusableMethods.waitFor;

public class US009_StaffStepDefs {

    StaffPage page=new StaffPage();
    Staff_SearchPatientPage patientPage=new Staff_SearchPatientPage();
    SoftAssert softAssert = new SoftAssert();
 

    @And("My Pages sekmesinden Search Patient tiklar")
    public void myPagesSekmesindenSearchPatientTiklar() {
        page.staffMyPage.click();
        page.searchPatient.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("search-patient"));}

    @Then("Tabloda {string} gorunur oldugunu dogrular")
    public void tablodaGorunurOldugunuDogrular(String patientInfo) {
     softAssert.assertTrue(Driver.getDriver().findElement(By.xpath("//td[text()='"+patientInfo+"']")).isDisplayed(),
             " "+patientInfo+" is not displayed ");
        softAssert.assertAll();}


    @When("Staff Edit butonuna tiklar")
    public void staffEditButonunaTiklar() {
        JSUtils.clickElementByJS(patientPage.editButton);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("patient-update"));}

    @And("Staff {string} duzenler ve {string} girer")
    public void staffDuzenlerVeGirer(String locate, String testData) {
        Driver.getDriver().findElement(By.id(""+locate+"")).clear();
        Driver.getDriver().findElement(By.id(""+locate+"")).sendKeys(""+testData+"");}

    @And("Staff Gender, Blood Group, User, Country, State City duzenler")
    public void staffGenderBloodGroupUserCountryStateCityDuzenler() {
        Select genderSelect=new Select(patientPage.patientGenderddm);
        Select bloodSelect=new Select(patientPage.patientBloodGroupddm);
        Select userSelect=new Select(patientPage.patientUserddm);
        Select countrySelect=new Select(patientPage.patientCountryddm);
        Select stateSelect=new Select(patientPage.patientStateddm);
        genderSelect.selectByVisibleText("MALE");
        bloodSelect.selectByVisibleText("AB-");
        userSelect.selectByVisibleText("usrecept");
        countrySelect.selectByVisibleText("France");
        //stateSelect.selectByVisibleText("NY");
        }


    @Then("Staff Save butonuna tiklar")
    public void staffSaveButonunaTiklar() {JSUtils.clickElementByJS(patientPage.saveButton);}

    @And("Acilan sayfada duzenlemeler kaydedildimi dogrular")
    public void acilanSayfadaDuzenlemelerKaydedildimiDogrular() {
        softAssert.assertTrue(Driver.waitForVisibility(patientPage.updatePopup,2).isDisplayed());
        softAssert.assertTrue(Driver.getDriver().getCurrentUrl().contains("patient-detail"));}

    @And("Staff arama cubuguna SSN numarasi {string} girer")
    public void staffAramaCubugunaSSNNumarasiGirer(String ssn) {
        Actions actions=new Actions(Driver.getDriver());
        //patientPage.ssnTextbox.sendKeys(ssn);
       // patientPage.ssnTextbox.sendKeys("123-78-9871");
       // patientPage.ssnTextbox.sendKeys(ConfigReader.getProperty("us9ssn"));
        //actions.click(patientPage.ssnTextbox).sendKeys("123-78-9871").perform();
        waitFor(5);
    }

    @Then("Sonucun aranan SSN numarasi icerdigini {string} dogrular")
    public void sonucunArananSSNNumarasiIcerdiginiDogrular(String ssn) {
      Assert.assertTrue(patientPage.patientTbody.getText().contains(ssn));
       // Assert.assertTrue(""+ssn+" yok",Driver.getDriver().findElement(By.xpath("//td[text()='"+ssn+"']")).isDisplayed());
    //Assert.assertTrue(patientPage.ssnValid.isDisplayed());
    }

    @And("Show Appointment butonuna tiklar")
    public void showAppointmentButonunaTiklar() {
      // JSUtils.clickElementByJS(patientPage.showAppButton);
        }

    @Then("Appointments tablosunda kayit bilgilerini icerdigini dogrular")
    public void appointmentsTablosundaKayitBilgileriniIcerdiginiDogrular() {
        softAssert.assertTrue(patientPage.patientTbody.getText().contains("164343"),"id");
        softAssert.assertTrue(patientPage.patientTbody.getText().contains("08/08/22 03:00"),"start date");
        softAssert.assertTrue(patientPage.patientTbody.getText().contains("08/08/22 04:00"),"end date");
        softAssert.assertTrue(patientPage.patientTbody.getText().contains("UNAPPROVED"),"status");
        softAssert.assertTrue(patientPage.patientTbody.getText().contains("Hasta"),"patient name");
        softAssert.assertAll();}

    @Then("Staff hasta bigilerini siler ve kaydeder")
    public void staffHastaBigileriniSilerVeKaydeder() {
        patientPage.patientIdTextbox.clear();
        patientPage.patientFirstnameTextbox.clear();
        patientPage.patientLastnameTextbox.clear();
        patientPage.patientBirthTextbox.clear();
        //JSUtils.clickElementByJS(patientPage.saveButton);
        }

    @And("Staff duzenleme kaydedildi mi dogrular")
    public void staffDuzenlemeKaydedildiMiDogrular() {
        Assert.assertTrue(patientPage.updatePopup.isDisplayed());}
}
