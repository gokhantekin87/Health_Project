package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.admin_pages.Admin_PatientPage;
import utilities.ReusableMethods;

public class US019_StepDefiniations {

    Admin_PatientPage admin_patientPage=new Admin_PatientPage();


    @Given("admin create a new staff buttonuna tıklar")
    public void admin_create_a_new_staff_buttonuna_tıklar() {

        admin_patientPage.createAnewStaffButton.click();
    }

    @And("admin staff buttonuna tıklar")
    public void adminStaffButtonunaTıklar() {
        admin_patientPage.staffButton.click();
    }

    @And("admin ssn {string} deger girer")
    public void adminSsnDegerGirer(String String) {
        admin_patientPage.ssnTextBox.sendKeys(String);
    }

    @Then("admin Search User Buttonuna tıklar")
    public void adminSearchUserButtonunaTıklar() {
        admin_patientPage.searchUserButton.click();
    }

    @And("admin kullanici bulundu yazisini kontrol eder")
    public void adminKullaniciBulunduYazisiniKontrolEder() {
        Assert.assertTrue(admin_patientPage.kullaniciBulunduYazi.isDisplayed());
        if (admin_patientPage.kullaniciBulunduYazi.isDisplayed()) {
            System.out.println("Kullanıcı bulundu ve Test Passed");
        }

    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int Integer ) throws InterruptedException {

        Thread.sleep(2000);
    }


    @And("admin firstName {string} girer")
    public void adminFirstNameGirer(String String) {
        admin_patientPage.firstnameBox.sendKeys(String);
    }

    @And("admin lastName {string} girer")
    public void adminLastNameGirer(String String) {
        admin_patientPage.lastnameBox.sendKeys(String);

    }

    @And("admin dogumGunu {string} girer")
    public void adminDogumGunuGirer(String String) {
        admin_patientPage.birthDateBox.sendKeys(String);
    }


    @And("admin phone bilgisi {string} girer")
    public void adminPhoneBilgisiGirer(String String) {
        admin_patientPage.phoneBox.sendKeys(String);
    }

    @And("admin cinsiyet {string} secer")
    public void adminCinsiyetSecer(String String) {
        admin_patientPage.genderBox.sendKeys(String);
    }

    @And("admin kan grubu {string} secer")
    public void adminKanGrubuSecer(String String) {
        admin_patientPage.bloodGroupBox.sendKeys(String);
    }

    @And("kullanıcı adress bilgisi {string} girer")
    public void kullanıcıAdressBilgisiGirer(String String) {
        admin_patientPage.adressBox.sendKeys(String);
    }

    @And("admin personeli {string} tanimlar")
    public void adminPersoneliTanimlar(String String) {
        admin_patientPage.desciriptonBox.sendKeys(String);

    }

    @And("user secim")
    public void userSecim() {
        admin_patientPage.userIdSecim.click();
    }

    @And("ulke secimi")
    public void ulkeSecimi() {
        admin_patientPage.secilenUlke.click();
    }

    @And("sehir secimi")
    public void sehirSecimi() {
        admin_patientPage.secilenSehir.click();
    }

    @And("Admin View buttonuna tıklar")
    public void adminViewButtonunaTıklar() {
        admin_patientPage.wievButton.click();
    }

    @And("User yazisini kontrol eder")
    public void userYazisiniKontrolEder() {
        Assert.assertTrue(admin_patientPage.userYazi.isDisplayed());
        if (admin_patientPage.userYazi.isDisplayed()){
            System.out.println("Kullanici gözüküyor testler Pass!!");
        }
    }

    @And("admin edit buttonuna tıklar")
    public void adminEditButtonunaTıklar() {
        admin_patientPage.editBUtton.click();
    }

    @And("save button click")
    public void saveButtonClick() {
        ReusableMethods.clickWithJs(admin_patientPage.saveBTN);

    }

    @And("bilgilerin güncellendigini kontrol eder")
    public void bilgilerinGüncellendiginiKontrolEder() {
        Assert.assertTrue(admin_patientPage.bilgilerGüncellendiYazi.isDisplayed());
        if (admin_patientPage.bilgilerGüncellendiYazi.isDisplayed()){
            System.out.println("İstenilen bilgiler güncellendi Testler PASS.!!");
        }
    }

    @And("admin kullaniciyi siler")
    public void adminKullaniciyiSiler() {
        admin_patientPage.deleteBTN.click();
        admin_patientPage.deleteBTN2.click();
    }

    @And("kullanicinin silindigini kontrol eder")
    public void kullanicininSilindiginiKontrolEder() {
        Assert.assertTrue(admin_patientPage.bilgilerGüncellendiYazi.isDisplayed());
        if (admin_patientPage.bilgilerGüncellendiYazi.isDisplayed()){
            System.out.println("Kişi silindi Testler PASS.!!");
        }
    }
}
