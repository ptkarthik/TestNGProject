package practise.restassured.hometask2.postendpoint;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class VerifyPostForAPostEndpoint {
    @Test
    public void typeCode() throws JsonProcessingException {
        RequestSpecification baseUri = given().baseUri("https://jsonplaceholder.typicode.com").
                header("Content-Type", "application/json");
        PostObjectPojo object = new PostObjectPojo(1, 101, "Karthik is the change",
                "new request");
        Response response = given().spec(baseUri).
                body(object).when().post("/posts/").then().log().all().extract().response();
        assertThat(response.jsonPath().getInt("id"), equalTo(101));
        assertThat(response.statusCode(), equalTo(201));
        assertThat(response.jsonPath().getString("body"), equalTo("new request"));
        assertThat(response.jsonPath().getString("title"), equalTo("Karthik is the change"));
    }
}
