package stepdefinitions.db_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

import static utilities.DatabaseUtility.createConnection;
import static utilities.DatabaseUtility.getColumnData;

public class US019_DBStepDef {
    @And("kullanici id ile staff arar ve dogrular")
    public void kullaniciIdIleStaffArarVeDogrular() {
        //String query="select * from jhi_user";
        //DBUtils.executeQuery("select *from public.staff");
        List<Object> list = getColumnData("select *from public.staff","id");
        System.out.println(list);
        Assert.assertTrue(list.contains("214866"));

    }

    @Given("kullanici DBye baglanir")
    public void kullaniciDByeBaglanir() {
        DBUtils.createConnection();
    }

    @And("aranan staffi onaylar")
    public void arananStaffiOnaylar() {

    }
}
