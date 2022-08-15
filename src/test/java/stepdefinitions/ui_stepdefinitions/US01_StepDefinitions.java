package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.us_pages.US001_Page;
import utilities.ConfigReader;
import utilities.Driver;


public class US01_StepDefinitions {
    US001_Page medunna = new US001_Page();
    Faker faker = new Faker();



    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @Then("Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar")
    public void kullaniciSayfaninSagUstKosesindeYerAlanInsanIkonunaTiklar() {
        medunna.anasayfaInsanIkonuSignInElementi.click();
    }
    @Given("Kullanici Register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
        medunna.Register.click();
    }
    @And("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

                //   TC1

    @Given("Kullanici ssn kutucuguna tiklar")
    public void kullanici_ssn_kutucuguna_tiklar() {
        medunna.SSNBox.click();
    }
    @Then("Kullanici dokuz haneli {string} girer")
    public void kullanici_dokuz_haneli_girer(String ssn) {
        medunna.SSNBox.sendKeys(ssn);
    }
    @Then("Kullanici bos alana tiklar")
    public void kullanici_bos_alana_tiklar() {
        medunna.bosAlan.click();

    }
    @Given("Kullanici Your SSN is required yazisinin gorunmedigini test eder")
    public void kullanici_your_ssn_is_required_yazisinin_gorunmedigini_test_eder() {
        medunna.SSNBox.click();
        medunna.bosAlan.click();
        Assert.assertEquals(0,medunna.YourSSNisinvalidmesaji.size());
    }
                //  TC2
    @Given("Kullanici firstname kutucuguna tiklar")
    public void kullanici_firstname_kutucuguna_tiklar() {
        medunna.firstNameBox.click();
    }

    @Given("kullanici Your SSN is required yazisinin gorundugunu dogrular")
    public void kullanici_Your_SSN_is_required_yazisinin_goruntulendigini_dogrular() {
        Assert.assertTrue(medunna.SSNHataMesaji.isDisplayed());
    }
    @Given("Kullanici Your SSN is required yazisinin goruntulendigini dogrular")
    public void kullanici_your_ssn_is_required_yazisinin_goruntulendigini_dogrular() {
        Assert.assertTrue(medunna.SSNHataMesaji.isDisplayed());
    }
               //  TC3
    @Given("Kullanici firstname kutucugunun bos olup olmadigini dogrular")
    public void kullanici_firstname_kutucugunun_bos_olup_olmadigini_dogrular() {
        Assert.assertTrue(medunna.YourFirstNameIsrequiredMesaji.isDisplayed());
    }
    @Then("Kullanici firstname kutucuguna karakter iceren {string} girer")
    public void kullanici_firstname_kutucuguna_karakter_iceren_girer(String isim) {
        medunna.firstNameBox.sendKeys(isim);
    }
    //   TC4

    @Then("Kullanici lastname kutucuguna tiklar")
    public void kullanici_lastname_kutucuguna_tiklar() {
        medunna.lastName.click();
    }
    @Then("Kullanici lastname kutucuguna sembolik karakter iceren {string} girer")
    public void kullanici_lastname_kutucuguna_karakter_iceren_girer(String soyisim) {
        medunna.lastName.sendKeys(soyisim);
    }
    @Given("Kullanici hata metni goruldugunu dogrular")
    public void kullanici_hata_metni_goruldugunu_dogrular() {
                             //BUG
    }
    @Then("Kullanici lastname kutucugunun bos olup olmadigini dogrular")
    public void kullanici_lastname_kutucugunun_bos_olup_olmadigini_dogrular() {
        Assert.assertTrue(medunna.lastNameHataMesasji.isDisplayed());
    }
}