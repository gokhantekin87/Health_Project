package stepdefinitions.api_stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.US001_UsersPojo;
import utilities.Authentication;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US019_ApiStepDef {

/*
 {
{
  "adress": "string",
  "birthDate": "2022-08-28T23:35:24.820Z",
  "bloodGroup": "Apositive",
  "country": {
    "id": 0,
    "name": "string"
  },
  "createdBy": "string",
  "createdDate": "2022-08-28T23:35:24.820Z",
  "cstate": {
    "country": {
      "id": 0,
      "name": "string"
    },
    "id": 0,
    "name": "string"
  },
  "description": "string",
  "firstName": "string",
  "gender": "MALE",
  "id": 0,
  "lastName": "string",
  "phone": "string",
  "ssn": "189-04-8169",
  "user": {
    "activated": true,
    "createdBy": "string",
    "createdDate": "2022-08-28T23:35:24.820Z",
    "email": "string",
    "firstName": "string",
    "id": 0,
    "imageUrl": "string",
    "langKey": "string",
    "lastName": "string",
    "login": "string",
    "resetDate": "2022-08-28T23:35:24.820Z",
    "ssn": "430-39-4322"
  }
}
 */

    static Response response;
    static RequestSpecification spec;
    static US001_UsersPojo registrant =new US001_UsersPojo();


    @Given("Kulannıcı API icin urle gider")
    public void kulannıcıAPIIcinUrleGider() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("ilk","api","iki","staff").queryParams("id",241329);



    }

    @Then("kullanici beklenen datalari girer")
    public void kullaniciBeklenenDatalariGirer() {
        String token = Authentication.generateToken();
        response= given().headers(
                "Authorization","Bearer "+ token,
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).spec(spec).when().get("/{ilk}/{iki}");

        response.prettyPrint();

    }

    @And("Kullanici status kodunu kontrol eder")
    public void kullaniciStatusKodunuKontrolEder() {
        response.then().assertThat().statusCode(200);
        System.out.println("status code :" + response.statusCode());

    }

    @And("dataları karşılaştırır")
    public void datalarıKarşılaştırır() throws IOException {

    }
}
