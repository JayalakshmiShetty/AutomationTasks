package ApIActions;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

public class APIMethods {

    public List<Integer> getIDFromResponse(Response ResponseObject) {
        String jsonAsString;
        List<Integer> list = new ArrayList<>();
        jsonAsString = ResponseObject.asString();
        JsonObject jsonObject = new JsonParser().parse(jsonAsString).getAsJsonObject();
        JsonArray arrayObject = jsonObject.getAsJsonArray("data");
        for (int i = 0; i < arrayObject.size(); i++) {
            String taskStatus = arrayObject.get(i).getAsJsonObject().get("symbol").getAsString();
            int idValue = arrayObject.get(i).getAsJsonObject().get("id").getAsInt();
            //System.out.println(taskStatus);
            if (taskStatus.equalsIgnoreCase("BTC") || taskStatus.equalsIgnoreCase("USDT") || taskStatus.equalsIgnoreCase("ETH")) {
                list.add(idValue);
            }
        }
        System.out.println(list);
        return list;
    }
}