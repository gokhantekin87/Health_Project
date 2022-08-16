package stepdefinitions.db_stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

import static utilities.DBUtils.getColumnData;
import static utilities.DBUtils.getResultset;

public class US_009_DBStepDefs {


    List<Object> firstNameList;
    List<Object> lastNameList;
    List<Object> emailList;
    List<Object> phoneList;


    @Given("kullanici database baglanir")
    public void kullaniciDatabaseBaglanir() {
        DBUtils.createConnection();
    }

    @And("database baglantisini kapatir")
    public void databaseBaglantisiniKapatir() {
        DBUtils.closeConnection();
    }

    @And("kullanici hasta bilgilerini {string} {string} tablosundan alir")
    public void kullaniciHastaBilgileriniTablosundanAlir(String column, String table) {
        //Patient yani hasta tablosundan Column, burda * yani tum datalari alir
        String query = "SELECT "+column+" FROM "+table+"";

        //Hangi Column yaziliysa onun datalarini alir ve liste ekler
        firstNameList=getColumnData(query,"first_name");
        System.out.println(firstNameList);
        System.out.println(firstNameList.size());
        lastNameList=getColumnData(query,"last_name");
        emailList=getColumnData(query,"email");
        phoneList=getColumnData(query,"phone");
    }

    @Then("kullanici database de {string} firstname oldugunu dogrular")
    public void kullaniciDatabaseDeFirstnameOldugunuDogrular(Object firstname) {
        //Firstname listi istenen isim (parametredeki firstname) icerdigini dogrulama
        Assert.assertTrue(firstNameList.contains(firstname));
    }

    @Then("kullanici database de {string} lastname  oldugunu dogrular")
    public void kullaniciDatabaseDeLastnameOldugunuDogrular(Object lastname) {
        Assert.assertTrue(lastNameList.contains(lastname));
    }

    @Then("kullanici database de {string} email oldugunu dogrular")
    public void kullaniciDatabaseDeEmailOldugunuDogrular(Object email) {
        Assert.assertTrue(emailList.contains(email));
    }

    @Then("kullanici database de {string} phone oldugunu dogrular")
    public void kullaniciDatabaseDePhoneOldugunuDogrular(Object phone) {
        Assert.assertTrue(phoneList.contains(phone));
    }

    @And("kullanici {int} {string} li hastanin bilgilerini {string} {string} tablosundan alir")
    public void kullaniciLiHastaninBilgileriniTablosundanAlir(int actualId, String idColumn, String column, String table) {
        String query = "select " + column + " from " + table + " where " + idColumn + "=" + actualId;
        DBUtils.executeQuery(query);
    }

    @Then("kullanici hasta {string} i {string} oldugunu dogrular")
    public void kullaniciHastaIOldugunuDogrular(String firstNameColumn, String actualFirstName) throws SQLException {
        DBUtils.getResultset().next();
        Assert.assertEquals(DBUtils.getResultset().getObject(firstNameColumn), actualFirstName);
    }
}
