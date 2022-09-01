package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.us_pages.US023_Page;
import utilities.Driver;

public class US023_StepDefinition {


    US023_Page ay = new US023_Page();



    @Given("kullinci medunna sayafasina gider")
    public void kullinci_medunna_sayafasina_gider() {
        Driver.getDriver().get("https://www.medunna.com");

    }

    @Given("kullanici kimlik bilgileriyle signs in klik yapar")
    public void kullanici_kimlik_bilgileriyle_signs_in_klik_yapar() {
        Driver.waitAndClick(ay.loginDropdown);
        Driver.waitAndClick(ay.signInButton);
        Driver.waitAndSendText(ay.username,"personelnotilus");//Staff username
        Driver.waitAndSendText(ay.password,"571571");
        Driver.waitAndClick(ay.loginButton);

    }

    @Given("kullanici my pages e klik yapar")
    public void kullanici_my_pages_e_klik_yapar() {
        Driver.waitAndClick(ay.myPagesDropdown);

    }

    @Given("kullanici patient arama butonuna klik yapar")
    public void kullanici_patient_butonuna_klik_yapar() {
        Driver.waitAndClick(ay.searchPatientButton);
        Driver.wait(2);


    }

    @Then("user searchs patient with SSN {string} in the search box")
    public void user_searchs_patient_with_ssn_in_the_search_box(String ssn) {
        Driver.waitAndSendText(ay.patientSSNTextBox,ssn);
        Driver.wait(3);

    }

    @Then("kullanici appointment butonuna tiklar")
    public void kullanii_ppointment_butonuna_tiklar() {
        Driver.waitAndClick(ay.showAppointmentsButton);

    }

    @Then("kullanicipatient's status tamamlandığını veya iptal edildiğini dogrular")
    public void kullanicipatient_s_status_tamamlandığını_veya_iptal_edildiğini_dogrular() {
        Assert.assertTrue(Driver.waitForVisibility(ay.completedText,5).isDisplayed());
        Driver.wait(3);


    }

    @Then("kullanici payment invoice process butonuna klik yapar")
    public void kullanici_payment_invoice_process_butonuna_klik_yapar() {
        Driver.waitAndClick(ay.paymentInvoiceButton);


    }

    @Then("kullanici invoice pagede aşagındaki alanları görür")
    public void kullanici_invoice_pagede_aşagındaki_alanları_görür() {
        Driver.wait(3);
        Assert.assertTrue(ay.examFeeTxt.isDisplayed());
        Assert.assertTrue(ay.examFeePrice.isDisplayed());
        //Assert.assertTrue(ay.diabetesFee.isDisplayed());
        Assert.assertTrue(ay.theoTestFee.isDisplayed());
        //Assert.assertTrue(ay.nickyTestFee.isDisplayed());
        Driver.wait(3);


    }

    @Then("kullanici fatura oluşturma butonuna tiklar")
    public void kullanici_fatura_oluşturma_butonuna_tiklar() {
        Driver.waitAndClick(ay.createInvoiceButton);

    }

    @Then("kullanici kaydet butonuna tiklar")
    public void kullanici_kaydet_butonuna_tiklar() {
        Driver.waitAndClick(ay.saveButton);


    }

    @Then("kullanici başarı mesajını dogrular")
    public void kullanici_başarı_mesajını_dogrular() {
        Assert.assertTrue(Driver.waitForVisibility(ay.invoiceSuccessMessage,5).isDisplayed());


    }

    @Then("user search patient with SSN {string} in the search box again")
    public void user_search_patient_with_ssn_in_the_search_box_again(String ssn) {
        Driver.waitAndSendText(ay.patientSSNTextBox,ssn);


    }

    @Then("kullanıcı randevu göstere tıklar")
    public void kullanıcı_randevu_göstere_tıklar() {
        Driver.waitAndClick(ay.showAppointmentsButton);
        Driver.wait(3);


    }

    @Then("kullancı payment invoice için tekrar klik yapar")
    public void kullancı_payment_invoice_için_tekrar_klik_yapar() {
        Driver.waitAndClick(ay.paymentInvoiceButton);
        Driver.wait(3);

    }

    @Then("kullanıcı fatura göster butonuna klik yapar")
    public void kullanıcı_fatura_göster_butonuna_klik_yapar() {
        Driver.wait(3);
        Driver.waitAndClick(ay.showInvoiceButton);


    }

    @Then("kullanıcı invoice page i dogrular")
    public void kullanıcı_invoice_page_i_dogrular() {
        Driver.wait(3);
        Assert.assertTrue(ay.invoicePageHeader.isDisplayed());
        Driver.closeDriver();


    }

}
