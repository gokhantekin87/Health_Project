package stepdefinitions.db_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DBUtils;
import utilities.DatabaseUtility;
import utilities.WriteToTxt;

import java.util.List;

import static utilities.DBUtils.getColumnData;

public class US018_DBStepDefs {



    @And("kullanici physician bilgilerini tablosundan alir")
    public void kullaniciPhysicianBilgileriniTablosundanAlir() {

        List<Object> list = DBUtils.getColumnData("select * from physician","id" );
        Assert.assertTrue(list.contains("214524"));

         /* String query = "select * from physician";
        DBUtils.executeQuery(query);

        List<String> phyList=DatabaseUtility.getColumnNames(query);
        System.out.println(phyList);

      List<Object> phyList= DatabaseUtility.getColumnData(query,"first_name");
        System.out.println(phyList+"\n");
        String nameFile= "src/test/resources/testdata/DoktorName.txt";
        WriteToTxt.savePhysicianName(nameFile,phyList);*/

    }


}
