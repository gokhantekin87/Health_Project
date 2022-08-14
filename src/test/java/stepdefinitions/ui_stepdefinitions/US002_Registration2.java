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

    @Given("kullanici ana sayafaya gider")
    public void kullanici_ana_sayafaya_gider() {
        Driver.getDriver().get("https://www.medunna.com");
    }

    @When("kullanici sag üst karaktere tiklar")
    public void kullanici_sag_üst_karaktere_tiklar() {
        this.us02Page.character.click();
    }

    @Given("kullanici Register buttonuna tiklar")
    public void kullanici_register_buttonuna_tiklar() {
        this.us02Page.Register.click();
    }

 /*   @Then("kullanici {string} kutusuna gider")
    public void kullanici_username_kutusuna_gider(String username) {
        us02Page.usernameTextBox.sendKeys(username);
    }

    @Then("kullanici {string} kutusuna gider")
    public void kullanici_email_kutusuna_gider(String email) {
        us02Page.emailTextBox.sendKeys(email);
    }*/

    //////////////
    @Then("kullanıcı username kusutusuna giriş yapamaz")
    public void kullanıcı_username_kusutusuna_giriş_yapamaz() {
        us02Page.usernameTextBox.sendKeys("");
    }

    @And("kullanıcı kulanıcı ismi gerekli olduğunu görür")
    public void kullanıcı_kulanıcı_ismi_gerekli_olduğunu_görür() {
        Assert.assertTrue(Driver.waitForVisibility(us02Page.usernameIsRequiredMessage, 8).isDisplayed());
    }

    @Then("kullanıci email kutusuna gecersiz email girer")
    public void kullanıci_email_kutusuna_gecersiz_email_girer() {
        us02Page.emailTextBox.sendKeys("calismailcom");
    }

    @And("kullanici bu alanın geçersiz olduğunu dogrular")
    public void kullanici_bu_alanın_geçersiz_olduğunu_dogrular() {
        Assert.assertTrue(us02Page.thisFieldIsInvalidMessage.isDisplayed());
    }

    @Then("kullanici email kutusunu boş bırakır")
    public void kullanici_email_kutusunu_boş_bırakır() {
        us02Page.emailTextBox.sendKeys(" ");
    }

    @And("kullanici email mesajınının gerekli olduğunu görüntüler")
    public void kullanici_email_mesajınının_gerekli_olduğunu_görüntüler() {
        Assert.assertTrue(Driver.waitForVisibility(us02Page.yourEmailIsRequiredMessage, 4).isDisplayed());


    }
}




