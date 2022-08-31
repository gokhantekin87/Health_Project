package stepdefinitions.api_stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import org.junit.Assert;
import utilities.ConfigReader;
import pojos.Messages;


import java.io.IOException;



import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;



public class US027_ApiAdmnMessageStepDef {

    Response response;
    Messages admmes=new Messages();

    @Given("Admin mesajlar için set the path params yapar")
    public void admin_mesajlar_için_set_the_path_params_yapar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1","api","2","c-messages");

    }

    @When("Admin mesajlar için beklenen dataları girer")
    public void admin_mesajlar_için_beklenen_dataları_girer() {
        admmes.setName("Helen Boz");
        admmes.setEmail("nesar121@hotmail.com");
        admmes.setSubject("saglik");
        admmes.setMessage("Biz cok iyiyiz");

    }

    @When("Admin mesajlar için post request yapar ve  yanıt alır")
    public void admin_mesajlar_için_post_request_yapar_ve_yanıt_alır() {
        response = given().spec(spec).header("Authorization", "Bearer " + generateToken(),
                "Content-Type", ContentType.JSON, "Accept", ContentType.JSON ).
                body(admmes).when().post("/{1}/{2}/");
        response.prettyPrint();
    }


    @Then("Admin API ile kayıtlı tüm mesaj bilgilerini doğrular")
    public void admin_apı_ile_kayıtlı_tüm_mesaj_bilgilerini_doğrular() throws IOException {
        response.then().statusCode(201);
        response.prettyPrint();
        ObjectMapper msjObj =new ObjectMapper();
        Messages actualMessages = msjObj.readValue(response.asString(), Messages.class);
        System.out.println("actualMessages = " + actualMessages);
        Assert.assertEquals(admmes.getName(), actualMessages.getName());
        Assert.assertEquals(admmes.getEmail(), actualMessages.getEmail());
        Assert.assertEquals(admmes.getSubject(), actualMessages.getSubject());
        Assert.assertEquals(admmes.getMessage(), actualMessages.getMessage());

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
