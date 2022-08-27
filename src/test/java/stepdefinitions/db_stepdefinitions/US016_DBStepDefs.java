package stepdefinitions.db_stepdefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.DBUtils;
import java.sql.SQLException;

public class US016_DBStepDefs {

    @And("kullanici {int} {string} li odanin bilgilerini {string} {string} tablosundan alir")
    public void kullaniciLiOdaninBilgileriniTablosundanAlir(int actualId, String idColumn, String column, String table) {
        String query = "select " + column + " from " + table + " where " + idColumn + "=" + actualId;
        DBUtils.executeQuery(query);
    /* [{price=59.00, room_number=5910, description=team59 test data for db test,
    last_modified_date=2022-08-25 10:35:37.778648, id=228125, created_date=2022-08-25 10:35:37.778648,
    last_modified_by=admin59, created_by=admin59, room_type=DAYCARE, status=false}]
     */
    }

    @Then("kullanici oda {string} i {string} oldugunu dogrular")
    public void kullaniciOdaIOldugunuDogrular(String column, String testdata) throws SQLException {
        Assert.assertEquals(DBUtils.getResultset().getObject(column), testdata);
    }

    @Then("kullanici oda {string} i {int} oldugunu dogrular")
    public void kullaniciOdaIOldugunuDogrular(String column, int testdata) throws SQLException {
        DBUtils.getResultset().next();
        Assert.assertEquals(DBUtils.getResultset().getObject(column), testdata);
    }

}
