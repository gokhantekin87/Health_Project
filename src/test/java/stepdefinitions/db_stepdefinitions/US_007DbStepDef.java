package stepdefinitions.db_stepdefinitions;



import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.WriteToTxt;

import java.util.List;

public class US_007DbStepDef {

    List<Object> list;


    public static void main(String[] args) {


        DBUtils.createConnection();
        String query1 = "select * from appointment";
        String query2 = "select * from appointment?id=184275";
        String expectedId;

        List<Object> list = DBUtils.getColumnData(query1, "id");
        System.out.println("list = " + list);

        expectedId = "184275";
        boolean flag = false;
        for (Object w : list) {
            if (w.toString().equals(expectedId)) {
                flag = true;
                break;
            }

        }


        Assert.assertTrue(flag);


        String dosyaYolu = "src/test/resources/testData/AppointmentDataDB.txt";
        WriteToTxt.saveAppointmentDataBaseWithList(dosyaYolu, list);


    }

    @Given("DB ile connection olusturulur")
    public void db_ile_connection_olusturulur() {

        DBUtils.createConnection();

    }

    @When("Query olusturularak randevular databaseden alinir")
    public void query_olusturularak_randevular_databaseden_alinir() {

        String query1 = "select * from appointment";
        list = DBUtils.getColumnData(query1, "id");

    }

    @Then("Randevu {string} databasede mevcut mu kontrol edilir")
    public void randevu_databasede_mevcut_mu_kontrol_edilir(String expectedId) {


        boolean flag = false;
        for (Object w : list) {
            if (w.toString().equals(expectedId)) {
                flag = true;
                break;
            }

        }


        Assert.assertTrue("Randevu id Database'de mevcud degil",flag);

    }


}
