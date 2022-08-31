package stepdefinitions.ui_stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.us_pages.US20AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.us_pages.US20AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import static utilities.YeniKullaniciOlusturma.yeniKayitOlusturma;


public class US_020_KullaniciAktifEtmestepdefinitions {
    US20AdminPage adminPage=new US20AdminPage();
    Actions actions =new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @When("Yeni kayit yapilir")
    public void yeniKayitYapilir() {
        yeniKayitOlusturma();
    }
    @Given("AdminN medunna ana sayfasina gider")
    public void adminN_medunna_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }
    @When("AdminN hesap butonunu tiklar")
    public void adminN_hesap_butonunu_tiklar() {
        adminPage.dprofilSimgesi.click();

    }
    @Then("AdminN sign in butonunu tiklar")
    public void adminN_sign_in_butonunu_tiklar() {
        adminPage.signInButonu.click();
        ;
    }
    @Then("AdminN gecerli username ve sifresini girer")
    public void adminN_gecerli_username_ve_sifresini_girer() {

        adminPage.duserName.click();
        adminPage.duserName.sendKeys(ConfigReader.getProperty("adminNUser"));
        adminPage.dpassword.sendKeys(ConfigReader.getProperty("adminNSifre"));

    }
    @Then("AdminN sing in butonuna tiklar")
    public void adminN_sing_in_butonuna_tiklar() {
        adminPage.signInButonu2.submit();

    }
    @Then("AdminN Administration butonunu tiklar")
    public void admin_administration_butonunu_tiklar() {
        adminPage.administrationbotunu.click();

    }
    @Then("AdminN User management butonunu tiklar")
    public void admin_user_management_butonunu_tiklar() {
        adminPage.userManagementButonu.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].click();", adminPage.sonSayfayaGitme);


    }
    @Then("AdminN viev butonunu tiklar")
    public void adminN_viev_butonunu_tiklar() {
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.waitFor(2);
        System.out.println("adminPage.vievbutonu.size() = " + adminPage.vievbutonu.size());

        js.executeScript("arguments[0].click();", adminPage.vievbutonu.get(adminPage.vievbutonu.size()-1));


    }
    @Then("AdminN, kayıtlı kişilerin firstname lastname email gibi bilgileri gorur")
    public void adminN_kayıtlı_kişilerin_firstname_lastname_email_gibi_bilgileri_gorur() {
        adminPage.bilgilerTablosu.isDisplayed();
        ReusableMethods.waitFor(2);

        js.executeScript("arguments[0].click();", adminPage.backButonu);
        ReusableMethods.waitFor(2);

        js.executeScript("arguments[0].click();", adminPage.sonSayfayaGitme);
        ReusableMethods.waitFor(7);




    }


    @And("AdminN Admin Create or edit a user sayfasina gider Activated secer")
    public void adminNAdminCreateOrEditAUserSayfasinaGiderActivatedSecer() {


        js.executeScript("arguments[0].click();",adminPage.editButonu.get(adminPage.editButonu.size()-1));
        ReusableMethods.waitFor(5);
        js.executeScript("arguments[0].click();", adminPage.activatedButonu);
        //adminPage.activatedButonu.click();
        ReusableMethods.waitFor(5);




    }

    @And("AdminN rollerini ADMIN, USER PATIENT, STAFF ve PHYSICIAN olarak atar")
    public void adminNRolleriniADMINUSERPATIENTSTAFFVePHYSICIANOlarakAtar() throws IOException {

        Select select=new Select(adminPage.profiles);
        List<WebElement> statusOptions=select.getOptions();
        for (WebElement each:statusOptions) {
            each.click();

        }


        ReusableMethods.waitFor(5);
        js.executeScript("arguments[0].click();", adminPage.saveBotunu);
        ReusableMethods.getScreenshot("aktif");

    }

    @And("AdminN kullaniciyi siler")
    public void adminNKullaniciyiSiler() throws IOException {
        js.executeScript("arguments[0].click();", adminPage.sonSayfayaGitme);
        ReusableMethods.waitFor(7);
        js.executeScript("arguments[0].click();", adminPage.deleteButonu.get(adminPage.deleteButonu.size()-1));
        ReusableMethods.waitFor(5);
        js.executeScript("arguments[0].click();", adminPage.deleteButonu.get(adminPage.deleteButonu.size()-1));
        ReusableMethods.waitFor(5);
        ReusableMethods.getScreenshot("kullanici silindi");

    }
}
