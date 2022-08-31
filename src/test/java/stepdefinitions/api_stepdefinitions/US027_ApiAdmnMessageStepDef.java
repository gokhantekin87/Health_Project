package stepdefinitions.api_stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.MessagePost;
import utilities.ConfigReader;
import pojos.Messages;


import java.io.IOException;




import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.Authentication.generateToken2;


public class US027_ApiAdmnMessageStepDef {

    Response response;
    MessagePost expectedData=new MessagePost();
    Messages actualData=new Messages();
    RequestSpecification spec;


    @Given("Admin mesajlar icin set the path params yapar")
    public void admin_mesajlar_icin_set_the_path_params_yapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl2")).build();
        spec.pathParams("1","api","2","c-messages");

    }

    @When("Admin mesajlar için post request yapar ve  yanıt alır")
    public void admin_mesajlar_için_post_request_yapar_ve_yanıt_alır() {
        expectedData.setName("Helen Boz");
        expectedData.setEmail("nesar121@hotmail.com");
        expectedData.setSubject("saglik");
        expectedData.setMessage("Biz cok iyiyiz");
        response = given().headers("Authorization", "Bearer " + generateToken()).
                spec(spec).contentType(ContentType.JSON).
                body(expectedData).when().post("/{1}/{2}");
        response.prettyPrint();
    }


    @Then("Admin API ile kayıtlı tüm mesaj bilgilerini doğrular")
    public void admin_apı_ile_kayıtlı_tüm_mesaj_bilgilerini_doğrular() throws IOException {

        ObjectMapper msjObj =new ObjectMapper();
        actualData = msjObj.readValue(response.asString(), Messages.class);
        System.out.println("actualMessages = " + actualData);
        Assert.assertEquals(expectedData.getName(), actualData.getName());
        Assert.assertEquals(expectedData.getEmail(), actualData.getEmail());
        Assert.assertEquals(expectedData.getSubject(), actualData.getSubject());
        Assert.assertEquals(expectedData.getMessage(), actualData.getMessage());

    }

    @When("Admin mesajlar icin get request yapar ve yanıt alır")
    public void admin_mesajlar_icin_get_request_yapar_ve_yanıt_alır() {


    }


    @And("Admin get yaptığı mesaj bilgilerinin tümünü API ile kaydeter")
    public void adminGetYaptığıMesajBilgilerininTümünüAPIIleKaydeter() {


    }
    @Then("Admin API ile Assertion yapar")
    public void admin_apı_ile_assertion_yapar() {


    }
}
