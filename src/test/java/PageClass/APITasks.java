package PageClass;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class APITasks {
    @Test
    public void getMethod() {
        String jsonAsString;
        Response ResponseObject;
        ResponseObject = null;
        ResponseObject = given().queryParam("CMC_PRO_API_KEY", "f2289385-e1b3-482f-95c7-4702b8137dc2")
                .contentType("application/json").and()
                .when().get("https://pro-api.coinmarketcap.com/v1/cryptocurrency/map")
                .then().and()
                .log().body()
                .statusCode(200)
                .extract().response();
        //Converting response as String
        jsonAsString = ResponseObject.asString();
        JsonObject jsonObject = new JsonParser().parse(jsonAsString).getAsJsonObject();


        JsonArray arrayObject = jsonObject.getAsJsonArray("data");
        for (int i = 0; i < arrayObject.size(); i++) {
            String taskStatus = arrayObject.get(i).getAsJsonObject().get("symbol").getAsString();
            int idValue = arrayObject.get(i).getAsJsonObject().get("id").getAsInt();

            //System.out.println(taskStatus);
            if(taskStatus.equalsIgnoreCase("BTC") ){
                System.out.println(idValue);
            }
            if(taskStatus.equalsIgnoreCase("USDT") ){
                System.out.println(idValue);
            }
            if(taskStatus.equalsIgnoreCase("ETH") ){
                System.out.println(idValue);
            }
        }

    }
}
