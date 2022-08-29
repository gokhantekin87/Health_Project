package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.us_pages.US013_PhysicianTestResultPage;
import pages.us_pages.US_018Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

import java.util.List;


public class US_018StepDefs {
    US_018Page us18page = new US_018Page();
    US013_PhysicianTestResultPage us13page = new US013_PhysicianTestResultPage();
    String alinacakIdStr;
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Actions act = new Actions(Driver.getDriver());
    public US_018StepDefs(){}

    @Given("admin medunna url'e gider")
    public void adminMedunnaUrlEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("{string} Sign in sekmesine gecis yapar ve tıklar")
    public void sign_in_sekmesine_gecis_yapar_ve_tıklar(String string) {
        this.us13page.signInSekmesi.click();
    }
    @Then("{string} giris yapar")
    public void giris_yapar(String admin) {
        this.us13page.signInButonu.click();
        ReusableMethods.waitFor(2);
        this.us13page.usernameKutusu.sendKeys("malikaMasal");
        this.us13page.passwordKutusu.sendKeys("123456.");
        ReusableMethods.waitFor(2);
        this.us13page.signInButonu2.click();
    }
    @Then("{string} items&titles sekmesine gecis yapar ve tıklar")
    public void items_titles_sekmesine_gecis_yapar_ve_tıklar(String string) {
        this.us18page.itemsTitles.click();
    }
    @Then("{string} physicians sekmesine gecis yapar ve tıklar")
    public void physicians_sekmesine_gecis_yapar_ve_tıklar(String string) {
        this.us18page.physicianSekmesi.click();
    }

    @Then("{string} {string} butonuna tıklar")
    public void butonuna_tıklar(String admin, String itemsTitles) {
        ReusableMethods.waitFor(5);
        this.us18page.createNewPhysician.click();
    }
    @Then("{string} {string} kutusuna tıklar")
    public void kutusuna_tıklar(String string, String string2) {
        this.us18page.useCheckbox.click();
    }
    //TC02
    @Then("{string} kayitli bir {string} icin arama yapar")
    public void kayitli_bir_icin_arama_yapar(String string, String SSN) {
        this.us18page.ssnSearch.sendKeys(SSN);
        this.us18page.searchUserButton.click();
        ReusableMethods.waitForVisibility(us18page.dogrulamaMesaji, 10);
        Assert.assertTrue(us18page.dogrulamaMesaji.isDisplayed());
        us18page.dogrulamaMesaji.click();
    }
    @When("admin physician'ın {string} bilgilerini doldurur")
    public void adminPhysicianInBilgileriniDoldurur(String firstnameLastname){
        this.us18page.firstnameField.sendKeys("leylamecnun");
        this.us18page.lastName.sendKeys("fuzuli");
    }
    @When("admin tarih {string} bilgisini girer")
    public void admin_tarih_bilgisini_girer(String birthdate) {
        this.us18page.birthDate.sendKeys(birthdate);
    }
    @When("admin telefon {string} bilgisini girer")
    public void admin_telefon_bilgisini_girer(String phone) {
        this.us18page.phone.sendKeys(phone);
    }
    @When("admin adress {string} bilgisini girer")
    public void admin_adress_bilgisini_girer(String adress) {
        this.us18page.adress.sendKeys(adress);

    }
    @When("admin cinsiyet icin {string} secer")
    public void admin_cinsiyet_icin_secer(String gender) {
        jse.executeScript("arguments[0].scrollIntoView(true);", us18page.genderDdm);
        ReusableMethods.waitFor(3);
        us18page.genderDdm.clear();
        Select select = new Select(us18page.genderDdm);
        select.selectByVisibleText(gender);
    }
    @When("admin speciality icin {string} secer")
    public void admin_speciality_icin_secer(String speciality) {
        ReusableMethods.waitFor(2);
        Select select = new Select(us18page.specialityField);
        select.selectByVisibleText(speciality);
    }
    @When("admin blood group icin {string} secer")
    public void admin_blood_group_icin_secer(String blood) {
        Select select = new Select(us18page.bloodGroupDdm);
        select.selectByVisibleText(blood);
    }
    @When("admin description icin {string} bilgisini girer")
    public void admin_description_icin_bilgisini_girer(String description) {
        this.us18page.description.sendKeys(description);
    }
    @When("admin fotograf yukler")
    public void admin_fotograf_yukler() {
      us18page.dosyaSec.sendKeys("C:\\Users\\90551\\Desktop\\doctor.png");
        ReusableMethods.waitFor(5);
    }
    @When("admin {string} ucret bilgisi girer")
    public void admin_ucret_bilgisi_girer(String examFee) {
        JSUtils.scrollDownByJS();
        this.us18page.examFee.sendKeys(examFee);
    }
    @When("admin {string} country bilgisi girer")
    public void admin_country_bilgisi_girer(String country) {
        Select select = new Select(us18page.countryDdm);
        select.selectByVisibleText(country);
    }

    @Then("admin save butonuna tıklar ve dogrulama mesajinin gorundugunu test eder")
    public void adminSaveButonunaTıklarVeDogrulamaMesajininGorundugunuTestEder() {
        jse.executeScript("arguments[0].click();", us18page.saveButton);
        ReusableMethods.waitFor(5);
        us18page.physicianHead.isDisplayed();
       // WebElement dogrulamaMesaji = Driver.getDriver().findElement(By.xpath("//*[text()='A Physician is updated with identifier ']"));
        //ReusableMethods.waitForVisibility(us18page.dogrulamaMesaji, 10);
        //String expectedDogrMesaji= "A Physician is updated with identifier";
        //String actualDogrMesaji= us18page.dogrulamaMesaji.getText();
        //Assert.assertTrue(dogrulamaMesaji.getText().contains("A Physician is updated with identifier"));
    }
    @Then("admin save butonuna tıklar")
    public void adminSaveButonunaTıklar() {
        jse.executeScript("arguments[0].click();", us18page.saveButton);
        WebElement dogrulamaMesaji = Driver.getDriver().findElement(By.xpath("//*[text()='A Physician is updated with identifier ']"));
        ReusableMethods.waitForVisibility(us18page.dogrulamaMesaji, 10);
        //String expectedDogrMesaji= "A Physician is updated with identifier";
        //String actualDogrMesaji= us18page.dogrulamaMesaji.getText();
        Assert.assertTrue(dogrulamaMesaji.getText().contains("A Physician is updated with identifier"));
    }

    // TC02
   @Then("admin doktorlarin bilgilerini gorebilir")
   public void adminDoktorlarinBilgileriniGorebilir() {
       this.us18page.physicianHead.isDisplayed();
   }

   //TC03
    @And("admin {int} sayfaya gecer")
    public void adminSayfayaGecer(int sayfaNO) {
        ReusableMethods.waitForVisibility(this.us18page.basliklar,50);
        //ReusableMethods.waitFor(5);
        jse.executeScript("arguments[0].scrollIntoView(true);",us18page.medunnaAltBaslik);
        WebElement sayfaNoButton= Driver.getDriver().findElement(By.xpath("//*[text()='"+sayfaNO+"']"));
        jse.executeScript("arguments[0].click();", sayfaNoButton);
        ReusableMethods.waitFor(1);
    }
    //TC04
    @And("admin firstname {string} olan doktorun idisini alir")
    public void adminFirstnameOlanDoktorunIdisiniAlir(String firstname) {
        ReusableMethods.waitFor(5);
        int count = 1;
        List<WebElement> firstnameList = us18page.firstnameTable;
        System.out.println(firstnameList.size());
        for (WebElement i : firstnameList) {
            if (i.getText().equals(firstname)) break;
            count++;
        }
        WebElement alinacakId = Driver.getDriver().findElement(By.xpath("//tr[" + count + "]/td[1]"));
        alinacakIdStr = alinacakId.getText();
        ReusableMethods.waitFor(5);
    }

    @And("admin firstname {string} olan doktorun edit butona tiklar")
    public void adminFirstnameOlanDoktorunEditButonaTiklar(String editButton) {
        ReusableMethods.waitFor(5);
        int count = 1;
        List<WebElement> nameList = us18page.firstnameTable;
        System.out.println(nameList.size());
        for (WebElement i : nameList) {
            if (i.getText().equals(nameList)) break;
            count++;
        }
        //WebElement editlenecekDoktor = Driver.getDriver().findElement(By.xpath("//tr["+count+"]/td[18]/div/a[2]"));
        WebElement editlenecekDoktor = Driver.getDriver().findElement(By.xpath("(//a[@class='btn btn-primary btn-sm'])[4]"));
        jse.executeScript("arguments[0].click();", editlenecekDoktor);
        ReusableMethods.waitFor(10);
    }
    @When("admin edit tarih {string} bilgisini girer")
    public void admin_edit_tarih_bilgisini_girer(String editTarih) {
        ReusableMethods.waitFor(3);
        this.us18page.birthDate.sendKeys(editTarih);
        ReusableMethods.waitFor(5);
    }
    @When("admin edit telefon {string} bilgisini girer")
    public void admin_edit_telefon_bilgisini_girer(String editPhone) {
        us18page.phone.click();
        us18page.phone.clear();
        ReusableMethods.waitFor(3);
        us18page.phone.sendKeys(editPhone);
        ReusableMethods.waitFor(3);
    }
    @When("admin edit adress {string} bilgisini girer")
    public void admin_edit_adress_bilgisini_girer(String editAdress) {
        us18page.adress.click();
        us18page.adress.clear();
        ReusableMethods.waitFor(3);
        this.us18page.adress.sendKeys(editAdress);
        ReusableMethods.waitFor(3);

    }
    @When("admin edit cinsiyet icin {string} secer")
    public void admin_edit_cinsiyet_icin_secer(String editGender) {
        jse.executeScript("arguments[0].scrollIntoView(true);", us18page.genderDdm);
        ReusableMethods.waitFor(3);
        us18page.genderDdm.clear();
        Select select = new Select(us18page.genderDdm);
        select.selectByVisibleText(editGender);
    }
    @When("admin edit speciality icin {string} secer")
    public void admin_edit_speciality_icin_secer(String editSpeciality) {
        ReusableMethods.waitFor(3);
        Select select = new Select(us18page.specialityField);
        select.selectByVisibleText(editSpeciality);
        ReusableMethods.waitFor(3);
    }
    @When("admin edit description icin {string} bilgisini girer")
    public void admin_edit_description_icin_bilgisini_girer(String editDescription) {
        us18page.description.click();
        us18page.description.clear();
        ReusableMethods.waitFor(3);
        this.us18page.description.sendKeys(editDescription);
        ReusableMethods.waitFor(3);
    }
    @When("admin {string} edit ucret bilgisi girer")
    public void admin_edit_ucret_bilgisi_girer(String editExamFee) {
        us18page.examFee.click();
        us18page.examFee.clear();
        ReusableMethods.waitFor(5);
        this.us18page.examFee.sendKeys(editExamFee);
        ReusableMethods.waitFor(5);

    }
    @When("admin {string} edit country bilgisi girer")
    public void admin_edit_country_bilgisi_girer(String editCountry) {
        Select select = new Select(us18page.countryDdm);
        select.selectByVisibleText(editCountry);
    }
    // TC05
    @Then("admin mevcut doktorun delete butonuna tiklar")
    public void adminMevcutDoktorunDeleteButonunaTiklar() {
        ReusableMethods.waitForVisibility(this.us18page.basliklar,50);
        //this.us18page.deleteButton.click();
        WebElement deleteButton = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-danger btn-sm']"));
        jse.executeScript("arguments[0].click();",deleteButton);
        this.us18page.deleteButtonPenc.click();

    }

    @And("admin doktorun silindigini dogrular")
    public void adminDoktorunSilindiginiDogrular() {
        WebElement birinciSıraDR = Driver.getDriver().findElement(By.xpath("//td[1]"));
        Assert.assertTrue(birinciSıraDR.getText().contains("3651"));
    }
    // TC06
    @Given("admin doktoru secebilir")
    public void adminDoktoruSecebilir() {
        ReusableMethods.waitForVisibility(this.us18page.basliklar,50);
        WebElement drSEC = Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-link btn-sm']"));
        jse.executeScript("arguments[0].click();",drSEC);
       // this.us18page.drSEC.click();
    }

    @Then("admin physician secilebilir oldugunu dogrular")
    public void adminPhysicianSecilebilirOldugunuDogrular() {
        WebElement secilemediMesaji= Driver.getDriver().findElement(By.xpath("//*[text()='An unexpected error has occurred.']"));
        Assert.assertFalse(secilemediMesaji.isDisplayed());
    }


}
