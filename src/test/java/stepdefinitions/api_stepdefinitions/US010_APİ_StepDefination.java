package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import utilities.ApiUtils;
import utilities.Authentication;
import utilities.ConfigReader;

import java.util.List;

import static io.restassured.RestAssured.given;

public class US010_APİ_StepDefination {

    static Response response;
    static RequestSpecification spec;


    @Given("Physician URLe alma istegi gonderir")
    public void physician_ur_le_alma_istegi_gonderir() {

        String token = Authentication.generateToken();
        response= given().headers(
                "Authorization","Bearer "+ token,
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).spec(spec).when().get("/{first}/{second}");



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

        Assert.assertTrue(rdnid.contains("171178"));



    }

}
