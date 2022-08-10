package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.staff_pages.StaffPage;
import pages.staff_pages.Staff_SearchPatientPage;

public class US009_StaffStepDefs {

StaffPage page=new StaffPage();
Staff_SearchPatientPage patientPage=new Staff_SearchPatientPage();
    @And("My Pages sekmesinden Search Patient tiklar")
    public void myPagesSekmesindenSearchPatientTiklar() {
        page.staffMyPage.click();
        page.searchPatient.click();

    }


    @Then("Tablo <{string}> icerdigini dogrular")
    public void tabloIcerdiginiDogrular(String patientInfo) {
        Assert.assertTrue(patientPage.patientTbody.getText().contains(patientInfo));

    }
}
