package practise.restassured.hometask2.postendpoint;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class verifyPutforAPostEndpoint {
    @Test
    public void typeCode() throws JsonProcessingException {
        RequestSpecification baseUri = given().baseUri("https://jsonplaceholder.typicode.com");
        PostObjectPojo object = new PostObjectPojo(1, 5, "Karthik is the change",
                "repudiandae veniam quaerat sunt sed\\nalias aut fugiat sit autem sed " +
                        "est\\nvoluptatem omnis " +
                        "possimus esse voluptatibus quis\\nest aut tenetur dolor neque");

        String response = given().spec(baseUri).pathParam("id", 5).
                body(object).when().put("/posts/{id}").then().log().all().extract().response().asString();
System.out.println(response);
//        assertThat(response.jsonPath().getString("title"), equalTo("Karthik is the change"));
    }
}