package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.us_pages.US003_RegisterPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_003_RegisterPasswordStrenght {

        US003_RegisterPage rgstr=new US003_RegisterPage();

    Actions actions = new Actions(Driver.getDriver());


    @When("User sağ üst köşedeki user ikonuna tiklar")
    public void user_sağ_üst_köşedeki_user_ikonuna_tiklar() {
        rgstr.userIcon.click();

    }

    @When("User Register buttonuna tiklar")
    public void user_register_buttonuna_tiklar() {
       rgstr.registertext.click();
       actions.sendKeys(Keys.PAGE_DOWN).perform();


    }

    @When("User yedi karakterden az {string} girer")
    public void user_yedi_karakterden_az_girer(String password) {
        rgstr.registerNewPasswordBox.sendKeys(password);

        Driver.wait(1);

    }

    @When("User password strenght seviyesinin zayıf olduğunu doğrular")
    public void user_password_strenght_seviyesinin_zayıf_olduğunu_doğrular() {
        Assert.assertTrue(rgstr.passwordStrenght1.isDisplayed());
        Driver.wait(2);

    }

    @When("User yedi karakter uzunluğunda en az bir adet küçük harf içeren ikili kombinasyonlu {string} girer")
    public void user_yedi_karakter_uzunluğunda_en_az_bir_adet_küçük_harf_içeren_ikili_kombinasyonlu_girer(String password) {
        rgstr.registerNewPasswordBox.sendKeys(password);
        Driver.wait(1);

    }

    @Then("User şifre strength seviyesinin değiştiğini\\(ikinci levela geçtiğini) doğrular")
    public void user_şifre_strength_seviyesinin_değiştiğini_ikinci_levela_geçtiğini_doğrular() {
        Assert.assertTrue(rgstr.passwordStrenght2.isDisplayed());
        Driver.wait(2);
    }

    @When("User yedi karakter uzunluğunda en az adet büyük harf içeren üçlü kombinasyonlu {string} girer")
    public void user_yedi_karakter_uzunluğunda_en_az_adet_büyük_harf_içeren_üçlü_kombinasyonlu_girer(String password) {
        rgstr.registerNewPasswordBox.sendKeys(password);
        Driver.wait(2);
    }

    @Then("User şifre strength seviyesinin üçüncü ve dördüncü level'a geldiğini doğrular")
    public void user_şifre_strength_seviyesinin_üçüncü_ve_dördüncü_level_a_geldiğini_doğrular() {
        Assert.assertTrue(rgstr.passwordStrenght3.isDisplayed());
    }

    @When("User yedi karakter uzunluğunda en az bir adet rakam içeren üçlü kombinasyonlu {string} girer")
    public void user_yedi_karakter_uzunluğunda_en_az_bir_adet_rakam_içeren_üçlü_kombinasyonlu_girer(String password) {
       rgstr.registerNewPasswordBox.sendKeys(password);
       Driver.wait(1);
    }
    @Then("User şifre strength seviyesinin hala dördüncü level'da olduğnu doğrular")
    public void user_şifre_strength_seviyesinin_hala_dördüncü_level_da_olduğnu_doğrular() {
        Assert.assertTrue(rgstr.passwordStrength4.isDisplayed());
        Driver.wait(2);
    }

    @When("User yedi karakter uzunluğunda en az bir özel karakter içeren ve tüm kombinasyonları barındıran {string} girer")
    public void user_yedi_karakter_uzunluğunda_en_az_bir_özel_karakter_içeren_ve_tüm_kombinasyonları_barındıran_girer(String password) {
        rgstr.registerNewPasswordBox.sendKeys(password);
        Driver.wait(1);

    }

    @Then("User password strength seviyesinin en son level'da olduğunu doğrular")
    public void user_password_strength_seviyesinin_en_son_level_da_olduğunu_doğrular() {
        Assert.assertTrue(rgstr.passwordStrength5.isDisplayed());
        Driver.wait(2);

    }

    @When("User sekiz karakter uzunluğunda tüm kombinasyonları içeren\\(kücük büyük harf,rakam, özel karakter) {string} girer")
    public void user_sekiz_karakter_uzunluğunda_tüm_kombinasyonları_içeren_kücük_büyük_harf_rakam_özel_karakter_girer(String password) {
         rgstr.registerNewPasswordBox.sendKeys(password);
         Driver.wait(1);

    }

    @Then("User şifre strength seviyesinin hala en son levelda olduğunu doğrular")
    public void user_şifre_strength_seviyesinin_hala_en_son_levelda_olduğunu_doğrular() {
        Assert.assertTrue(rgstr.passwordStrength5.isDisplayed());
        Driver.wait(2);

    }


}

