package stepdefinitions.api_stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.netty.util.collection.ByteCollections;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.Patient;
import utilities.Authentication;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US015_ApiPatientStepDefination extends Authentication {
    Response response;
    Patient patient;
    @Given("Admin hasta bilgisi icin get request yapar")
    public void adminHastaBilgisiIcinGetRequestYapar() {
        response = given().headers("Authorization","Bearer " + generateToken(),"Content-Type", ContentType.JSON,"Accept", ContentType.JSON).when().get(ConfigReader.getProperty("patientEndpoint"));
        response.then().assertThat().statusCode(200);
        response.prettyPrint();
    }

    @Given("Admin hasta bilgilerini deserialize eder")
    public void admin_hasta_bilgilerini_deserialize_eder() throws IOException {

        ObjectMapper obj=new ObjectMapper();
        patient=obj.readValue(response.asString(),Patient.class);



        /*"id": 243691,
    "firstName": "Hatice",
    "lastName": "Son"
    "phone": "5328887766",
    "gender": "FEMALE",
    "bloodGroup": "Apositive",
        Map<String,Object> expectedData = new HashMap<String,Object>();
        expectedData.put("firstName","Hatice");
        expectedData.put("lastName","Son");
        expectedData.put("phone","5328887766");
        expectedData.put("gender","FEMALE");
        expectedData.put("bloodGroup","Apositive");


        Map<String,Object> actualData =response.as(HashMap.class);

        assertEquals(expectedData.get("firstName"),actualData.get("firstName"));*/

    }
    @Then("Admin hasta bilgilerini dogrular")
    public void admin_hasta_bilgilerini_dogrular() {



        Map<String,Object> expectedData = new HashMap<String,Object>();
        expectedData.put("firstName","Hatice");
        expectedData.put("lastName","Son");
        expectedData.put("phone","5328887766");
        expectedData.put("gender","FEMALE");
        expectedData.put("bloodGroup","Apositive");

        assertEquals(expectedData.get("firstName"),patient.getFirstName());
        assertEquals(expectedData.get("lastName"),patient.getLastName());
        assertEquals(expectedData.get("gender"),patient.getGender());
        assertEquals(expectedData.get("phone"),patient.getPhone());



    }


}
