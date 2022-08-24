package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.admin_pages.AdminPage;
import pages.admin_pages.Admin_PatientPage;
import pages.us_pages.US020_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US020_StepDefinition {




    US020_Page userPage = new US020_Page();


    @Given("admin giris sayfasina gider")
    public void admin20_navigates_to_medunna_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }



    @Then("admin signs in tiklar")
    public void adminsigns_in_tiklar() {
        userPage.usernameBox.sendKeys("team59medunna");
        userPage.passwordBox.sendKeys("medunna2022.team59");
        userPage.signInButton.click();

    }

    @Then("admin User Management a klik yaptıktan sonra Administrations a klik yapar")
    public void admin_User_Management_a_klik_yaptıktan_sonra_Administrations_a_klik_yapar() {
        ReusableMethods.waitForVisibility(userPage.administration, 5).click();
        ReusableMethods.waitForVisibility(userPage.userManagement, 5).click();

    }

    @Then("admin View butonuna klik yapar")
    public void admin_View_butonuna_klik_yapar() {
        ReusableMethods.waitForVisibility(userPage.viewButton, 5).click();

    }

    @Then("admin sayfada kullaniciların bilgilerini dogrular")
    public void admin_sayfada_kullaniciların_bilgilerini_dogrular() {
        ReusableMethods.waitForVisibility(userPage.firstNameText, 5);
        Assert.assertTrue(userPage.firstNameText.isDisplayed());
        ReusableMethods.waitForVisibility(userPage.lastNameText, 5);
        Assert.assertTrue(userPage.lastNameText.isDisplayed());
        ReusableMethods.waitForVisibility(userPage.emailText, 5);
        Assert.assertTrue(userPage.emailText.isDisplayed());

    }

    @Then("admin uygulamayi kapatir")
    public void admin_uygulamayi_kapatir() {
        Driver.closeDriver();

    }

    @Then("admin Edit butonuna klik yapar")
    public void admin_Edit_butonuna_klik_yapar() {
        ReusableMethods.waitForVisibility(userPage.editButton, 5).click();

    }

    @Then("admin kullanicilara rol atar")
    public void admin_kullanicilara_rol_atar() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        Select select = new Select(userPage.profileDropdown);
        select.selectByVisibleText("ROLE_USER");


    }

    @Then("admin save butonuna klik yapar")
    public void admin_save_butonuna_klik_yapar() {
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.saveButton, 5));
        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.successMessage, 5).isDisplayed());

    }

    @Then("admin kullanicinin durumunu aktif eder")
    public void admin_kullanicinin_durumunu_aktif_eder() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        ReusableMethods.waitForVisibility(userPage.activatedCheckbox, 5).click();

        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.saveButton, 5));
        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.successMessage, 5).isDisplayed());

    }

    @Then("admin kullaniciyi siler")
    public void admin_kullaniciyi_siler() throws InterruptedException {
        Thread.sleep(3000);
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.idButton, 5));
        Thread.sleep(3000);
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.deleteButton, 5));
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.deleteConfirmButton, 5));

        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.userDeletedMessage, 5).isDisplayed());

    }
}