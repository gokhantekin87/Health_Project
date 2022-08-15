package stepdefinitions.api_stepdefinitions;


import baseUrl.Medunna;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pojos.US001_UsersPojo;
import utilities.Authentication;
import utilities.ConfigReader;

import java.io.IOException;
import static io.restassured.RestAssured.given;

public class US001_Api {

    /*
    {
      "activated": true,
      "authorities": [
        "string"
      ],
      "createdBy": "string",
      "createdDate": "2022-08-10T14:12:07.680Z",
      "email": "string",
      "firstName": "string",
      "id": 0,
      "imageUrl": "string",
      "langKey": "string",
      "lastModifiedBy": "string",
      "lastModifiedDate": "2022-08-10T14:12:07.680Z",
      "lastName": "string",
      "login": "string",
      "ssn": "string"
    }
     */
    /*
      Given
         https://medunna.com/api/users
      When
         user send a request to the url
      Then
         Status code is 200
     */

    /*
        Response response =  given().headers("Authorization","Bearer " + token,
                "Content-Type",ContentType.JSON,"Accept",
               ContentType.JSON).when().get(Medunna.);
               // ContentType.JSON).when().get(ConfigReader.getProperty("US001_endPoint"));
        response.then().assertThat().statusCode(200).contentType("application/json");
        */
        /*
        response = given().headers(
                "Authorization",
           //   "Bearer " + token,
                "Content-Type", ContentType.JSON,
                "Accept", ContentType.JSON).spec(spec).when().get("/{first}/{second}");
        */
        static RequestSpecification spec;
        static Response response;
        static US001_UsersPojo registrant =new US001_UsersPojo();

        @Given("Kullanici tum kayit edilenler icin end point belirler")
        public void kullanici_tum_kayit_edilenler_icin_end_point_belirler() {
            spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
            spec.pathParams("first","api","second","users").
                    queryParams("page",1,"size",5000);
        }
        @Given("Kullanici request gonderir")
        public void kullanici_request_gonderir() {

            String token = Authentication.generateToken();
            response= given().headers(
                    "Authorization","Bearer "+ token,
                    "Content-Type", ContentType.JSON,
                    "Accept",ContentType.JSON
            ).spec(spec).when().get("/{first}/{second}");

            response.prettyPrint();
        }
        @Given("Kullanici status kodun ikiyuz oldugunu dogrular")
        public void kullanici_status_kodun_ikiyuz_oldugunu_dogrular() {
            response.then().assertThat().statusCode(200);
            System.out.println("status code :" + response.statusCode());

        }
        @Given("Kullanici tum kayit edilenlerin sayisinin beklenen sonucla ayni olduğunu dogrular")
        public void kullanici_tum_kayit_edilenlerin_sayisinin_beklenen_sonucla_ayni_oldugunu_dogrular() {

        }

///////////////////////////////////////////////////////////////////////////////////
    @Then("Kullanici API icin Url set eder")
    public void kullanici_apı_icin_url_set_eder() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first","api","second","register");
    }

        @Then("Kullanici expected datalari girer")
        public void kullanici_expected_datalari_girer() {
            Faker faker = new Faker();
            registrant.setEmail (faker.internet().emailAddress());
            registrant.setFirstName (faker.name().firstName());
            registrant.setLastName (faker.name().lastName());
            registrant.setLogin(faker.name().username());
            registrant.setSsn (faker.idNumber().ssnValid());
            registrant.setPassword (faker.internet().password(7,16,true,true,true));
        }
        @When("Kullanici request gonderir ve response alir")
        public void kullanici_request_gonderir_ve_response_alir() {
            response= given().spec(spec).contentType(ContentType.JSON).body(registrant).when().post("/{first}/{second}");
        }  //response actual'dir
        @Given("Kullanici  bilgileri dogrular")
        public void kullanici_bilgileri_dogrular() throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            US001_UsersPojo actualData=mapper.readValue(response.asString(), US001_UsersPojo .class);
            Assert.assertEquals(registrant.getEmail(), actualData.getEmail());
            Assert.assertEquals(registrant.getFirstName(), actualData.getFirstName());
            Assert.assertEquals(registrant.getLastName(), actualData.getLastName());
            Assert.assertEquals(registrant.getLogin(), actualData.getLogin());
            Assert.assertEquals(registrant.getSsn(), actualData.getSsn());
        }
    }