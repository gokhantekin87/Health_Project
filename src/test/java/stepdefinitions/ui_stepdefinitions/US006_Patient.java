package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AppointmentPage;

public class US006_Patient {
    AppointmentPage apoitmentPage=new AppointmentPage();
    @Given("kullanici adamIkonuna tiklar")
    public void kullanici_adam_ıkonuna_tiklar() {

        apoitmentPage.adamIkon.click();


    }
    @Given("kunnalici accountSettingse tıklar")
    public void kunnalici_account_settingse_tıklar() {
        apoitmentPage.accountSettings.click();



    }

    @And("kullanici SettingsSaved yazisini kontrol eder")
    public void kullaniciSettingsSavedYazisiniKontrolEder() {
        Assert.assertTrue(apoitmentPage.settingsSavedYazi.isDisplayed());
        if (apoitmentPage.settingsSavedYazi.isDisplayed()){
            System.out.println("Kullanici bilgileri kaydedildi ve bütün bilgiler dolu...");
        }
    }

    @And("kullanici savedButtonuna tıklar")
    public void kullaniciSavedButtonunaTıklar() {
        apoitmentPage.saveButton.click();
    }
}
