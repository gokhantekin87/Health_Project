package stepdefinitions.db_stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US018_DBStepDefs {

    List<Object> firstNameList;
    List<Object> lastNameList;
    List<Object> phoneNumberList;
    List<Object> genderList;
    List<Object> adressList;

    //@Given("kullanici database baglanir")
    //public void kullanici_database_baglanir() {}

    @Given("kullanici physician bilgilerini {string} {string} tablosundan alir")
    public void kullanici_physician_bilgilerini_tablosundan_alir(String column, String table) {
        String query="select "+column+" from "+table+ " ";

        firstNameList= getColumnData(query,"first_name");
        lastNameList= getColumnData(query,"last_name");
        phoneNumberList= getColumnData(query,"phone");
        genderList= getColumnData(query,"gender");
        adressList= getColumnData(query,"adress");
        System.out.println(phoneNumberList);
    }
    @Then("kullanici tabloda firstname {string} oldugunu dogrular")
    public void kullanici_tabloda_firstname_oldugunu_dogrular(String firstname) {
        Assert.assertTrue(firstNameList.contains(firstname));
    }
    @Then("kullanici tabloda lastname {string} oldugunu dogrular")
    public void kullanici_tabloda_lastname_oldugunu_dogrular(String lastname) {
        Assert.assertTrue(lastNameList.contains(lastname));
    }
    @Then("kullanici tabloda phone {string} oldugunu dogrular")
    public void kullanici_tabloda_phone_oldugunu_dogrular(String phone) {
        Assert.assertTrue(phoneNumberList.contains(phone));
    }
    @Then("kullanici tabloda gender {string} oldugunu dogrular")
    public void kullanici_tabloda_gender_oldugunu_dogrular(String gender) {
        Assert.assertTrue(genderList.contains(gender));
    }
    @Then("kullanici tabloda adress {string} oldugunu dogrular")
    public void kullanici_tabloda_adress_oldugunu_dogrular(String adress) {
        Assert.assertTrue(adressList.contains(adress));
    }
    @Then("database kapatilir")
    public void database_kapatilir() {
        DBUtils.closeConnection();
    }





}
