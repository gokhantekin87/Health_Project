package stepdefinitions.ui_stepdefinitions;


import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.us_pages.US_007HastaRandevuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import static org.apache.commons.lang3.time.DateUtils.addDays;

public class US_007StepDef {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    US_007HastaRandevuPage us = new US_007HastaRandevuPage();

    ////    Bu kısmı US_006 ile aynı olduğu için stepler US_006 üzerinden çalışmaktadır ////

    //    Given Kullanıcı "anaSayfa"ya gider
    //    When Kullanıcı profil simgesine tıklar
    //    And Kullanıcı Sign in sekmesine tıklar
    //    And Kullanıcı "ValidHastaUserName" ve "ValidHastaUserPassword" girişi yapar
    //    And Kullanıcı Sign in buttonuna tıklar

    @Given("Kullanici {string}ya gider")
    public void kullanici_gider(String istenilenUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(istenilenUrl));


    }

    @When("Kullanici profil simgesine tiklar")
    public void kullanici_profil_simgesine_tiklar() {
        us.profilSimgesi.click();
    }

    @When("Kullanici Sign in sekmesine tiklar")
    public void kullanici_sign_in_sekmesine_tiklar() {
        us.signInButton.click();

    }

    @When("Kullanici {string} ve {string} girisi yapar")
    public void kullanici_ve_girisi_yapar(String ValidHastaUserName, String ValidHastaUserPassword) {

        us.signInUserNameTextBox.sendKeys(ConfigReader.getProperty(ValidHastaUserName));
        us.singInPasswordTextBox.sendKeys(ConfigReader.getProperty(ValidHastaUserPassword));


    }

    @When("Kullanici Sign in buttonuna tiklar")
    public void kullanici_sign_in_buttonuna_tiklar() {

        us.sighInSignInButton.click();


    }




    @When("Kullanici MY PAGES\\(PATIENT)e tiklar")
    public void kullanici_my_pages_patient_e_tiklar() {
        ReusableMethods.waitFor(1);
        us.myPagesPatientMenu.click();
    }

    @When("Kullanici Make an Appointment buttonuna tiklar")
    public void kullanici_make_an_appointment_buttonuna_tiklar() {
        us.MakeAnAppointmentButton.click();
    }

    @When("Kullanici telefon numarasi girer")
    public void kullanici_telefon_numarasi_girer() {

        us.AppointmentRequestPhoneTextBox.sendKeys(ConfigReader.getProperty("ValidPhoneNumber")); // olabilir

    }

    @When("Appointment DateTime kismina guncel tarih girer")
    public void appointment_date_time_kismina_guncel_tarih_girer() {
    }

    @When("Send an Appointment Request buttonuna tiklar")
    public void send_an_appointment_request_buttonuna_tiklar() {
        js.executeScript("arguments[0].click();", us.sendAnAppointmentRequestButton);
        ReusableMethods.waitFor(3);
       // us.sendAnAppointmentRequestButton.click();
    }

    @Then("Appointment registration saved yazisi gorulmeli")
    public void appointment_registration_saved_yazisi_gorulmeli() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(us.appointmentRegistrationSavedFlyingText));
        Assert.assertTrue(us.appointmentRegistrationSavedFlyingText.isDisplayed());
    }

    @When("Appointment DateTime kismina onbes gun sonraki tarih girer")
    public void appointment_date_time_kismina_onbes_gun_sonraki_tarih_girer() {

        Date simdikiZaman = new Date();
        System.out.println(simdikiZaman.toString());
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(df.format(simdikiZaman));

        Date addedDate1 = addDays(simdikiZaman, 15);

        us.appointmentRegistrationDateEnterBox.sendKeys(df.format(addedDate1));



    }

    @When("Appointment DateTime kismina yuz yirmi gun sonraki tarih girer")
    public void appointment_date_time_kismina_yuz_yirmi_gun_sonraki_tarih_girer() {

        Date simdikiZaman = new Date();
        System.out.println(simdikiZaman.toString());
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(df.format(simdikiZaman));

        Date addedDate1 = addDays(simdikiZaman, 120);

        us.appointmentRegistrationDateEnterBox.sendKeys(df.format(addedDate1));



    }

    @When("Appointment DateTime kismina on gun oncesi icin tarih girer")
    public void appointment_date_time_kismina_on_gun_oncesi_icin_tarih_girer() {

        Date simdikiZaman = new Date();
        System.out.println(simdikiZaman.toString());
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(df.format(simdikiZaman));

        Date addedDate1 = addDays(simdikiZaman, -10);

        us.appointmentRegistrationDateEnterBox.sendKeys(df.format(addedDate1));


    }

    @Then("Appointment registration saved yazisi gorulmemeli")
    public void appointment_registration_saved_yazisi_gorulmemeli() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(us.appointmentRegistrationSavedFlyingText));
        Assert.assertFalse(us.appointmentRegistrationSavedFlyingText.isDisplayed());



    }


    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }
}
