package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.us_pages.US_004_LoginPage;
import utilities.Driver;

public class US004_SignInPageStepDef {
     US_004_LoginPage login4=new US_004_LoginPage();


    @When("User SingIn'e tiklar")
    public void user_sing_ın_e_tiklar() {
        login4.signIn.click();
    }
    @When("User geçerli username olarak {string} girer")
    public void user_geçerli_username_olarak_girer(String validusername) {
        login4.usernameTextbox.sendKeys(validusername);
    }
    @When("User geçerli password olarak {string} girer")
    public void user_geçerli_password_olarak_girer(String validpassword) {
        login4.passwordTextbox.sendKeys(validpassword);
    }
    @When("User SıgnIn buttonuna tıklar")
    public void user_sıgn_ın_buttonuna_tıklar() {
        login4.signInButton.click();
    }
    @Then("Giriş işleminin başarılı olduğunu doğrular")
    public void giriş_işleminin_başarılı_olduğunu_doğrular() {
        Assert.assertTrue(login4.signedInUserName.isDisplayed());
    }
    @Then("Sayfayı kapatır")
    public void sayfayı_kapatır() {
        Driver.closeDriver();
    }
    @When("User geçersiz username olarak {string} girer")
    public void user_geçersiz_username_olarak_girer(String invalidusername) {
        login4.usernameTextbox.sendKeys(invalidusername);
    }
    @When("User geçersiz password olarak {string} girer")
    public void user_geçersiz_password_olarak_girer(String invalidpassword) {
        login4.passwordTextbox.sendKeys(invalidpassword);
    }
    @Then("Sayfaya giriş yapılamadığını doğrular")
    public void sayfaya_giriş_yapılamadığını_doğrular() {
        Driver.wait(5);
        Assert.assertTrue(login4.failMassageToSignIn.isDisplayed());
    }
    @And("Kullanıcı sayfayı kapatır")
    public void kullanıcıSayfayıKapatır() {
        Driver.closeDriver();
    }
    @Then("User, Remember me?'nin görüntülendiğini doğrular")
    public void user_remember_me_nin_görüntülendiğini_doğrular() {
        Driver.waitForVisibility(login4.rememberMeBox,5);
      Assert.assertTrue(login4.rememberMeBox.isDisplayed());
    }
    @Then("User, Did you forget your password?'ün görüntülendiğini doğrular")
    public void user_did_you_forget_your_password_ün_görüntülendiğini_doğrular() {
        Driver.waitForVisibility(login4.didYouForgetPasswrd,5);
        Assert.assertTrue(login4.didYouForgetPasswrd.isDisplayed());
    }
    @Then("User, You don't have an account yet? Register a new account'un görüntülendiğini doğrular")
    public void user_you_don_t_have_an_account_yet_register_a_new_account_un_görüntülendiğini_doğrular() {
        Driver.waitForVisibility(login4.registerNewAccount,5);
        Assert.assertTrue(login4.registerNewAccount.isDisplayed());
    }
    @Then("User, Cancel'ın görüntülendiğini doğrular")
    public void user_cancel_ın_görüntülendiğini_doğrular() {
        Driver.waitForVisibility(login4.cancelButton,5);
        Assert.assertTrue(login4.cancelButton.isDisplayed());
    }
    @Then("Browserı- kapatır")
    public void browserı_kapatır() {
        Driver.closeDriver();
    }


}
