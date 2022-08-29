package stepdefinitions.api_stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojos.Physician;
import utilities.ConfigReader;

import java.util.Optional;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US018_API_StepDefs {
    Response response;
    Physician[] physicians;

    static RequestSpecification spec;
    ObjectMapper obj = new ObjectMapper();
    @Given("kullanici physician bilgileri icin get request yapabilmeli")
    public void kullaniciPhysicianBilgileriIcinGetRequestYapabilmeli() {

        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("US018_Physician_get_request"));
        response.then().assertThat().statusCode(200);
        response.prettyPrint();

    }

    @Then("kullanici hasta bilgilerini dogrular {string} {string} {string} {string} {string} {string} {string} {string}")
    public void kullaniciHastaBilgileriniDogrular(String firstname, String lastname, String birthDate, String phone,String gender, String adress, String speciality, int examFee) {
        JsonPath jsonPath=response.jsonPath();
        String actName=jsonPath.getString("firstName");
        assertEquals(actName,firstname);
        String actLastname=jsonPath.getString("lastName");
        assertEquals(actLastname,lastname);
        //assertEquals(jsonPath.get("birthDate"),birthDate);
        assertEquals(jsonPath.get("phone"),phone);
        assertEquals(jsonPath.get("gender"),adress);
        assertEquals(jsonPath.get("adress"),gender);
        //assertEquals(jsonPath.get("speciality"),speciality);
        //assertEquals(Optional.ofNullable(jsonPath.get("examFee")),examFee);
    }

    @Then("kullanici hasta bilgilerini dogrular {string} {string} {string} {string} {string}")
    public void kullaniciHastaBilgileriniDogrular(String firstname, String lastname, String phone,String gender, String adress) {
        JsonPath jsonPath=response.jsonPath();
        String actName=jsonPath.getString("firstName");
        assertEquals(actName,firstname);
        String actLastname=jsonPath.getString("lastName");
        assertEquals(actLastname,lastname);
        assertEquals(jsonPath.get("phone"),phone);
        assertEquals(jsonPath.get("gender"),adress);
        assertEquals(jsonPath.get("adress"),gender);
    }


}
