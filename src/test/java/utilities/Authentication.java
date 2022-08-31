package utilities;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;
import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
public class Authentication {
    public static String generateToken() {
        String username = "medunnateam62";
        String password = "123Medunna.";

        Map <String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password",password);
        map.put("rememberme","true");

        String endPoint = "https://www.medunna.com/api/authenticate";

        Response response1 = given().contentType(ContentType.JSON).body(map).when().post(endPoint);

        JsonPath token = response1.jsonPath();

        return token.getString("id_token");
    }

    public static String generateToken1(String username,String password) {
        Map <String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("password",password);
        map.put("rememberme","true");
        String endPoint = "https://www.medunna.com/api/authenticate";
        Response response1 = given().contentType(ContentType.JSON).body(map).when().post(endPoint);
        JsonPath token = response1.jsonPath();
        //Map <String,String> map1=response1.as(Map.class)
        //return map1.get("id_token");
        return token.getString("id_token");



    }




    public static String generateToken2(){

        RequestSpecification spec;
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();

        spec.pathParams("first", "api", "second", "authenticate");

        //Set the expected data

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("username", "medunnateam62");
        expectedData.put("password", "123Medunna.");
        expectedData.put("rememberMe","true" );

        //Send the Post request and get the data
        Response response = given().spec(spec).contentType(ContentType.JSON).
                body(expectedData).when().post("/{first}/{second}");

        // response.prettyPrint();
        JsonPath json = response.jsonPath();



        return json.getString("id_token");

    }
}


