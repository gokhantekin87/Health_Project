package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.us_pages.US028_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US028_StepDefs {
    US028_Page adminUS028 = new US028_Page();

    //Admin ulke olusturabilir.

    @Given("admin siteye gider")
    public void admin_siteye_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @Given("admin account dropdown menuye tiklar")
    public void admin_account_dropdown_menuye_tiklar()throws InterruptedException {
        adminUS028.accountMenu.click();
    }
    @Given("admin sign in butona tiklar")
    public void admin_sign_in_butona_tiklar()throws InterruptedException {

        adminUS028.homePageSignIn.click();
    }
    @Given("admin username {string} ve password {string} girer")
    public void admin_username_ve_password_girer(String username, String password) throws InterruptedException {

        adminUS028.username.sendKeys("bergin");
        adminUS028.password.sendKeys("ABCDEF");
    }
    @Given("admin sign in sayfasinda sign in butona tiklar")
    public void admin_sign_in_sayfasinda_sign_in_butona_tiklar()throws InterruptedException {

        adminUS028.signInPageSignInButton.click();
    }
    @Given("admin admin sayfasini goruntuler")
    public void admin_admin_sayfasini_goruntuler() throws InterruptedException {

        Assert.assertTrue(adminUS028.adminPage.isDisplayed());
    }
    @Given("admin items and titles dropdowna tiklar")
    public void admin_items_and_titles_dropdowna_tiklar() throws InterruptedException {

        adminUS028.itemsTitles.click();
    }
    @Given("admin country buttona tiklar")
    public void admin_country_buttona_tiklar() throws InterruptedException {

        adminUS028.countryDropdown.click();
    }
    @Given("admin countries sayfasini goruntuler")
    public void admin_countries_sayfasini_goruntuler() throws InterruptedException {

        Assert.assertTrue(adminUS028.countriesHeader.isDisplayed());
    }
    @Given("admin create a new Country buttona tiklar")
    public void admin_create_a_new_country_buttona_tiklar() throws InterruptedException {

        adminUS028.createANewCountryButton.click();
    }
    @Given("admin ulke ismini girer {string}")
    public void admin_ulke_ismini_girer(String countryname) throws InterruptedException {

        adminUS028.countryNameBox.sendKeys("Sri Lanka");
    }
    @Given("admin Save buttona tiklar")
    public void admin_save_buttona_tiklar() throws InterruptedException, IOException {
        adminUS028.saveButton.click();

    }
    @Given("admin a new country is created with identifier mesajini goruntuler")
    public void admin_a_new_country_is_created_with_identifier_mesajini_goruntuler() {
        Assert.assertTrue(adminUS028.alertNewCountryCreated.isDisplayed());
    }

    //Admin ulke olusturup silebilir.

    @And("admin yeni ulke ismini girer {string}")
    public void adminYeniUlkeIsminiGirer(String countryname) throws InterruptedException {

        adminUS028.countryNameBox.sendKeys("Gine Conakry");
    }
    @Given("admin bir ulke secer")
    public void admin_bir_ulke_secer() {
        // Driver.scrollIntoViewJS(admin028.deleteCountry);
        //Driver.selectByVisibleText(admin028.deleteCountry, "Gine Conakry");
        //Driver.wait(8);
    }
    @Given("admin delete buttona tiklar")
    public void admin_delete_buttona_tiklar() {
        Driver.waitAndClick(adminUS028.deleteCountry,3);
    }
    @Given("admin silme uyarisini gorur")
    public void admin_silme_uyarisini_gorur() {
        Driver.waitAndClick(adminUS028.deleteConfirm, 2);
    }
    @Given("admin a country is deleted with identifier yazisini goruntuler")
    public void admin_a_country_is_deleted_with_identifier_yazisini_goruntuler()throws InterruptedException {
        Assert.assertTrue(adminUS028.deletedMessage.isDisplayed());

    }
    @Then("admin driveri kapatir")
    public void admin_driveri_kapatir() {Driver.closeDriver();;
    }

    //Admin sehir olusturmaya calısır ama basaramaz.

    @Given("admin states and cities buttona tiklar")
    public void admin_states_and_cities_buttona_tiklar()throws InterruptedException {

        adminUS028.stateCityHeader.click();
    }
    @Given("admin crete a new StateCity buttona tiklar")
    public void admin_crete_a_new_state_city_buttona_tiklar() {
        Driver.waitAndClick(adminUS028.createANewStateCity, 2);
    }
    @Given("admin bir StateCity ismi girer {string}")
    public void admin_bir_state_city_ismi_girer(String name) {
        Driver.waitAndSendText(adminUS028.stateCityNameBox, "Kutahya", 2);
    }
    @Given("admin bir ulkeye tiklar {string}")
    public void admin_bir_ulkeye_tiklar(String string) {
        Driver.selectByVisibleText(adminUS028.countryDropDown,"Turkiye");
        Driver.wait(2);
    }
    @Given("admin Field translation-not-found[hospitalmsappfrontendApp.CState.country] cannot be empty! mesajini BUG olarak gorur")
    public void admin_field_translation_not_found_hospitalmsappfrontend_app_c_state_country_cannot_be_empty_mesajini_bug_olarak_gorur() throws IOException, InterruptedException {
        Assert.assertTrue(adminUS028.stateCityAlert.isDisplayed());
        Thread.sleep(1000);
        ReusableMethods.getScreenshot("sehir olusturulamadi");
    }

}

