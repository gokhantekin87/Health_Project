package stepdefinitions.api_stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US028_ApiSehirStepDefs {

    RequestSpecification spec;
    Response response;

    @Given("kullanici sehir olusturmak icin parametre ayarlar")
    public void kullanici_sehir_olusturmak_icin_parametre_ayarlar() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api", "second", "c-states", "third", "initial");
    }
    @Given("kullanici gerekli datalari girer ve sehir olusturur")
    public void kullanici_gerekli_datalari_girer_ve_sehir_olusturur() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("first", "api", "second", "c-states", "third", "initial");

        Map<String,Object> country = new HashMap<>();
        Map<String,Object> state = new HashMap<>();
        country.put("name","Turkiye");
        country.put("id", 224245);
        state.put("name","Kutahya");
        state.put("country", country);
        Object[] data = {state};

        response = given().spec(spec).headers("Authorization", "Bearer " + generateToken(),
                        "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                body(data).
                when().post("/{first}/{second}/{third}");
        response.prettyPrint();
    }


}
