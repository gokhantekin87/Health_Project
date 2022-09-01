package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.staff_pages.StaffPage;
import pages.staff_pages.Staff_SearchPatientPage;
import pages.us_pages.US022_Page;

public class US022_StepDefinition {
    StaffPage staffPage=new StaffPage();
    Staff_SearchPatientPage searchStaff=new Staff_SearchPatientPage();
    US022_Page page22= new US022_Page();
    @Given("kullanici Search Patient yazisina tiklar")
    public void kullanici_search_patient_yazisina_tiklar() {
      staffPage.searchPatient.click();
    }
    @Given("Kullanici Patient SSN kutucuguna SSN girer")
    public void kullanici_patient_ssn_kutucuguna_ssn_girer() {
     searchStaff.ssnTextbox.sendKeys("321-90-8965");
    }
    @Given("Kullanici assagidaki listede hastanin ciktigini test eder")
    public void kullanici_assagidaki_listede_hastanin_ciktigini_test_eder() {
        Assert.assertTrue(page22.isim.isDisplayed());
    }

    @Given("Kullanici  sayfadaki Show Appointments kismina tiklar")
    public void kullanici_sayfadaki_show_appointments_kismina_tiklar() {
        page22.showApp.click();

    }
    @Given("Kullanici sayfadaki Show Tests kismina tiklar")
    public void kullanici_sayfadaki_show_tests_kismina_tiklar() {
       page22.showAppTest.click();
    }
    @Given("Kullanici No Tests found yazisinin gorundugunu test eder")
    public void kullanici_no_tests_found_yazisinin_gorundugunu_test_eder() {
     //Assert.assertTrue(page22.testAdi.isDisplayed());
     Assert.assertTrue(page22.notestfound.isDisplayed());

    }
    @Given("Kullanici View Results butonuna tiklar")
    public void kullanici_view_results_butonuna_tiklar() {
       page22.viewResult.click();
    }
    @Given("Kullanici ID-Result gordugunu tets eder")
    public void kullanici_id_result_gordugunu_tets_eder(){
       Assert.assertTrue(page22.ID.isDisplayed());
       Assert.assertTrue(page22.nam.isDisplayed());
       Assert.assertTrue(page22.Result.isDisplayed());
    }


}
