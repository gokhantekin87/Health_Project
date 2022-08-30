package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.ApiUtils;
import utilities.Authentication;
import utilities.ConfigReader;

import java.util.List;


public class US010_APİ_StepDefination {

    static Response response;
    static RequestSpecification spec;



    @Given("Physician URLe alma istegi gonderir")
    public void physician_ur_le_alma_istegi_gonderir() {


            response = ApiUtils.getRequestdoktor(
                    Authentication.generateToken1(
                            ConfigReader.getProperty("doktorusarname"),
                            ConfigReader.getProperty("doktorpassword")),
                    "https://medunna.com/api/appointments");
            response.prettyPrint();



    }


    @Given("Physician Status Code {int} oldugunu dogrular")
    public void physician_status_code_oldugunu_dogrular(int expectedcode) {
        Assert.assertEquals(expectedcode,response.getStatusCode());

    }

    @Then("Physician Appointmentsleri kontrol eder")
    public void physician_appointmentsleri_kontrol_eder() {

        JsonPath js=response.jsonPath();

        List<Integer> rdnid =js.getList("id");
        List<Integer> firstname =js.getList("firstName");
        List<Integer> login =js.getList("login");
        System.out.println(rdnid);
        System.out.println(firstname);
        System.out.println(login);

        Assert.assertTrue(rdnid.contains(4669));



    }

}
