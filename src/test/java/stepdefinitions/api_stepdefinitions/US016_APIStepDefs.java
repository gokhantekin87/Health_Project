package stepdefinitions.api_stepdefinitions;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Room;
import pojos.RoomPost;
import utilities.ConfigReader;
import java.io.IOException;
import java.util.Optional;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US016_APIStepDefs {
    Response response;
    Room [] room;
    RoomPost roompost=new RoomPost();
    @Given("kullanici oda bilgileri icin get request yapar")
    public void kullaniciOdaBilgileriIcinGetRequestYapar() {
        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("room_getEndpoint"));
        response.then().assertThat().statusCode(200);
        response.prettyPrint();
    }

    @And("kullanici gelen oda datayi deserialize eder")
    public void kullaniciGelenOdaDatayiDeserializeEder() throws IOException {
        ObjectMapper obj=new ObjectMapper();

        room=obj.readValue(response.asString(),Room[].class);

        System.out.println("ODA SAYISI ---->  "+room.length);
        for (int i = 0; i < room.length; i++) {
           // System.out.println(room[i].getPrice());
            }
    }

    @Given("kullanici oda icin post request yapar")
    public void kullaniciOdaIcinPostRequestYapar() {
        roompost.setRoomType("DAYCARE");
        roompost.setPrice(59);
        roompost.setRoomNumber(5960);
        roompost.setStatus(false);
        roompost.setDescription("team59 api test otomation");

        response = given().headers(
                "Authorization",
                "Bearer " +generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON
        ).body(roompost).contentType(ContentType.JSON).when().post(ConfigReader.getProperty("room_endpoint"));
    }

    @Then("kullanici olusturulan oda bilgilerini dogrular")
    public void kullaniciOlusturulanOdaBilgileriniDogrular() {
        response.then().assertThat().statusCode(201);

        response.then().assertThat().body("price",equalTo(59))
                .body("roomNumber",equalTo(5960))
                .body("roomType",equalTo("DAYCARE"));
    }

    @Given("kullanici id ile oda bilgileri icin get request yapar")
    public void kullaniciIdIleOdaBilgileriIcinGetRequestYapar() {
        /*
        {
    "createdBy": "admin59",
    "createdDate": "2022-08-25T10:35:37.778648Z",
    "id": 228125,
    "roomNumber": 5910,
    "roomType": "DAYCARE",
    "status": false,
    "price": 59.00,
    "description": "team59 test data for db/api test"
}
         */
        response=given().headers(
                        "Authorization",
                        "Bearer "+ generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .when().get(ConfigReader.getProperty("us016_roomgetendpont"));
        response.then().assertThat().statusCode(200);
        response.prettyPrint();
    }

    @Then("kullanici oda bilgilerini dogrular {string} {string} {string} {string} {string} {string}")
    public void kullaniciOdaBilgileriniDogrular(int roomNumber, String roomType, int price, boolean status, String desc, String createdBy) {
        JsonPath jsonpath=response.jsonPath();
        assertEquals(jsonpath.get("roomNumber"), Optional.of(roomNumber));
        assertEquals(jsonpath.get("roomType"),roomType);
        assertEquals(jsonpath.get("price"), Optional.of(price));
        assertEquals(jsonpath.get("status"),status);
        assertEquals(jsonpath.get("description"),desc);
        assertEquals(jsonpath.get("createdBy"),createdBy);
    }


    @Then("kullanici {int} roomNumber dogrular")
    public void kullaniciRoomNumberDogrular(int roomNumber) {
        JsonPath jsonpath=response.jsonPath();
        assertEquals(Optional.ofNullable(jsonpath.get("roomNumber")), Optional.of(roomNumber));
    }

    @Then("kullanici {string} roomType dogrular")
    public void kullaniciRoomTypeDogrular(String roomType) {
        JsonPath jsonpath=response.jsonPath();
        assertEquals(jsonpath.get("roomType"),roomType);
    }

    @Then("kullanici {int} price dogrular")
    public void kullaniciPriceDogrular(int price) {
        JsonPath jsonpath=response.jsonPath();
        assertEquals(jsonpath.get("price"), Optional.of(price));
    }
}
