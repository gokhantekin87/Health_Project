package stepdefinitions.ui_stepdefinitions;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;
import pages.doctor_pages.Doctor_MyAppointmentsPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.JSUtils.clickElementByJS;

public class US011_MyAppointmentsDef {

Doctor_MyAppointmentsPage myAppointments= new Doctor_MyAppointmentsPage();



    @Given("Doktor medunnaUrl ine gider")
    public void doktor_medunna_url_ine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Doktor accountButton u tiklar")
    public void doktor_account_button_u_tiklar() {
        myAppointments.accountButton.click();
    }
    @When("Doktor sign in secenegini tiklar")
    public void doktor_sign_in_secenegini_tiklar() {
        myAppointments.signInButton.click();

    }
    @When("Doktor doktorKullaniciAdi girer")
    public void doktor_doktor_kullanici_adi_girer() {
      myAppointments.usernameBox.sendKeys(ConfigReader.getProperty("doktorKullaniciAdi"));
    }
    @When("Doktor {int} saniye bekler")
    public void doktor_saniye_bekler(Integer istenenSaniye) throws InterruptedException {
       Thread.sleep(istenenSaniye*1000);

    }
    @When("doktor doktorKullaniciSifre girer")
    public void doktor_doktor_kullanici_sifre_girer() {
        myAppointments.passwordBox.sendKeys(ConfigReader.getProperty("doktorKullaniciSifre"));
    }
    @When("Doktor giris icin sign in  tiklar")
    public void doktor_giris_icin_sign_in_tiklar() {
        myAppointments.sign2Button.click();
    }
    @When("Sayfalarim bolumunden  randevularim i secer")
    public void sayfalarim_bolumunden_randevularim_i_secer() {
        myAppointments.myPagesButton.click();
        myAppointments.myAppointmentButton.click();
    }
    @When("Doktor from bolumune baslangic tarihi girer")
    public void doktor_from_bolumune_baslangic_tarihi_girer() {
      myAppointments.fromBox.sendKeys(ConfigReader.getProperty("baslangicTarihi"));
    }
    @When("Doktor to bolumune bitis tarihi girer")
    public void doktor_to_bolumune_bitis_tarihi_girer() {
        myAppointments.fromBox.sendKeys(ConfigReader.getProperty("bitisTarihi"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("Doktor randevuda edit butonunu tiklar")
    public void doktor_randevuda_edit_butonunu_tiklar() {
       myAppointments.randevuEditButton.click();
    }

    @When("Doktor anamnesis, treatment ve diagnosis alanlarini doldurur")
    public void doktor_anamnesis_treatment_ve_diagnosis_alanlarini_doldurur() {
        myAppointments.anamnesisBox.clear();
        myAppointments.treatmentBox.clear();
        myAppointments.diagnosisBox.clear();

        myAppointments.anamnesisBox.sendKeys(ConfigReader.getProperty("doktorNot"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myAppointments.treatmentBox.sendKeys(ConfigReader.getProperty("doktorNot"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myAppointments.diagnosisBox.sendKeys(ConfigReader.getProperty("doktorNot"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @When("Doktor randevuyu kaydeder")
    public void doktor_randevuyu_kaydeder() throws InterruptedException {
     //   myAppointments.save.click();
        clickElementByJS(myAppointments.save);
        Thread.sleep(2000);
    }



    @Then("Doktor {string} mesajini görür")
    public void doktor_mesajini_görür(String basarili) {
        Assert.assertTrue(myAppointments.createAppointOnayButton.isDisplayed());

    }
    @Then("Doktor sayfayi kapatir")
    public void doktor_sayfayi_kapatir() {
      Driver.closeDriver();
    }

    @Then("Doktor hastanin id, start date time, end date time, Statüs, physician, patient bilgilerini görmelidir")
    public void doktorHastaninIdStartDateTimeEndDateTimeStatüsPhysicianPatientBilgileriniGörmelidir() {
        Assert.assertTrue(myAppointments.hastaId.isDisplayed());
        Assert.assertTrue(myAppointments.startDateTime.isDisplayed());
        Assert.assertTrue(myAppointments.endDateTime.isDisplayed());
        Assert.assertTrue(myAppointments.Status.isDisplayed());
        Assert.assertTrue(myAppointments.physician.isDisplayed());
        Assert.assertTrue(myAppointments.patient.isDisplayed());
    }

    @When("Doktor anamnesis kutusunu siler")
    public void doktor_anamnesis_kutusunu_siler() throws InterruptedException {
        clickElementByJS(myAppointments.anamnesisBox);
        myAppointments.anamnesisBox.clear();
        Thread.sleep(3000);
    }
    @Then("Doktor anamnesis kutusunun uyari verdigini görür")
    public void doktor_anamnesis_kutusunun_uyari_verdigini_görür() throws InterruptedException {
        Assert.assertTrue(myAppointments.invalidFeedbackBox.isDisplayed());
        Thread.sleep(1000);
    }
    @Then("Doktor treatment kutusunu siler")
    public void doktor_treatment_kutusunu_siler() throws InterruptedException {
        clickElementByJS(myAppointments.treatmentBox);
        myAppointments.treatmentBox.clear();
        Thread.sleep(1000);
    }
    @Then("Doktor treatment kutusunun uyari verdigini görür")
    public void doktor_treatment_kutusunun_uyari_verdigini_görür() throws InterruptedException {
        Assert.assertTrue(myAppointments.treatmentHataBox.isDisplayed());
        Thread.sleep(1000);
    }
    @Then("Doktor diagnosis kutusunu siler")
    public void doktor_diagnosis_kutusunu_siler() throws InterruptedException {
        clickElementByJS(myAppointments.diagnosisBox);
        myAppointments.diagnosisBox.clear();
        Thread.sleep(1000);
    }
    @Then("Doktor diagnosis kutusunun uyari verdigini görür")
    public void doktor_diagnosis_kutusunun_uyari_verdigini_görür() throws InterruptedException {
      Assert.assertTrue(myAppointments.diagnosisHataBox.isDisplayed());
      Thread.sleep(1000);
    }

    @And("Doktor prescription ve description alanlarini siler")
    public void doktorPrescriptionVeDescriptionAlanlariniSiler() throws InterruptedException {
        clickElementByJS(myAppointments.prescriptionBox);
        myAppointments.prescriptionBox.clear();
        myAppointments.descriptionBox.clear();
        Thread.sleep(2000);
    }

    @When("Doktor statüs kutusunda pending secer")
    public void doktor_statüs_kutusunda_pending_secer() {

    }
    @When("Doktor statüs kutusunda pending yazisini gorur")
    public void doktor_statüs_kutusunda_pending_yazisini_gorur() {

    }
    @When("Doktor statüs kutusunda completed secer")
    public void doktor_statüs_kutusunda_completed_secer() {

    }
    @When("Doktor statüs kutusunda completed yazisini gorur")
    public void doktor_statüs_kutusunda_completed_yazisini_gorur() {

    }
    @When("Doktor statüs kutusunda cancelled secer")
    public void doktor_statüs_kutusunda_cancelled_secer() {

    }
    @When("Doktor statüs kutusunda cancelled yazisini gorur")
    public void doktor_statüs_kutusunda_cancelled_yazisini_gorur() {

    }





  /*  @And("Doktor sayfayı indirir")
     public void clickElementByJS() {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) utilities.Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", element);

    }
    */
}