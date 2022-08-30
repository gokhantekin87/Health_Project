package stepdefinitions.api_stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.Room;
import pojos.RoomPost;
import pojos.TestItem;
import pojos.TestItemPost;
import utilities.ConfigReader;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US017_APIStepDefs {

    Response response;
    TestItem[] testItem;
    TestItemPost testItempost=new TestItemPost();

    @Given("kullanici test item bilgileri icin get request yapar")
    public void kullaniciTestItemBilgileriIcinGetRequestYapar() {
        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("testItem_getEndpoint"));
        response.then().assertThat().statusCode(200);
        response.prettyPrint();
    }

    @And("kullanici gelen test item datayi deserialize eder")
    public void kullaniciGelenTestItemDatayiDeserializeEder() throws IOException {
        ObjectMapper obj=new ObjectMapper();

        testItem=obj.readValue(response.asString(),TestItem[].class);

        System.out.println("TEST ITEM SAYISI ---->  "+testItem.length);
        for (int i = 0; i < testItem.length; i++) {
             System.out.println(testItem[i].getPrice());

        }
    }

    @Given("kullanici id ile test item bilgileri icin get request yapar")
    public void kullaniciIdIleTestItemBilgileriIcinGetRequestYapar() {

    }

    @Then("kullanici {string} name dogrular")
    public void kullaniciNameDogrular(String arg0) {
    }

    @Then("kullanici {string} description dogrular")
    public void kullaniciDescriptionDogrular(String arg0) {
    }

    @Then("kullanici test item {int} price dogrular")
    public void kullaniciTestItemPriceDogrular(int arg0) {
    }

    @Then("kullanici test item {string} defaultMinValue dogrular")
    public void kullaniciTestItemDefaultMinValueDogrular(String arg0) {
    }

    @Given("kullanici test item icin post request yapar")
    public void kullaniciTestItemIcinPostRequestYapar() {
    }

    @Then("kullanici olusturulan test item bilgilerini dogrular")
    public void kullaniciOlusturulanTestItemBilgileriniDogrular() {
    }

    @Given("kullanici test item icin put request yapar")
    public void kullaniciTestItemIcinPutRequestYapar() {
    }

    @Then("kullanici test item put request validation yapar")
    public void kullaniciTestItemPutRequestValidationYapar() {
    }

    @Given("kullanici test item icin delete request yapar")
    public void kullaniciTestItemIcinDeleteRequestYapar() {
    }

    @Then("kullanici test item delete request validation yapar")
    public void kullaniciTestItemDeleteRequestValidationYapar() {
    }
}
