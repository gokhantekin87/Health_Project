package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.admin_pages.Admin_PatientPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US015_PatientStepDef {
    Admin_PatientPage admin_patientPage= new Admin_PatientPage();

    @Given("Admin medunna url e gider")
    public void admin_medunna_url_e_gider() {Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));}

    @Given("Admin accountButton u tiklar")
    public void admin_account_button_u_tiklar() {admin_patientPage.accountButton.click();}

    @Given("Admin sign in secenegini tiklar")
    public void admin_sign_in_secenegini_tiklar() {admin_patientPage.signInButton.click();}

    @Then("Admin username ve password ile giris yapar")
    public void admin_username_ve_password_ile_giris_yapar() {
        admin_patientPage.usernameBox.sendKeys("team59medunna");
        admin_patientPage.passwordBox.sendKeys("medunna2022.team59");
        admin_patientPage.sign2Button.click();
    }

    @Then("Admin item&titles butonumu tıklar")
    public void admin_item_titles_butonumu_tıklar() {admin_patientPage.itemsButton.click();}

    @Then("Admin patient secenegini tıklar")
    public void admin_patient_secenegini_tıklar() {admin_patientPage.patientButton.click();}

    @Then("Admin yeni hasta olustur kutusunu tıklar")
    public void admin_yeni_hasta_olustur_kutusunu_tıklar() {admin_patientPage.createPatientButton.click();}

    @Then("Admin  hasta bilgilerini girer")
    public void admin_hasta_bilgilerini_girer() {
        admin_patientPage.firstnameBox.sendKeys("Ayla");
        admin_patientPage.lastnameBox.sendKeys("Ayla");
        admin_patientPage.birthDateBox.sendKeys("01011991 0101");

    }
    @Then("Admin kayıt butonuna tıklar")
    public void admin_kayıt_butonuna_tıklar() {admin_patientPage.saveButton.click();}


    @When("Admin islem basarili uyarisini görür")
    public void admin_islem_basarili_uyarisini_görür () {Assert.assertTrue(admin_patientPage.islemBasarili.isDisplayed());}

    }
