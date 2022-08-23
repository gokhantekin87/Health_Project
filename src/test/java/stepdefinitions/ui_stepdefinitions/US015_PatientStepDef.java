package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.admin_pages.Admin_PatientPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.JSUtils.clickElementByJS;

public class US015_PatientStepDef {
    Admin_PatientPage admin_patientPage= new Admin_PatientPage();
    public JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

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
    public void admin_hasta_bilgilerini_girer() throws InterruptedException {
        admin_patientPage.firstnameBox.sendKeys("Ayla");
        admin_patientPage.lastnameBox.sendKeys("Ayla");

        Actions action = new Actions(Driver.getDriver());
        action.click(admin_patientPage.birthDateBox).sendKeys("01011991").
                sendKeys(Keys.TAB).sendKeys("0101").
                sendKeys(Keys.TAB).sendKeys("ayla@gmail.com").
                sendKeys(Keys.TAB).sendKeys("5554443322").
                sendKeys(Keys.TAB).sendKeys("FEMALE").
                sendKeys(Keys.TAB).sendKeys("A+").
                sendKeys(Keys.TAB).sendKeys("ss sokak").
                sendKeys(Keys.TAB).sendKeys("oksuruk").
                sendKeys(Keys.TAB).sendKeys("bakalım").
                sendKeys(Keys.TAB).sendKeys("USA").
                sendKeys(Keys.TAB).sendKeys("California").

                perform();

        /*


        admin_patientPage.emailBox.sendKeys("ayla@gmail.com");

        Thread.sleep(2000);
        clickElementByJS(admin_patientPage.phoneBox);
        admin_patientPage.phoneBox.sendKeys("5554443322");*/

       /* Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();


       // clickElementByJS(admin_patientPage.genderBox);


        Select select=new Select(admin_patientPage.genderBox);
        select.selectByValue("FEMALE");

        Thread.sleep(2000);
        //clickElementByJS(admin_patientPage.bloodGroupBox);
        Select select2=new Select(admin_patientPage.bloodGroupBox);
        select2.selectByValue("Apositive");

        Thread.sleep(2000);
        clickElementByJS(admin_patientPage.adressBox);
        admin_patientPage.adressBox.sendKeys("ss sokak");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("USA").
                sendKeys(Keys.TAB).sendKeys(admin_patientPage.californiaOption.getText()).
                perform();

      /*  Thread.sleep(2000);
        //clickElementByJS(admin_patientPage.userIdBox);
        Select select3=new Select(admin_patientPage.userIdBox);
        select3.selectByIndex(0);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
       // clickElementByJS(admin_patientPage.countryIdBox);
        Select select4=new Select(admin_patientPage.countryIdBox);
        select4.selectByVisibleText("US");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        //clickElementByJS(admin_patientPage.cStateBox);
        Select select5=new Select(admin_patientPage.cStateBox);
        select5.selectByValue("43522");
*/

    }
    @Then("Admin kayıt butonuna tıklar")
    public void admin_kayıt_butonuna_tıklar() throws InterruptedException {
        Thread.sleep(2000);
        clickElementByJS(admin_patientPage.saveButton);
        admin_patientPage.saveButton.click();}


    @When("Admin islem basarili uyarisini görür")
    public void admin_islem_basarili_uyarisini_görür () {Assert.assertTrue(admin_patientPage.islemBasarili.isDisplayed());}


    @Then("Admin sayfayi kapatir")
    public void admin_sayfayi_kapatir() {
       Driver.closeDriver();;
    }

    @When("Admin listenin son sayfayasına Kullanici_register_sayfasina_gider")
    public void admin_listenin_son_sayfayasına_kullanici_register_sayfasina_gider() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin hastanın SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state \\/ City bilgilerini görür\"")
    public void admin_hastanın_ssn_first_name_last_name_birth_date_phone_gender_blood_group_address_description_created_date_user_country_and_state_city_bilgilerini_görür() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin listenin son sayfayasına gider")
    public void admin_listenin_son_sayfayasına_gider() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin hastanın oldugu satırda edit butonunu tıklar")
    public void admin_hastanın_oldugu_satırda_edit_butonunu_tıklar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Admin hastanın yeni bilgilerini girer")
    public void admin_hastanın_yeni_bilgilerini_girer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("Admin state dısındaki hasta bilgilerini girer")
    public void admin_state_dısındaki_hasta_bilgilerini_girer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
