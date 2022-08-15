package stepdefinitions.ui_stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AppointmentPage;
import pages.HomePage;
import utilities.Driver;
import java.util.ArrayList;
import java.util.List;

public class US005_Patient {
    AppointmentPage appointmentPage=new AppointmentPage();
    HomePage homePage=new HomePage();
    @Given("kullanıcı myPagese tıklar")
    public void kullanıcı_my_pagese_tıklar() {
        appointmentPage.myPagesButton.click();

    }
    @Then("kullanıcı makeAnAppoitmente tıklar")
    public void kullanıcı_make_an_appoitmente_tıklar() {
        appointmentPage.makeAnAppoitment.click();


    }
    @Then("kullanıcı firstName kutusuna {string} bilgi girer")
    public void kullanıcı_first_name_kutusuna_bilgi_girer(String firsyName) {
        appointmentPage.firstName.clear();
      appointmentPage.firstName.sendKeys(firsyName);
    }
    @Then("kullanıcı lastName kutusuna {string} bilgi girer")
    public void kullanıcı_last_name_kutusuna_bilgi_girer(String lastName) {
        appointmentPage.lastName.clear();
        appointmentPage.lastName.sendKeys(lastName);

    }
    @Then("kullanıcı ssn kutusuna {string} bilgi girer")
    public void kullanıcı_ssn_kutusuna_bilgi_girer(String ssn) {
        appointmentPage.ssn.clear();
        appointmentPage.ssn.sendKeys(ssn);

    }
    @Then("kullanıcı eMail kutusuna {string} bilgi girer")
    public void kullanıcı_e_mail_kutusuna_bilgi_girer(String email) {
        appointmentPage.email.clear();
        appointmentPage.email.sendKeys(email);

    }
    @Then("kullanıcı phone kutusuna {string} bilgi girer")
    public void kullanıcı_phone_kutusuna_bilgi_girer(String phone) {
        appointmentPage.phoneNumber.clear();
        appointmentPage.phoneNumber.sendKeys(phone);

    }
    @Then("kullanıcı appoitmentDateTime kutusuna {string} bilgi girer")
    public void kullanıcı_appoitment_date_time_kutusuna_bilgi_girer(String appoitmentDateTime) {
        appointmentPage.appoitmentDateTime.clear();
        appointmentPage.appoitmentDateTime.sendKeys(appoitmentDateTime);

    }
    @Then("kullannıcı Send an Appoitment Requeste tıklar")
    public void kullannıcı_send_an_appoitment_requeste_tıklar() {
        appointmentPage.sendAnAppointmentRequestButton.click();


    }
    @Then("kayıt oluşturulup oluşturulmadıgını kontrol eder")
    public void kayıt_oluşturulup_oluşturulmadıgını_kontrol_eder() {
        Assert.assertTrue(appointmentPage.firstNameRequiredYazi.isDisplayed());
        if (appointmentPage.firstNameRequiredYazi.isDisplayed()){
            System.out.println("First Name eksik oldugu icin kayıt olusturalamadı..!");
        }

    }


    @And("kullanıcı ssn olmadan kayıt oluşturulamadıgını kontrol eder")
    public void kullanıcıSsnOlmadanKayıtOluşturulamadıgınıKontrolEder() {
        Assert.assertTrue(appointmentPage.ssnRequiredYazi.isDisplayed());
        if (appointmentPage.ssnRequiredYazi.isDisplayed()){
            System.out.println("SSN girilmeden kullanici olusturulamaz...!");
        }
    }



    @And("kullanıcı lastName boş bırakilmadan kayıt oluşturulmadıgını kontrol eder")
    public void kullanıcıLastNameBoşBırakilmadanKayıtOluşturulmadıgınıKontrolEder() {
        Assert.assertTrue(appointmentPage.lastNameIsRequiredYazi.isDisplayed());
        if (appointmentPage.lastNameIsRequiredYazi.isDisplayed()){
            System.out.println("Last name boş bırakılamaz..!");
        }
    }

    @And("kullanıcı telNo boşken kayıt yapılamadıgnı kontrol eder")
    public void kullanıcıTelNoBoşkenKayıtYapılamadıgnıKontrolEder() {
        Assert.assertTrue(appointmentPage.phoneNumberIsRequiredYazi.isDisplayed());
        if (appointmentPage.phoneNumberIsRequiredYazi.isDisplayed()){
            System.out.println("Telefon numarası olmadan kayıt yapılamaz..!");
        }
    }
    @Given("admin girişinden userManagmente tıklar")
    public void admin_girişinden_user_managmente_tıklar() {
        appointmentPage.adminsitrationIkon.click();
        appointmentPage.userManagment.click();
    }
    @Given("sayfanın en sonuna giden buttona tıklar")
    public void sayfanın_en_sonuna_giden_buttona_tıklar() {
        appointmentPage.lastPageButton.click();
        appointmentPage.lastPageButton.click();

    }


    @And("kullanıcı myAppoitmentse tıklar")
    public void kullanıcıMyAppoitmentseTıklar() {
        appointmentPage.myAppoitmentsButton.click();

    }

    @And("kullanıcı hastanın olup olmadıgını kontrol eder")
    public void kullanıcıHastanınOlupOlmadıgınıKontrolEder() {
        appointmentPage.polatButton.click();
    }

    @And("kullanıcı hastanın profili gözüktügünü kontrol eder")
    public void kullanıcıHastanınProfiliGözüktügünüKontrolEder() {
        Assert.assertTrue(appointmentPage.patientBaslık.isDisplayed());
        if (appointmentPage.patientBaslık.isDisplayed()){
            System.out.println("Hastanın profili gözüküyor..");
            System.out.println("Bütün testler PASS");
        }
    }
}

