package practise.restassured.hometask2.postendpoint;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class VerifyDeleteForPostEndpoint {
    @Test
    public void typeCode() throws JsonProcessingException {
        RequestSpecification baseUri = given().baseUri("https://jsonplaceholder.typicode.com").
                header("Content-Type", "application/json");


        Response response = given().spec(baseUri).pathParam("id", 5).
                when().delete("/posts/{id}").then().log().all().extract().response();

        assertThat(response.statusCode(), equalTo(200));
    }
}
