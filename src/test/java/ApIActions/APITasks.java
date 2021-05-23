package ApIActions;

import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class APITasks extends APIMethods {
    @Test
    public void verifyThatCurrenciesAreConvertedToBolivian() {
        String jsonAsString;
        Response ResponseObject;
        ResponseObject = null;
        ResponseObject = given().queryParam("CMC_PRO_API_KEY", "f2289385-e1b3-482f-95c7-4702b8137dc2")
                .contentType("application/json").and()
                .when().get("https://pro-api.coinmarketcap.com/v1/cryptocurrency/map")
                .then().and().log().body()
                .statusCode(200).extract().response();
        //Converting response as String
        List<Integer> ids=getIDFromResponse(ResponseObject);

        for(int id:ids){
            Response res=given().queryParam("CMC_PRO_API_KEY", "f2289385-e1b3-482f-95c7-4702b8137dc2")
            .queryParam( "convert_id", id).queryParam("amount",11)
            .queryParam("id", 2832)
            .contentType("application/json").when().get("https://pro-api.coinmarketcap.com/v1/tools/price-conversion")
            .then().and().statusCode(200).extract().response();
            System.out.println(res.toString());
        }
    }



}
