package practise.restassured.config;

import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SSLConfigClass {
    @Test
    public void config() {
        RequestSpecification baseUri = given().baseUri("https://jsonplaceholder.typicode.com").
                header("Content-Type", "application/json");

        RestAssuredConfig config = RestAssuredConfig.config().
                sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
        given().config(config);
    }
}
