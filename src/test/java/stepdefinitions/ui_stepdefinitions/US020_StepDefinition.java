package stepdefinitions.ui_stepdefinitions;

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



    Admin_PatientPage AdminPage = new  Admin_PatientPage ();
    US020_Page userPage = new US020_Page();

    @Given("admin giris sayfasina gider")
    public void admin20_navigates_to_medunna_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("admin signs in tiklar")
    public void admin20_signs_in() {
        AdminPage.usernameBox.sendKeys("team59medunna");
        AdminPage.passwordBox.sendKeys("medunna2022.team59");
        AdminPage.signInButton.click();

    }

    @Then("admin User Management a klik yaptıktan sonra Administrations a klik yapar")
    public void admin20_clicks_on_administrations_then_clicks_on_user_management() {
        ReusableMethods.waitForVisibility(userPage.administration, 5).click();
        ReusableMethods.waitForVisibility(userPage.userManagement, 5).click();

    }

    @Then("admin View butonuna klik yapar")
    public void admin20_clicks_on_view_button() {
        ReusableMethods.waitForVisibility(userPage.viewButton, 5).click();

    }

    @Then("admin sayfada kullaniciların bilgilerini dogrular")
    public void admin20_verifies_user_s_information_on_the_page() {
        ReusableMethods.waitForVisibility(userPage.firstNameText, 5);
        Assert.assertTrue(userPage.firstNameText.isDisplayed());
        ReusableMethods.waitForVisibility(userPage.lastNameText, 5);
        Assert.assertTrue(userPage.lastNameText.isDisplayed());
        ReusableMethods.waitForVisibility(userPage.emailText, 5);
        Assert.assertTrue(userPage.emailText.isDisplayed());

    }

    @Then("admin uygulamayi kapatir")
    public void admin20_closes_the_application() {
        Driver.closeDriver();

    }

    @Then("admin Edit butonuna klik yapar")
    public void admin20_clicks_on_edit_button() {
        ReusableMethods.waitForVisibility(userPage.editButton, 5).click();

    }

    @Then("admin kullanicilara rol atar")
    public void admin20_assigns_role_to_the_user() throws InterruptedException {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        Select select = new Select(userPage.profileDropdown);
        select.selectByVisibleText("ROLE_USER");


    }

    @Then("admin save butonuna klik yapar")
    public void admin20_clicks_on_save_button() {
        Driver.clickWithJS(ReusableMethods.waitForVisibility(userPage.saveButton, 5));
        Assert.assertTrue(ReusableMethods.waitForVisibility(userPage.successMessage, 5).isDisplayed());

    }

    @Then("admin kullanicinin durumunu aktif eder")
    public void admin20_activates_user_s_status() {
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