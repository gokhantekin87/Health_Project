package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.doctor_pages.DoctorPage;
import pages.us_pages.US024_page;
import utilities.Driver;
import utilities.ReusableMethods;

public class US024_MyAppointmentsStepdefinations {

    DoctorPage dp =new DoctorPage();
    US024_page usp =new US024_page();
    Actions actions=new Actions(Driver.getDriver());


    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

    @Then("kullanici mypagepatient butonuna tiklar")
    public void kullanici_mypagepatient_butonuna_tiklar() {

        ReusableMethods.waitFor(1);
        js.executeScript("arguments[0].click();",usp.MyPAGESpatient);
    }

    @Then("Kullanici sayfadaki ShowTests kismina tiklar")
    public void kullanici_sayfadaki_show_tests_kismina_tiklar() {

        usp.showtest.click();
        usp.viewresukt.click();
        ReusableMethods.waitFor(1);


    }


    @Then("hasta test sonuclarinin goruldugunu dogrular")
    public void hasta_test_sonuclarinin_goruldugunu_dogrular() {




    }

    @Then("id, name for test,default max ve min value, test date and description bolumleri gorulur.")
    public void id_name_for_test_default_max_ve_min_value_test_date_and_description_bolumleri_gorulur() {


        Assert.assertTrue(usp.table.isDisplayed());



    }

    @Then("kullanici showinvoice butonuna tiklar")
    public void kullanici_showinvoice_butonuna_tiklar() {
        ReusableMethods.waitFor(2);

        usp.ShowInvoice.click();

        ReusableMethods.waitFor(2);

    }

    @Then("fatura bilgilerinin oldugunu test eder")
    public void fatura_bilgilerinin_oldugunu_test_eder() {

        ReusableMethods.waitFor(2);


        String date = US024_page.date.getText();
        String namee = US024_page.namee.getText();
        String payment = US024_page.PaymentMethod.getText();
        String ssnn = US024_page.SSNn.getText();
        String totalcst = US024_page.totalcost.getText();

        System.out.println("fatura bilgileri;");
        System.out.println("fatura tarihi: "+date);
        System.out.println("fatura ismi: "+namee);
        System.out.println("fatura SSN: "+ssnn);
        System.out.println("odeme yontemi: "+ payment);
        System.out.println("ucret:  "+totalcst);
        System.out.println("deneme");








    }
}
