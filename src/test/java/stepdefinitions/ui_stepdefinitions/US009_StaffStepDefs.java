package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;
import pages.staff_pages.StaffPage;
import pages.staff_pages.Staff_SearchPatientPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;

import static utilities.ReusableMethods.waitFor;

public class US009_StaffStepDefs {
    /*
       List<String> expectedPatientInfoList= Arrays.asList("16073","123-78-9871",
                "Hasta","Me","12/08/59 12:08","hastame@gmail.com","FEMALE","AB+",
                "team59 hause","automation test patient","hastame","Maldives");
     */

    StaffPage page=new StaffPage();
    Staff_SearchPatientPage patientPage=new Staff_SearchPatientPage();
    SoftAssert softAssert = new SoftAssert();


    @And("My Pages sekmesinden Search Patient tiklar")
    public void myPagesSekmesindenSearchPatientTiklar() {
        page.staffMyPage.click();
        page.searchPatient.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("search-patient"));}

    @Then("Tabloda {string} gorunur oldugunu dogrular")
    public void tablodaGorunurOldugunuDogrular(String patientInfo) {

        softAssert.assertTrue(Driver.getDriver().findElement(By.xpath("//td[text()="+patientInfo+"]")).isDisplayed(),
                " "+patientInfo+" is not displayed ");
        softAssert.assertAll();}




}
