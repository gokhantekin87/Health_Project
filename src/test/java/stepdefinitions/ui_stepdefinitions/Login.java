package stepdefinitions.ui_stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;
import static utilities.ReusableMethods.waitForClickablility;

public class  Login {
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

    static LoginPage loginPage=new LoginPage();

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

    @And("insan ikonuna tiklar")
    public void insanIkonunaTiklar() {
        loginPage.accountMenu.click();
    }

    @And("register butonuna tiklar")
    public void registerButonunaTiklar() {
        loginPage.register.click();
    }

    @And("kullinici {string} girisi icin {string} {string} girerek giris yapar")
    public void kulliniciGirisiIcinGirerekGirisYapar(String rol, String username, String password) {
        loginPage.accountMenu.click();
        loginPage.signIn.click();
        loginPage.usernameTextbox.sendKeys(username);
        loginPage.passwordTextbox.sendKeys(password);
        loginPage.signInButton.click();
        waitFor(2);
    }

    @Then("kullanici basarili giris yapdigini dogrular {string}")
    public void kullaniciBasariliGirisYapdiginiDogrular(String userName) {
        Assert.assertTrue(" "+userName+" giris basarisiz",
                Driver.getDriver().findElement(By.xpath("//span[text()='"+userName+"']")).isDisplayed());
    }

    @Then("kullanici {string} ve {string} girerek giris yapar2")
    public void kullaniciVeGirerekGirisYapar2(String username, String password) {
        waitForClickablility(loginPage.accountMenu,3).click();
        loginPage.signIn.click();
        loginPage.usernameTextbox.sendKeys(ConfigReader.getProperty(username));
        loginPage.passwordTextbox.sendKeys(ConfigReader.getProperty(password));
        loginPage.rememberMe.click();
        loginPage.signInButton.click();
    }

    public static void signIn (){
        loginPage.usernameTextbox.sendKeys("admin59");
        loginPage.passwordTextbox.sendKeys("admin");
        loginPage.rememberMe.click();
        loginPage.signInButton.click();
    }


    @And("sayfayi kapat")
    public void sayfayiKapat() {
        Driver.getDriver().close();

    }

    @And("quite")
    public void quite() {
        Driver.getDriver().quit();
    }
}
