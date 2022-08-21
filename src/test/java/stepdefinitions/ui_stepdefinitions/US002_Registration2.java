package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.us_pages.US002_AyhanPage;
import utilities.Driver;

public class US002_Registration2 {


    US002_AyhanPage us02Page = new US002_AyhanPage();

    Faker faker = new Faker();

    @Given("kullanıcı ana sayfaya gider")
    public void kullanıcı_ana_sayfaya_gider() {
        Driver.getDriver().get("https://www.medunna.com");
    }

    @And("kullanici sağ üstteki profil simgesine tıklar")
    public void kullanici_sağ_üstteki_profil_simgesine_tıklar() {
        Driver.wait(1);
        Driver.waitAndClick(us02Page.dropDownmenu);
    }

    @And("kullanici registration butonun tıklar")
    public void kullanici_registration_butonun_tıklar() {
        us02Page.registerButton.click();
        Driver.wait(1);
    }

    @And("kullanici {string} SSN box girer")
    public void kullanici_SSN_box_girer(String SSN) {
        us02Page.ssnTextBox.sendKeys(SSN);
    }

    @And("kullanici{string} firstname box girer")
    public void kullanici_firstname_box_girer(String firstname) {
        us02Page.firstNameTextBox.sendKeys(firstname);
    }

    @Then("kullanici {string} lastname box girer")
    public void kullanici_lastname_box_girer(String lastname) {
        us02Page.lastNameTextBox.sendKeys(lastname);
    }

    @Then("kullanici{string} username box girer")
    public void kullanici_username_box_girer(String username) {
        us02Page.userNameTextBox.sendKeys(username);
    }

    @Then("kullanici{string} email box girer")
    public void kullanici_email_box_girer(String email) {
        us02Page.emailTextBox.sendKeys(email);
    }

    @And("kullanici {string} password box girer")
    public void kullanici_password_box_girer(String password){
        us02Page.firstPasswordTextBox.sendKeys(password);
    }

    @And("kullanici aynı{string} password confirmation box girer")
    public void kullanici_aynı_password_confirmation_box_girer(String password) {
        us02Page.secondPasswordTextBox.sendKeys(password);
    }

    @Then("kullanici register button tıklar")
    public void kullanici_register_button_tıklar() {
        Driver.waitAndClick (us02Page.registerSubmitButton);
    }

    //////////////////////

    @Then("kullanici username box kutusuna username girmez")
    public void kullanici_username_box_kutusuna_username_girmez() {
        us02Page.userNameTextBox.sendKeys("");
    }

    @And("kullanici Kullanıcı adınız gerekli görünüyor uyarı mesajı alır")
    public void kullanici_Kullanıcı_adınız_gerekli_görünüyor_uyarı_mesajı_alır() {
        Assert.assertTrue(Driver.waitForVisibility(us02Page.usernameIsRequiredMessage, 8).isDisplayed());
    }

    @Then("kullanici email box kutusuna geçersiz email girer")
    public void kullanici_email_box_kutusuna_geçersiz_email_girer() {
        us02Page.emailTextBox.sendKeys("notilusgmailcom");
    }

    @And("kullanici uyarı mesajını doğrulayın bu alan geçersiz mesajı alır")
    public void kullanici_uyarı_mesajını_doğrulayın_bu_alan_geçersiz_mesajı_alır() {
        Assert.assertTrue(us02Page.thisFieldIsInvalidMessage.isDisplayed());
    }

    @Then("kullanici email box kutusunu boş bırakır")
    public void kullanici_email_box_kutusunu_boş_bırakır() {
        us02Page.emailTextBox.sendKeys(" ");
    }

    @And("kullanici epostanız gerekli mesajı görüntülendiğini doğrular")
    public void kullanici_epostanız_gerekli_mesajı_görüntülendiğini_doğrular() {
        Assert.assertTrue(Driver.waitForVisibility(us02Page.yourEmailIsRequiredMessage,4).isDisplayed());

    }
}




