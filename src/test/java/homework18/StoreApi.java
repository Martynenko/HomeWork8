package homework18;

import com.google.gson.Gson;
import netscape.javascript.JSObject;
import okhttp3.*;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class StoreApi {
    //    private static RequestBody requestBody;
    private static Request request;
    private static OkHttpClient client;
    private static Response response;
    private static String baseUrl = "https://petstore.swagger.io/v2";

    public static void getInventory() throws IOException {
        String url = baseUrl + "/store/inventory/";
        request = new Request.Builder()
                .header("Content-Type", "aplication/json")
                .url(url)
                .build();
        client = new OkHttpClient();
        Call call = client.newCall(request);
        response = call.execute();
        System.out.println(response.code());
        System.out.println("responce " + response.body().string());
    }

    public static void createNewOrder() throws IOException {
        String date = LocalDateTime.now().toString();

//        String body = "{\n" +
//                "  \"id\": 0,\n" +
//                "  \"petId\": 0,\n" +
//                "  \"quantity\": 0,\n" +
//                "  \"shipDate\": \"2021-09-27T18:17:24.102Z\",\n" +
//                "  \"status\": \"placed\",\n" +
//                "  \"complete\": true\n" +
//                "}";
//        requestBody = RequestBody.create(body.getBytes(StandardCharsets.UTF_8));

//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("id", 0);
//        jsonObject.put("petId", 0);
//        jsonObject.put("quantity", 0);
//        jsonObject.put("shipDate", date);
//        jsonObject.put("status", "placed");
//        jsonObject.put("complete", true);
//        System.out.println(jsonObject.toString());


        Order order = new Order();
        order.setId(0);
        order.setPetId(0);
        order.setQuantity(0);
        order.setShipDate(date);
        order.setStatus("placed");
        order.setComplete(true);

        String jsonObject = new Gson().toJson(order);
        System.out.println("request " + jsonObject);

        RequestBody requestBody = RequestBody.create(jsonObject.toString().getBytes(StandardCharsets.UTF_8));

        Request request = new Request.Builder()
                .header("Content-Type", "aplication/json")
                .post(requestBody)
                .url(baseUrl + "/store/order")
                .build();
        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);
        Response response = call.execute();
        System.out.println(response.code());
        System.out.println("responce " + response.body().string());
    }

    public static String getPurchaseById(int orderId) throws IOException {
        String url = baseUrl + "/store/order/" + orderId;
        request = new Request.Builder()
                .header("Content-Type", "aplication/json")
                .url(url)
                .build();
        client = new OkHttpClient();
        Call call = client.newCall(request);
        response = call.execute();
        return response.body().string();
    }

    public static String deleteOrderById(int orderId) throws IOException {
        String url = baseUrl + orderId;
        request = new Request.Builder()
                .header("Content-Type", "aplication/json")
                .delete()
                .url(url)
                .build();
        client = new OkHttpClient();
        Call call = client.newCall(request);
        response = call.execute();
        return response.body().string();
    }
}
