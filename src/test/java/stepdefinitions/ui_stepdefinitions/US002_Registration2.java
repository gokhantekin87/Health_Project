package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import pages.us_pages.US002_AyhanPage;
import utilities.Driver;

public class US002_Registration2 {


    US002_AyhanPage us02Page = new US002_AyhanPage();

    @Given("kullanici ana sayafaya gider")
    public void kullanici_ana_sayafaya_gider() {
        Driver.getDriver().get("https://www.medunna.com");
    }

        @When("kullanici sag üst karaktere tiklar")
        public void kullanici_sag_üst_karaktere_tiklar() {
            this.us02Page.character.click();
        }


        }





