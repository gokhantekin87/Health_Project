package stepdefinitions.api_stepdefinitions;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.*;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;

public class US009_ApiStepDefs {
    Response response;
    Patient2[] patient;
    Patient2 patient2=new Patient2();
    Patient patientpost=new Patient();
    @Given("kullanici hasta bilgileri icin get request yapar")
    public void kullaniciHastaBilgileriIcinGetRequestYapar() {
      //  ApiUtils.getRequest(ConfigReader.getProperty("patient_getEndpoint"));
        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("patient_getEndpoint"));
        response.then().assertThat().statusCode(200);
        response.prettyPrint();
    }

    @And("kullanici gelen hasta datayi deserialize eder")
    public void kullaniciGelenHastaDatayiDeserializeEder() throws IOException {
        ObjectMapper obj=new ObjectMapper();

        patient=obj.readValue(response.asString(),Patient2 [].class);

        System.out.println("kac tane hasta var?  "+patient.length);
        for (int i = 0; i < patient.length; i++) {
            //System.out.println(patient[i].getFirstName());
            //System.out.println(patient[i].getId());
            //System.out.println(patient[i].getCountry());
            //System.out.println(patient[i].getUser());
            //System.out.println(patient[i].getCstate());
        }
    }

    @Given("kullanici hasta icin post request yapar")
    public void kullaniciHastaIcinPostRequestYapar() {
        Country2 country=new Country2();
        country.setId(1201);
        country.setName("Türkye");

        State cstate=new State();
        cstate.setCountry(country);
        cstate.setId(1262);
        cstate.setName("Hawaii");

        User2 user=new User2();
        user.setId(2001);
        user.setEmail("doctore@email.com");
        user.setFirstName("Doctor");
        user.setLastName("Doctor");
        user.setLogin("doctor");
        user.setSsn("234-55-3432");

    patientpost.setFirstName("Ade");
    patientpost.setLastName("Karay");
    patientpost.setEmail("ade@gmail.com");
    patientpost.setPhone("222-333-2022");
    patientpost.setGender("FEMALE");
    patientpost.setAdress("bir yerler");
    patientpost.setBirthDate("2022-08-16T12:30:02.256Z");
    patientpost.setCountry(country);
    patientpost.setUser(user);
    patientpost.setCstate(cstate);

        response = given().headers(

                "Authorization",
                "Bearer " +generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON

        ).body(patientpost).contentType(ContentType.JSON).when().post(ConfigReader.getProperty("patient_endpoint"));

    }

    @Then("kullanici post request validation yapar")
    public void kullaniciPostRequestValidationYapar() throws IOException {

        response.then().assertThat().statusCode(201);

        ObjectMapper obj=new ObjectMapper();

        Patient patientActualData=obj.readValue(response.asString(), Patient.class);

        assertEquals(patientpost.getFirstName(),patientActualData.getFirstName());
        assertEquals(patientpost.getLastName(),patientActualData.getLastName());
        assertEquals(patientpost.getEmail(),patientActualData.getEmail());
    }

    @Given("kullanici {int} id li hasta bilgileri icin get request yapar")
    public void kullaniciIdLiHastaBilgileriIcinGetRequestYapar(int id) {
        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("US_009_get_patient_request"));
        response.then().assertThat().statusCode(200);
        response.prettyPrint();
    }

    @And("kullanici gelen hasta bilgilerini deserialize eder")
    public void kullaniciGelenHastaBilgileriniDeserializeEder() throws IOException {
        ObjectMapper obj=new ObjectMapper();

        patient2=obj.readValue(response.asString(),Patient2.class);

    }


    @Given("kullanici id ile hasta bilgileri icin get request yapar")
    public void kullaniciIdIleHastaBilgileriIcinGetRequestYapar() {
        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("US_009_get_patient_request"));
        response.then().assertThat().statusCode(200);
        response.prettyPrint();
    }

    @Then("kullanici hasta bilgilerini dogrular {string} {string} {string} {string} {string} {string}")
    public void kullaniciHastaBilgileriniDogrular(String firstName, String lastName, String email, String gender, String phone, String adress) {
        JsonPath jsonpath=response.jsonPath();
        String actualName=jsonpath.getString("firstName");
        Assert.assertEquals(actualName,firstName);
        String actualLastName=jsonpath.getString("lastName");
        Assert.assertEquals(actualLastName,lastName);
        assertEquals(jsonpath.get("email"),email);
        assertEquals(jsonpath.get("gender"),gender);
        assertEquals(jsonpath.get("phone"),phone);
        assertEquals(jsonpath.get("adress"),adress);


    }
}
