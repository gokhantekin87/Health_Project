package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.us_pages.US024_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US026_MyAppointmentsStepdefinations {

    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

    US024_page usp =new US024_page();

    @Then("kullanici contact butonuna tiklar")
    public void kullanici_contact_butonuna_tiklar() {

        usp.contact.click();
        ReusableMethods.waitFor(2);


    }

    @Then("kullanici {string},{string},{string}, {string} bolumlerini doldurur")
    public void kullanici_bolumlerini_doldurur(String string, String string2, String string3, String string4) {

        usp.contactname.sendKeys(ConfigReader.getProperty(string));
        usp.contactemail.sendKeys(ConfigReader.getProperty(string2));
        usp.contactsubject.sendKeys(ConfigReader.getProperty(string3));
        usp.contactmesaj.sendKeys(ConfigReader.getProperty(string4));

        ReusableMethods.waitFor(7);



    }

    @Then("kullanici Send butonuna tıklar")
    public void kullanici_send_butonuna_tıklar() {

        //usp.contactsend.click();
        js.executeScript("arguments[0].click();",usp.contactsend);
        ReusableMethods.waitFor(1);


    }

    @Then("your massage has been received yazisinin ciktigini dogrular")
    public void your_massage_has_been_received_yazisinin_ciktigini_dogrular() {

        Assert.assertTrue(usp.mesajbasarili.isDisplayed());

    }
}
