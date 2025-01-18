package practise.restassured.hometask2;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class VerifyTypeCode {
    /*
    Task

2. For each type of resource
	a. Get a specific resource data (6 marks)
		i. verify the response code
		ii. Verify the response body
	b. Modify a specific resource data (6 marks)
		i. verify the response code
		ii. Verify the response body
	c. Delete a specific resource (6 marks)
		i. verify the response code
		ii. Verify the response body
	d. Create your own resource (6 marks)
		i. verify the response code
		ii. Verify the response body

     */
    @Test
    public void typeCode() throws JsonProcessingException {
        RequestSpecification baseUri = given().baseUri("https://jsonplaceholder.typicode.com");
//1. Verify the number of resources at each resource end point (6 marks)
        //resource at post
        Response response = given().spec(baseUri).when().get("/posts").then().extract().response();
        //approach1:
        int size = response.jsonPath().getList("$").size();
        System.out.println(size);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(response.asString());
        assertThat(size,equalTo(100));

    }
}
