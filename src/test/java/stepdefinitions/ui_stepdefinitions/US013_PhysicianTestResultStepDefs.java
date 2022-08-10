package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.us_pages.US013_PhysicianTestResultPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US013_PhysicianTestResultStepDefs {
    US013_PhysicianTestResultPage us13page = new US013_PhysicianTestResultPage();

    public US013_PhysicianTestResultStepDefs() {

    }
    @Given("Physician medunna anasayfasina gider")
    public void physician_medunna_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Physician Sign in sekmesine gecis yapar ve tıklar")
    public void physician_sign_in_sekmesine_gecis_yapar_ve_tıklar() {
        this.us13page.signInSekmesi.click();
    }
    @Then("Physician giris yapar")
    public void physician_giris_yapar() {
        this.us13page.signInButonu.click();
        this.us13page.usernameKutusu.sendKeys("doctorKibar");
        this.us13page.passwordKutusu.sendKeys("Kocaeli5.");
        this.us13page.signInButonu2.click();
    }
    @Then("Physician My Pages sekmesine gecis yapar ve tıklar")
    public void physician_my_pages_sekmesine_gecis_yapar_ve_tıklar() {
        ReusableMethods.waitFor(2);
        this.us13page.myPages.click();
    }
    @Then("Physician My Appointments sekmesine gecis yapar ve tıklar")
    public void physician_my_appointments_sekmesine_gecis_yapar_ve_tıklar() {
        ReusableMethods.waitFor(2);
        this.us13page.myAppointments.click();
    }
    @Then("Physician Edit sekmesine gecis yapar ve tıklar")
    public void physician_edit_sekmesine_gecis_yapar_ve_tıklar() {
        ReusableMethods.waitFor(2);
        this.us13page.editSekmesi.click();
    }
    @Then("Physician Show Test Result sekmesine gecis yapar ve tıklar")
    public void physician_show_test_result_sekmesine_gecis_yapar_ve_tıklar() {
        ReusableMethods.waitFor(2);
        this.us13page.showTestResultSekmesi.click();
    }
    @Then("Physician View Result sekmesine gecis yapar ve tıklar")
    public void physician_view_result_sekmesine_gecis_yapar_ve_tıklar() {
        ReusableMethods.waitFor(2);
        this.us13page.viewTestResultButonu.click();
    }
    @And("Physician Test Result tablosunu gorebilir")
    public void physicianTestResultTablosunuGorebilir() {

        this.us13page.testResultBody.isDisplayed();
    }
    @And("Physician Request Inpatient butonuna tıklar.")
    public void physicianRequestInpatientButonunaTıklar() {

        this.us13page.requestInpatientButonu.click();
    }
}


