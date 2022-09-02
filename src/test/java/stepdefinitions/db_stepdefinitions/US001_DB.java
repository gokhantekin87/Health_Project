package stepdefinitions.db_stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class US001_DB {
    @Given("Kullanici connection olusturur")
    public void kullanici_connection_olusturur() {
        DBUtils.createConnection();
    }
    @Given("Kullanici SSN sutunundaki verileri alir ve dogrular")
    public void kullanici_ssn_sutunundaki_verileri_alir() {
        List<Object> list = DBUtils.getColumnData("select * from jhi_user","ssn" );
        //System.out.println(list);
        Assert.assertTrue(list.contains("133-95-7133"));
    }
}