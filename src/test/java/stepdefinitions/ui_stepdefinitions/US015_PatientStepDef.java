package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
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

    Faker faker = new Faker();
    Admin_PatientPage admin_patientPage = new Admin_PatientPage();
    public JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    public Actions actions = new Actions(Driver.getDriver());
    @Given("Admin medunna url e gider")
    public void admin_medunna_url_e_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("Admin accountButton u tiklar")
    public void admin_account_button_u_tiklar() {
        admin_patientPage.accountButton.click();
    }

    @Given("Admin sign in secenegini tiklar")
    public void admin_sign_in_secenegini_tiklar() {
        admin_patientPage.signInButton.click();
    }

    @Then("Admin username ve password ile giris yapar")
    public void admin_username_ve_password_ile_giris_yapar() {
        admin_patientPage.usernameBox.sendKeys("team59medunna");
        admin_patientPage.passwordBox.sendKeys("medunna2022.team59");
        admin_patientPage.sign2Button.click();

    }

    @Then("Admin item&titles butonumu tıklar")
    public void admin_item_titles_butonumu_tıklar() {
        admin_patientPage.itemsButton.click();
    }

    @Then("Admin patient secenegini tıklar")
    public void admin_patient_secenegini_tıklar() {
        admin_patientPage.patientButton.click();
    }

    @Then("Admin yeni hasta olustur kutusunu tıklar")
    public void admin_yeni_hasta_olustur_kutusunu_tıklar() {
        admin_patientPage.createPatientButton.click();
    }

    @Then("Admin  hasta bilgilerini girer")
    public void admin_hasta_bilgilerini_girer() throws InterruptedException {

        admin_patientPage.firstnameBox.sendKeys("süheyla");
        admin_patientPage.lastnameBox.sendKeys("kara");

       Actions action = new Actions(Driver.getDriver());
        action.click(admin_patientPage.birthDateBox).sendKeys("01011991").
                sendKeys(Keys.TAB).sendKeys("0105").
                sendKeys(Keys.TAB).sendKeys("suheyla@gmail.com").
                sendKeys(Keys.TAB).sendKeys("5554443388").perform();

        clickElementByJS(admin_patientPage.genderBox);
        Select select = new Select(admin_patientPage.genderBox);
        select.selectByValue("FEMALE");

        //clickElementByJS(admin_patientPage.bloodGroupBox);
        Select select2 = new Select(admin_patientPage.bloodGroupBox);
        select2.selectByIndex(1);

        actions.sendKeys(Keys.ARROW_DOWN).perform();

        action.click(admin_patientPage.adressBox).sendKeys("ss sokak").
                sendKeys(Keys.TAB).sendKeys("oksuruk").
                sendKeys(Keys.TAB).sendKeys("mustafatekin").perform();


        clickElementByJS(admin_patientPage.countryIdBox);
        admin_patientPage.usaBox.click();

        clickElementByJS(admin_patientPage.cStateBox);
        admin_patientPage.californiaOption.click();


                /*action.click(admin_patientPage.genderBox).sendKeys("FEMALE").
                sendKeys(Keys.TAB).sendKeys("A+").
                sendKeys(Keys.TAB).sendKeys("light sokak").
                sendKeys(Keys.TAB).sendKeys("oksuruk").
                sendKeys(Keys.TAB).sendKeys("team59medunna").
                sendKeys(Keys.TAB).sendKeys(admin_patientPage.usaBox).
                sendKeys(Keys.TAB).sendKeys(admin_patientPage.californiaOption).
                perform();

Select select4=new Select(admin_patientPage.countryIdBox);
        select4.selectByVisibleText("US");
        //js.executeScript("arguments[0].click();",admin_patientPage.cStateBox);
        Select select5=new Select(admin_patientPage.cStateBox);
        select5.selectByValue("43522");

Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();



        admin_patientPage.emailBox.sendKeys("ayla@gmail.com");

        Thread.sleep(2000);
        clickElementByJS(admin_patientPage.phoneBox);
        admin_patientPage.phoneBox.sendKeys("5554443322");


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

       Thread.sleep(2000);
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
        admin_patientPage.saveButton.click();
    }


    @When("Admin islem basarili uyarisini görür")
    public void admin_islem_basarili_uyarisini_görür() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(admin_patientPage.islemBasarili.isDisplayed());
    }


    @Then("Admin sayfayi kapatir")
    public void admin_sayfayi_kapatir() {
        Driver.closeDriver();
    }



    @When("Admin state dısındaki hasta bilgilerini girer")
    public void admin_state_dısındaki_hasta_bilgilerini_girer() {
        admin_patientPage.firstnameBox.sendKeys("süheyla");
        admin_patientPage.lastnameBox.sendKeys("kara");

        Actions action = new Actions(Driver.getDriver());
        action.click(admin_patientPage.birthDateBox).sendKeys("01011991").
                sendKeys(Keys.TAB).sendKeys("0105").
                sendKeys(Keys.TAB).sendKeys("suheyla@gmail.com").
                sendKeys(Keys.TAB).sendKeys("5554443388").perform();

        clickElementByJS(admin_patientPage.genderBox);
        Select select = new Select(admin_patientPage.genderBox);
        select.selectByValue("FEMALE");

        //clickElementByJS(admin_patientPage.bloodGroupBox);
        Select select2 = new Select(admin_patientPage.bloodGroupBox);
        select2.selectByIndex(1);

        actions.sendKeys(Keys.ARROW_DOWN).perform();

        action.click(admin_patientPage.adressBox).sendKeys("ss sokak").
                sendKeys(Keys.TAB).sendKeys("oksuruk").
                sendKeys(Keys.TAB).sendKeys("mustafatekin").perform();

/*
        fakeMail = faker.internet().emailAddress();

        fakeLastName = faker.name().lastName();
        fakeSSN = faker.idNumber().ssnValid();
        fakeUsername = faker.name().username();
        fakeBirthDate = faker.idNumber().birthDate();
        fakeBirthTime = faker.idNumber().birthTime();
        fakePhoneNumber = faker.idNumber().phoneNumber();
        fakeGender = faker.name().gender();
        fakeBlood = faker.name().blood();
        fakeAdress = faker.name().address();
        fakeDescription = faker.name().description();
        fakeState = faker.name().state();
        fakeCountry = faker.name().country();


        Actions action = new Actions(Driver.getDriver());
        action.click(admin_patientPage.firstnameBox).sendKeys(faker.name().firstName()).
                sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).
                sendKeys(Keys.TAB).sendKeys(faker.name().username()).
                sendKeys(Keys.TAB).sendKeys(faker.date().birthday()).
                sendKeys(Keys.TAB).sendKeys(fakeMail).
                sendKeys(Keys.TAB).sendKeys(fakePhoneNumber).
                sendKeys(Keys.TAB).sendKeys(fakeGender).
                sendKeys(Keys.TAB).sendKeys(fakeBlood).
                sendKeys(Keys.TAB).sendKeys(fakeDescription).
                sendKeys(Keys.TAB).sendKeys(fakeUsername).
                sendKeys(Keys.TAB).sendKeys(fakeCountry).
                sendKeys(Keys.TAB).sendKeys(fakeState).perform();*/

    }

    @And("Admin ID tiklar")
    public void adminIDTiklar() {
        admin_patientPage.idBaslik.click();
    }

    @Then("Admin ıd basligina tıklar")
    public void admin_ıd_basligina_tıklar() {
        admin_patientPage.idBaslik.click();
    }

    @Then("Admin delete butonuna tıklar")
    public void admin_delete_butonuna_tıklar() {
        admin_patientPage.deleteButton.click();
    }

    @Then("Admin tekrar delete butonuna tıklar")
    public void admin_tekrar_delete_butonuna_tıklar() {

        admin_patientPage.delete2Button.click();
    }

    @Then("Admin hastanın SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and stateCity bilgilerini görür")
    public void adminHastanınSSNFirstNameLastNameBirthDatePhoneGenderBloodGroupAddressDescriptionCreatedDateUserCountryAndStateCityBilgileriniGörür() {
        Assert.assertTrue(admin_patientPage.ssnBaslik.isDisplayed());
        Assert.assertTrue(admin_patientPage.firstBaslik.isDisplayed());
        Assert.assertTrue(admin_patientPage.lastBaslik.isDisplayed());
        Assert.assertTrue(admin_patientPage.phoneBaslik.isDisplayed());
        Assert.assertTrue(admin_patientPage.genderBaslik.isDisplayed());
        Assert.assertTrue(admin_patientPage.createdBaslik.isDisplayed());
    }

    @And("Admin edit butonunu tiklar")
    public void adminEditButonunuTiklar() {
        admin_patientPage.editButton.click(); }

    @When("Admin ogelerin secilebilir oldugunu gorur")
    public void adminOgelerinSecilebilirOldugunuGorur() {
        Assert.assertTrue(admin_patientPage.firstnameBox.isEnabled());
        Assert.assertTrue(admin_patientPage.lastnameBox.isEnabled());
        Assert.assertTrue(admin_patientPage.birthDateBox.isEnabled());
        Assert.assertTrue(admin_patientPage.phoneBox.isEnabled());
        Assert.assertTrue(admin_patientPage.genderBox.isEnabled());
    }

    @And("Admin save butonunu gorur")
    public void adminSaveButonunuGorur() {
        Assert.assertFalse(admin_patientPage.saveButton.isDisplayed());
    }


    @When("Admin delete alertinin kayboldugunu gorur")
    public void adminDeleteAlertininKayboldugunuGorur() {
        Assert.assertFalse(admin_patientPage.delete2Button.isDisplayed());
    }

    @Then("Admin save butonunun gorulemez oldugunu test eder")
    public void adminEditButonununGorulemezOldugunuTestEder() {
        Assert.assertFalse(admin_patientPage.saveButton.isDisplayed());
    }
}


