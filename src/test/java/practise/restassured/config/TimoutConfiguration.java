package practise.restassured.config;

import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TimoutConfiguration {
    @Test
    public void config() {
        RequestSpecification baseUri = given().baseUri("https://jsonplaceholder.typicode.com").
                header("Content-Type", "application/json");
        RestAssuredConfig restAssuredConfig = RestAssuredConfig.config().httpClient(HttpClientConfig.httpClientConfig().
                setParam("http.connection.timeout", 2000)
                .setParam("http.socket.timeout", 2000));

        //above will fail if program takes more than 2000


    }
}
