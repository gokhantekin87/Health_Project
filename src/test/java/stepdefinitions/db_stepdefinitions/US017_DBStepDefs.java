package stepdefinitions.db_stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;

public class US017_DBStepDefs {
    double price=59.0;

    @And("kullanici {int} {string} li test ogesinin bilgilerini {string} {string} tablosundan alir")
    public void kullaniciLiTestOgesininBilgileriniTablosundanAlir(int actualId, String idColumn, String column, String table) {
        String query = "select " + column + " from " + table + " where " + idColumn + "=" + actualId;
//[{price=59.00, default_val_min=0, name=test item no:03, description=test item for api/db test validation,
// default_val_max=100, last_modified_date=2022-08-30 14:25:56.428112, id=250218,
// created_date=2022-08-30 14:25:56.428112, last_modified_by=admin59, created_by=admin59}]
        DBUtils.executeQuery(query);

    }

    @Then("kullanici test ogesinin {string} i {string} oldugunu dogrular")
    public void kullaniciTestOgesininIOldugunuDogrular(String column, String testdata) throws SQLException {
        Assert.assertEquals(DBUtils.getResultset().getObject(column), testdata);
    }

    @Then("kullanici test ogesinin {string} i {double} oldugunu dogrular")
    public void kullaniciTestOgesininIOldugunuDogrular(String column, double testdata) throws SQLException {
        Assert.assertEquals(DBUtils.getResultset().getObject(column), price);
    }

    @Then("kullanici test ogesinin {string}  {string} oldugunu dogrular")
    public void kullaniciTestOgesininOldugunuDogrular(String column, String testdata) throws SQLException {
        DBUtils.getResultset().next();
        Assert.assertEquals(DBUtils.getResultset().getObject(column), testdata);
    }


}
