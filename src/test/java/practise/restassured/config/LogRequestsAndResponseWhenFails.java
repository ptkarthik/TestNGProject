package practise.restassured.config;

import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LogRequestsAndResponseWhenFails {

    @Test
    public void config() {
        RequestSpecification baseUri = given().baseUri("https://jsonplaceholder.typicode.com").
                header("Content-Type", "application/json");
        RestAssuredConfig restConfig = RestAssuredConfig.config().
                logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails());

        given().spec(baseUri).config(restConfig).when().get("/posts/1").then().body("title",
                equalTo("Karthik"));

    }

}


