package j16_제이슨;

import com.google.gson.*;

import java.util.Map;
import java.util.Objects;

public class JSONConvert {

    public static void main(String[] args) {
        /*<<<<< JSON으로 바꾸기 >>>>>*/
        Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

        /*
            private int id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String phone;
    private List<String> hobby;
         */
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", "2022001");
        jsonObject.addProperty("username", "kyungsu");
        jsonObject.addProperty("password", "1234");
        jsonObject.addProperty("email", "mm453@naver.com");
        jsonObject.addProperty("name", "신경수");
        jsonObject.addProperty("phone", "01099414038");

        JsonArray jsonArray = new JsonArray();
        jsonArray.add("축구");
        jsonArray.add("농구");
        jsonArray.add("골프");


        jsonObject.add("hobby", jsonArray);

        String s = gson.toJson(jsonObject);
        System.out.println(s);

        /*<<<<<<< JSON을 JsonObject로 바꾸기 >>>>>>>>*/
        JsonObject jsonObject2 = gson.fromJson(s, JsonObject.class);
        System.out.println(jsonObject2.toString());

        /*<<<<<<< JSON을 User객체로 바꾸기>>>>>>>*/
        User user = gson.fromJson(s, User.class);
        System.out.println(user.toString());

        Map<String, Objects> map = gson.fromJson(s, Map.class);
        System.out.println(map.toString());

        String num = "200";
        System.out.println(Integer.parseInt(num)+100);

        System.out.println("\n\n\n\n\n");
        System.out.println(user);

        String userJson = gson.toJson(user);
        System.out.println(userJson);
    }
}
