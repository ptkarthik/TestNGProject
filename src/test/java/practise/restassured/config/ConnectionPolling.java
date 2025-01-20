package practise.restassured.config;

import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ConnectionPolling {
    @Test
    public void config() {
        RequestSpecification baseUri = given().baseUri("https://jsonplaceholder.typicode.com").
                header("Content-Type", "application/json");
        RestAssuredConfig restConfig = RestAssuredConfig.config().httpClient(HttpClientConfig.httpClientConfig().reuseHttpClientInstance()
                .setParam("http.conn-manager.max-total", 50) // Max total connections
                .setParam("http.conn-manager.max-per-route", 10));

    }
}