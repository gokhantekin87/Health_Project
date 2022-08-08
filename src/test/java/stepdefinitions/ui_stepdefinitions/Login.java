package stepdefinitions.ui_stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Login {
    /*
    Bu methodu kullanmak icin Scenario da yazdiginiz ile method isminin ayni olmasi gerekiyor
    Bu class daki method da hic bir degisiklik yapmiyoruz
    Onemli: cift tirnak icine herkes kendi rolune ve hesabina ait username ve password
    variable larin config.properties dosyasinda nasil isim verdiyseniz scenario da onu yazacaksiniz
    Ornek:
    Scenario: US009 TC001
    Given kullanici medunna anasayfasinda
    Then kullanici "staffUsername" ve "staffPassword" girerek giris yapar
     */

    LoginPage loginPage=new LoginPage();

    @Given("kullanici medunna anasayfasinda") public void kullaniciMedunnaAnasayfasinda(){
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("kullanici {string} ve {string} girerek giris yapar")
    public void kullaniciVeGirerekGirisYapar(String username, String password) {
        loginPage.accountMenu.click();
        loginPage.signIn.click();
        loginPage.usernameTextbox.sendKeys(ConfigReader.getProperty(username));
        loginPage.passwordTextbox.sendKeys(ConfigReader.getProperty(password));
        loginPage.signInButton.click();
    }
}
