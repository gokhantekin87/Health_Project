package stepdefinitions.ui_stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.staff_pages.StaffPage;
import pages.staff_pages.Staff_SearchPatientPage;
import utilities.Driver;
import utilities.JSUtils;

public class US009_StaffStepDefs {

    StaffPage page=new StaffPage();
    Staff_SearchPatientPage patientPage=new Staff_SearchPatientPage();
 

    @And("My Pages sekmesinden Search Patient tiklar")
    public void myPagesSekmesindenSearchPatientTiklar() {
        page.staffMyPage.click();
        page.searchPatient.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("search-patient"));}

    @Then("Tabloda {string} gorunur oldugunu dogrular")
    public void tablodaGorunurOldugunuDogrular(String patientInfo) {
     Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//td[text()='"+patientInfo+"']")).isDisplayed());

        }



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
        Assert.assertTrue(Driver.waitForVisibility(patientPage.updatePopup,2).isDisplayed());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("patient-detail"));

    }

    @And("Staff arama cubuguna SSN numarasi {string} girer")
    public void staffAramaCubugunaSSNNumarasiGirer(String ssn) {
        Driver.getDriver().navigate().refresh();
        patientPage.ssnTextbox.sendKeys(ssn);
    }

    @Then("Sonucun aranan SSN numarasi icerdigini {string} dogrular")
    public void sonucunArananSSNNumarasiIcerdiginiDogrular(String ssn) {
      Assert.assertTrue(patientPage.patientTbody.getText().contains(ssn));
        Assert.assertTrue(""+ssn+" yok",Driver.getDriver().findElement(By.xpath("//td[text()='"+ssn+"']")).isDisplayed());
    Assert.assertTrue(patientPage.ssnValid.isDisplayed());
    }

    @And("Show Appointment butonuna tiklar")
    public void showAppointmentButonunaTiklar() {
       JSUtils.clickElementByJS(patientPage.showAppButton);
        }

    @Then("Appointments tablosunda kayit bilgilerini icerdigini dogrular")
    public void appointmentsTablosundaKayitBilgileriniIcerdiginiDogrular() {
        Assert.assertTrue(patientPage.patientTbody.getText().contains("164343"));
        Assert.assertTrue(patientPage.patientTbody.getText().contains("08/08/22 03:00"));
        Assert.assertTrue(patientPage.patientTbody.getText().contains("08/08/22 04:00"));
        Assert.assertTrue(patientPage.patientTbody.getText().contains("UNAPPROVED"));
        Assert.assertTrue(patientPage.patientTbody.getText().contains("Hasta"));

    }

    @Then("Staff hasta bigilerini siler ve kaydeder")
    public void staffHastaBigileriniSilerVeKaydeder() {
        // Invalid State--> patientPage.patientIdTextbox.clear();
        Driver.getDriver().navigate().refresh();
        patientPage.patientFirstnameTextbox.clear();
        patientPage.patientLastnameTextbox.clear();
        patientPage.patientBirthTextbox.clear();
        patientPage.patientEmailTextbox.clear();
        patientPage.paitientPhoneTextbox.clear();
        patientPage.patientAdressTextbox.clear();
        patientPage.patientDescTextbox.clear();
        JSUtils.clickElementByJS(patientPage.saveButton);
        }

    @And("Staff duzenleme kaydedildi mi dogrular")
    public void staffDuzenlemeKaydedildiMiDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("patient-detail"));}


}
