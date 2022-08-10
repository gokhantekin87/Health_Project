package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.us_pages.US008_PaswordEdit;
import utilities.ConfigReader;
import utilities.Driver;
public class US008_PasswordEdit {
    US008_PaswordEdit userPassword = new US008_PaswordEdit();
    @Given("kullanici Url ye gider")
    public void kullaniciUrlYeGider() {Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @And("kullanici Account menuye tiklar")
    public void kullanici_accountMenu_ye_Tiklar()  {
        US008_PaswordEdit medunna = new US008_PaswordEdit();
        medunna.accountMenu.click();
    }
    @And("kullanici Sign in butonuna tiklar")
    public void kullaniciSİgnInButonunaTiklar() {
        US008_PaswordEdit medunna = new US008_PaswordEdit();
        medunna.homePageSignIn.click();
    }
    @And("kullanici username {string} passworde {string} girer")
    public void kullaniciUsernamePasswordeGirer(String arg0, String arg1) {
        userPassword.username.sendKeys("bergin");
        userPassword.password.sendKeys("ABCDEF");
    }
    @And("Kullanici Sign in butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {userPassword.signInPageSignInButton.click();
    }
    @Then("Kullanici account page sayfasinda account menuye tiklar")
    public void kullaniciAccountPageSayfasindaAccountMenuyeTiklar() {Driver.waitAndClick(userPassword.loginPageAccountMenu, 3);
    }
    @Then("Kullanici Password butonuna tıklar")
    public void kullaniciPasswordButonunaTıklar() throws InterruptedException{Driver.waitAndClick(userPassword.loginPagePasswordButton, 3);
        Thread.sleep(2000);
    }

    @And("Kullanici gecerli sifresini {string} gecerli sifre alanına girer")
    public void kullaniciGecerliSifresiniGecerliSifreAlanınaGirer(String currentPassword) throws InterruptedException
    {Driver.waitAndSendText(userPassword.currentPassword, currentPassword);
        Thread.sleep(2000);
    }

    @And("Kullanici yeni sifresini {string} yeni sifre alanina girer")
    public void kullaniciYeniSifresiniYeniSifreAlaninaGirer(String newPassword)throws InterruptedException {
        Driver.waitAndSendText(userPassword.newPassword, newPassword);
        Thread.sleep(2000);

    }

    @And("kullanici yeni sifresini {string} alanina tekrar girer")
    public void kullaniciYeniSifresiniAlaninaTekrarGirer (String confirmationPassword) throws InterruptedException {
        Driver.waitAndSendText(userPassword.confirmationPassword, confirmationPassword, 3);
        Thread.sleep(2000);

    }

    @And("Kullanici save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar()throws InterruptedException {Driver.waitAndClick(userPassword.saveButton, 3);
        Thread.sleep(3000);

    }

    @Then("Kullanici toast container box ta basarili mesajini gorur")
    public void kullaniciToastContainerBoxTaBasariliMesajiniGorur()throws InterruptedException {
        String expectedResult="Password changed!";
        String actualResult=userPassword.successMessage.getText();
        Assert.assertEquals(expectedResult,actualResult);
        Thread.sleep(6000);
    }

    @And("kullanici yeni password kismini temizler")
    public void kullaniciYeniPasswordKisminiTemizler() {userPassword.newPassword.clear();
        Driver.wait(2);

    }


    @And("Strenght bar bir cizgi olarak gorunur")
    public void strenghtBarBirCizgiOlarakGorunur() {Assert.assertTrue(userPassword.passwordStrength1.isDisplayed());
        Driver.wait(2);

    }

    @And("Kullanici yeni password alanina {string} bir karakter ekler")
    public void kullaniciYeniPasswordAlaninaBirKarakterEkler(String newpass) {Driver.waitAndSendText(userPassword.newPassword,newpass);
        Driver.wait(2);

    }

    @Then("Strenght bar iki cizgi olarak gorunur")
    public void strenghtBarIkiCizgiOlarakGorunur() {Assert.assertTrue(userPassword.passwordStrength2.isDisplayed());
        Driver.wait(2);
    }

    @Then("Strenght bar dort cizgi olarak gorunur")
    public void strenghtBarDortCizgiOlarakGorunur() {Assert.assertTrue(userPassword.passwordStrength4.isDisplayed());
        Driver.wait(2);
    }

    @Then("Strenght bar bes cizgi olarak gorunur")
    public void strenghtBarBesCizgiOlarakGorunur() {Assert.assertTrue(userPassword.passwordStrength5.isDisplayed());
        Driver.wait(2);
    }


    @When("kullanici gecerli password kismini temizler")
    public void kullaniciGecerliPasswordKisminiTemizler() {userPassword.currentPassword.clear();
        Driver.wait(2);

    }

    @And("Kullanici confirmation password kismini temizler")
    public void kullaniciConfirmationPasswordKisminiTemizler() {userPassword.confirmationPassword.clear();
        Driver.wait(2);

    }

    @Then("Kullanici toast container box ta basarili mesajini BUG olarak gorur")
    public void kullaniciToastContainerBoxTaBasariliMesajiniBUGOlarakGorur()throws InterruptedException {
        String expectedResult="Password changed!";
        String actualResult=userPassword.successMessage.getText();
        Assert.assertEquals(expectedResult,actualResult);
        Thread.sleep(6000);
    }


    @Then("Kullanici driveri kapatir")
    public void kullaniciDriveriKapatir() {Driver.closeDriver();
    }
}
