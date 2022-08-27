package stepdefinitions.db_stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import java.util.ArrayList;
import java.util.List;

public class US028_DBStepDefs {

    @Given("kullanici database e baglanir")
    public void kullanici_database_e_baglanir() {
        DBUtils.createConnection();
    }
    @Given("kullanici bilgileri {string}  {string} tabledan alir")
    public void kullanici_bilgileri_tabledan_alir(String column, String table) {
        String query = "Select " +column+ " from " +table;
        DBUtils.executeQuery(query);
    }
    @Given("kullanici {string}  {string}  {string} goruntuler")
    public void kullanici_goruntuler(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from country", "name");
        System.out.println(allColumnData);

        List<Object> expectedData = new ArrayList<>();
        expectedData.add(data);
        Assert.assertTrue(allColumnData.containsAll(expectedData));
    }
    @Given("kullanici bilgileri {string}  {string} table dan alir")
    public void kullanici_bilgileri_table_dan_alir(String column, String table) {
        String query = "Select " +column+ " from " +table;
        DBUtils.executeQuery(query);
    }
    @Given("kullanici sehir {string}  {string}  {string}  goruntuler")
    public void kullanici_sehir_goruntuler(String table, String column, String data) {
        List<Object> allColumnData = DBUtils.getColumnData("select * from c_state", "name");
        System.out.println(allColumnData);

        List<Object> expectedData = new ArrayList<>();
        expectedData.add(data);
        Assert.assertTrue(allColumnData.containsAll(expectedData));
    }
    @Then("kullanici database baglantisini kapatir")
    public void kullanici_database_baglantisini_kapatir() {
        DBUtils.closeConnection();
    }
}