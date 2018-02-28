package ru.track;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

/**
 * TASK:
 * POST request to  https://guarded-mesa-31536.herokuapp.com/track
 * fields: name,github,email
 *
 * LIB: http://unirest.io/java.html
 *
 *
 */
public class App {

    public static final String URL = "http://guarded-mesa-31536.herokuapp.com/track";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_GITHUB = "github";
    public static final String FIELD_EMAIL = "email";

    public static void main(String[] args) throws Exception {
       // 1) Use Unirest.post()
        // 2) Get response .asJson()
        // 3) Get json body and JsonObject
        // 4) Get field "success" from JsonObject
        HttpResponse<JsonNode> a = Unirest.post("https://guarded-mesa-31536.herokuapp.com/track")
                .field("name", "Nosov Elisey")
                .field("github", "https://github.com/JIuCoHbKa/track18-spring")
                .field("email", "en0s@ya.ru")
                .asJson();
        System.out.println(a.getBody().toString());
    }



        boolean success = false;
    }


