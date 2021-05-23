package ApIActions;

import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class APITasks extends APIMethods {
    @Test
    public void verifyThatCurrenciesAreConvertedToBolivian() {
        Response result=null;
        String jsonAsString;
        Response ResponseObject;
        ResponseObject = null;
        ResponseObject = given().queryParam("CMC_PRO_API_KEY", Constant.API_KEY)
                .contentType(Constant.content)
                .when().get(Constant.BASEURL+Constant.MAPPATH).then()
                .statusCode(200).extract().response();
        List<Integer> ids=getIDFromResponse(ResponseObject);
        for(int id:ids){
            result=given().queryParam("CMC_PRO_API_KEY", Constant.API_KEY)
            .queryParam( "convert_id", id).queryParam("amount",11).queryParam("id", 2832)
            .contentType("application/json").when().get(Constant.BASEURL+Constant.CONVERSIONPATH)
            .then().and().log().body().statusCode(200).extract().response();
        }    }
}
