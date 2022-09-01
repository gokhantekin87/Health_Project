package stepdefinitions.db_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.List;

import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getColumnData;

public class US019_DBStepDef {



    @And("kullanici id ile staff arar ve dogrular")
    public void kullaniciIdIleStaffArarVeDogrular() {
        //String query="select * from jhi_user";
        //DBUtils.executeQuery("select *from public.staff");
      /*  List<Object> list = getColumnData("select *from public.staff","id");
        System.out.println(list);
        Assert.assertTrue(list.contains("214866"));*/
/*
[{gender=FEMALE, cstate_id=1275, birth_date=2003-11-03 01:04:00.0,
last_name=solman, description=yeni alim, last_modified_date=2022-09-01 12:12:05.10633,
adress=watermelon street, last_modified_by=53team53, created_by=team52, phone=543-563-8764, u
ser_id=214153, blood_group=Apositive, id=257255, created_date=2022-08-31 10:21:09.29553,
first_name=hasan, country_id=80065}]

 */
        String query = "select * from staff where ID=257255";
       // System.out.println(DBUtils.getQueryResultMap(query));
        DBUtils.executeQuery(query);


    }

    @Given("kullanici DBye baglanir")
    public void kullaniciDByeBaglanir() {
        DBUtils.createConnection();
    }

    @And("aranan staffi onaylar")
    public void arananStaffiOnaylar() throws SQLException {
        DBUtils.getResultset().next();
        Assert.assertEquals(DBUtils.getResultset().getObject("first_name"), "hasan");
        Assert.assertEquals(DBUtils.getResultset().getObject("last_name"), "solman");


    }
}
