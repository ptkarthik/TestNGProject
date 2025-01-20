package practise.restassured.config;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ValidateCookiesAndHeaders {
    @Test
    public void config() {
        Map<String, String> cookies = new HashMap<>();
        cookies.put("cookie1", "dasfsdfds");
        cookies.put("cookie2", "lkdsjfsldkfj");
        cookies.put("cookie3", "lksdjfoopiddsf");
        RequestSpecification baseUri = given().baseUri("https://httpbin.org/").
                header("Content-Type", "application/json").cookies(cookies);

        Response r = given().spec(baseUri).get("cookies/set").then().extract().response();
//basically cookies are not coming soo we are getting emplyt map

        Map<String, String> cookiesFrmResponse = r.cookies();
        for (Map.Entry<String, String> c : cookiesFrmResponse.entrySet()) {
            System.out.println("The Data is " + c.getKey() + "   " + c.getValue());
        }
    }
}
