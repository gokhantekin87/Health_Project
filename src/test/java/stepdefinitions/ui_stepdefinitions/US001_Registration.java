package stepdefinitions.ui_stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import pages.RegistrationPage;
import pages.us_pages.US001_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class US001_Registration {
    US001_Page medunna = new US001_Page();
    Faker faker = new Faker();

    @Given("Medunna url'sine tiklar")
    public void medunna_url_sine_tiklar() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("Kullanici sayfanin en ust sag kismindaki adam ikonuna tiklar")
    public void kullanici_sayfanin_en_ust_sag_kismindaki_adam_ikonuna_tiklar() {
        medunna.manIcon.click();
    }

    @Given("Kullanici Register buttonuna tiklar.")
    public void kullanici_register_buttonuna_tiklar() {
        medunna.Register.click();
    }

    //   TC1
    @Given("Kullanici ilk uc haneyi rakam girer; dorduncu haneyi '-' girer; besinci ve altinci haneyi rakam olarak girer; yedinci haneyi '-'girer; sekizinci ve onbirinci hane arasini rakam olarak girer.")
    public void SSNgiris() {
        medunna.SSNBox.sendKeys(faker.numerify("###-##-####"));
    }

    @Given("Your SSN is required. yazisinin gorunmedigini test eder")
    public void your_ssn_is_required_yazisinin_gorunmedigini_test_eder() {
        medunna.firstNameBox.click();
        medunna.bosAlan.click();
        Assert.assertTrue(medunna.SSNHataMesaji.isDisplayed());
    }

    //  TC2
    @Given("Kullanici SSN kutucugu bos olup olmadigini kontrol eder")
    public void kullanici_ssn_kutucugu_bos_olup_olmadigini_kontrol_eder() {
        medunna.SSNBox.click();
        medunna.bosAlan.click();
        Assert.assertTrue(medunna.SSNHataMesaji.isDisplayed());
    }

    //  TC3
    @Given("Kullanici Name kutucuguna sembolik karakter icermeyen isim girer")
    public void kullanici_name_kutucuguna_sembolik_karakter_icermeyen_soyisim_girer() {
        medunna.firstNameBox.sendKeys(faker.name().firstName());
    }

    @Given("Kullanici Name kutucugunun bos olup olmadigini konrol eder")
    public void kullanici_name_kutucugunun_bos_olup_olmadigini_konrol_eder() {
        medunna.firstNameBox.click();
        medunna.bosAlan.click();
        Assert.assertTrue(medunna.firstNameHataMesaji.isDisplayed());
    }

    //   TC4
    @Given("Kullanici LastName kutucuguna sembolik karakter icermeyen soyisim girer")
    public void kullanici_lastname_kutucuguna_sembolik_karakter_icermeyen_soyisim_girer() {
        medunna.firstNameBox.sendKeys(faker.name().lastName());
    }

    @Given("Kullanici LastName kutucugunun bos olup olmadigini konrol eder")
    public void kullanici_lastname_kutucugunun_bos_olup_olmadigini_konrol_eder() {
        medunna.lastName.click();
        medunna.bosAlan.click();
        Assert.assertTrue(medunna.lastNameHataMesasji.isDisplayed());
    }
}
