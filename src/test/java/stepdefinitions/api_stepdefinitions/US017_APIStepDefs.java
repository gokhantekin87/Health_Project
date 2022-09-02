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
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US017_APIStepDefs {

    Response response;
    TestItem[] testItem;
    TestItem testItem2;
    TestItem testItemput;
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
        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("testItem_get_testItem_request"));
        response.then().assertThat().statusCode(200);
        response.prettyPrint();

    }

    @Then("kullanici {string} name dogrular")
    public void kullaniciNameDogrular(String name) throws IOException {

        testItem2=response.as(TestItem.class);
        //System.out.println(testItem2.getPrice());
        assertEquals(name,testItem2.getName());

    }

    @Then("kullanici {string} description dogrular")
    public void kullaniciDescriptionDogrular(String description) {
        assertEquals(description,testItem2.getDescription());
    }

    @Then("kullanici test item {int} price dogrular")
    public void kullaniciTestItemPriceDogrular(int price) {
        assertEquals(price,testItem2.getPrice());
    }

    @Then("kullanici test item {string} defaultMinValue dogrular")
    public void kullaniciTestItemDefaultMinValueDogrular(String min) {
        assertEquals(min,testItem2.getDefaultValMin());
    }

    @Then("kullanici test item {string} defaultMaxValue dogrular")
    public void kullaniciTestItemDefaultMaxValueDogrular(String max) {
        assertEquals(max,testItem2.getDefaultValMax());
    }

    @Given("kullanici test item icin post request yapar name {string} girer")
    public void kullaniciTestItemIcinPostRequestYaparNameGirer(String name) {

        testItempost.setName(name);
        testItempost.setDescription("api post request");
        testItempost.setPrice(59);
        testItempost.setDefaultValMin("0");
        testItempost.setDefaultValMax("50");

        response = given().headers(
                "Authorization",
                "Bearer " +generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON
        ).body(testItempost).contentType(ContentType.JSON).when().post(ConfigReader.getProperty("testItem_endpoint"));

    }


    @Then("kullanici olusturulan test item bilgilerini dogrular")
    public void kullaniciOlusturulanTestItemBilgileriniDogrular() throws IOException {
        response.then().assertThat().statusCode(201);

        ObjectMapper obj=new ObjectMapper();
        TestItem testItemActualData=obj.readValue(response.asString(), TestItem.class);
        assertEquals(testItempost.getPrice(),testItemActualData.getPrice());
        assertEquals(testItempost.getDescription(),testItemActualData.getDescription());
        assertEquals(testItempost.getName(),testItemActualData.getName());
        assertEquals(testItempost.getDefaultValMin(),testItemActualData.getDefaultValMin());
        assertEquals(testItempost.getDefaultValMax(),testItemActualData.getDefaultValMax());
    }

    @Given("kullanici test item icin put request yapar")
    public void kullaniciTestItemIcinPutRequestYapar() {

        testItemput.setId(257881);
        testItemput.setPrice(15);
        testItemput.setDescription("deneme0001");
        testItemput.setName("team59 put request");
        testItemput.setDefaultValMax("250mg");
        testItemput.setDefaultValMin("0mg");

        response = given().headers(

                        "Authorization",
                        "Bearer " +generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .body(testItemput).contentType(ContentType.JSON).when().put(ConfigReader.getProperty("testItem_endpoint"));
    }

    @Then("kullanici test item put request validation yapar")
    public void kullaniciTestItemPutRequestValidationYapar() throws IOException {
        response.then().assertThat().statusCode(200);
        response.prettyPrint();

        ObjectMapper obj=new ObjectMapper();
        TestItem testItemputdata=obj.readValue(response.asString(), TestItem.class);

        assertEquals(testItemput.getName(),testItemputdata.getName());
        assertEquals(testItemput.getDefaultValMax(),testItemputdata.getDefaultValMax());
    }

    @Given("kullanici test {int} item icin delete request yapar")
    public void kullaniciTestItemIcinDeleteRequestYapar(int id) {
        response = given().headers(

                        "Authorization",
                        "Bearer " +generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().delete(ConfigReader.getProperty("testItem_endpoint")+"/"+id);
    }

    @Then("kullanici test item delete request validation yapar")
    public void kullaniciTestItemDeleteRequestValidationYapar() {
        response.then().assertThat().statusCode(204);
    }



}
