package stepdefinitions.ui_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.doctor_pages.DoctorPage;
import utilities.Driver;
import utilities.ReusableMethods;


public class US010_My_Appointments_for_Physician {

    DoctorPage dp =new DoctorPage();
    JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();
    Actions actions=new Actions(Driver.getDriver());

    @Given("kullanici mypage butonuna tiklar")
    public void kullanici_mypage_butonuna_tiklar() {
        ReusableMethods.waitFor(1);
        dp.MyPAGES.click();

    }
    @Given("kullanici My Appointments butonuna tiklar")
    public void kullanici_my_appointments_butonuna_tiklar() {
        ReusableMethods.waitFor(1);


            js.executeScript("arguments[0].click();",dp.myAppointmentsButonu);

        }

    @Given("kullanici {string}'in gorunurr oldugunu dogrular")
    public void kullanici_in_gorunurr_oldugunu_dogrular(String string) {


        String actualText=DoctorPage.apppointmentsPagesText.getText();

        String expectedText="Appointments";
        Assert.assertEquals(expectedText,actualText);

    }

    @Then("kullanici Randevu listesinde randevularin gorundugunu dogrular")
    public void kullanici_randevu_listesinde_randevularin_gorundugunu_dogrular() {

        ReusableMethods.waitFor(2);

        String randevular = DoctorPage.ilkRandevuID.getText();
        System.out.println("randevu bilgileri:"+randevular);


    }

    @Then("sayfayi kapatir")
    public static void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @Then("Kullanici patient id, start date, end date, status bilgilerini gorebilmeli")
    public void kullanici_patient_id_start_date_end_date_status_bilgilerini_gorebilmeli() {

        ReusableMethods.waitFor(2);
        String hastaid = DoctorPage.patientID.getText();
        String startdate = DoctorPage.startdate.getText();
        String enddate =DoctorPage.enddate.getText();
        String status =DoctorPage.status.getText();


        System.out.println("randevu id:"+hastaid);
        System.out.println("satart Date:"+startdate);
        System.out.println("end date:"+enddate);
        System.out.println("Status: "+status);


    }




    }



