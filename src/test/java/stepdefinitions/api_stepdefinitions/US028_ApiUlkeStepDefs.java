package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utilities.Authentication;
import static io.restassured.RestAssured.given;

public class US028_ApiUlkeStepDefs {

    Response response;

    @Given("kullanici ulke bilgilerini API olarak okur {string}")
    public void kullaniciUlkeBilgileriniAPIOlarakOkur(String url) {
        response = given().headers("Authorization", "Bearer " + Authentication.generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(url).then().extract().response();
        response.prettyPrint();
    }
    @Given("kulanici API ile ulke olusturur {string} {string} {string}")
    public void kulaniciAPIIleUlkeOlusturur(String url, String type, String country) {
        response = given().headers("Authorization", "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).when().
                body("{\"" + type + "\":\"" + country + "\"}")
                .post(url).then().contentType(ContentType.JSON)
                .extract().response();
    }
    @Given("kullanici ulke ismini duzenler {string} {string} {string}")
    public void kullaniciUlkeIsminiDuzenler(String endpoint, String id, String name) {
        response = given().headers("Authorization", "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).when().
                body("{\"id\": " + id + ",\"name\": \"" + name + "\"}")
                .put(endpoint).then().contentType(ContentType.JSON)
                .extract().response();
    }
    @Given("kullanici ulke ismini siler {string} {string}")
    public void kullaniciUlkeIsminiSiler(String endpoint, String id) {
        response = given().headers("Authorization", "Bearer " + Authentication.generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).when()
                .delete(endpoint + id).then().extract().response();
    }
}
