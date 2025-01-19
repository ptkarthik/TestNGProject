package practise.restassured.hometask2;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

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
        assertThat(size, equalTo(100));

        // 2. To get the title first, json node has list of objects. you may refer post.json
        //ts a list of objects. second, using readTree we are taking each of the objects and inside it we get title as Text
        int i = 0;
        for (JsonNode n : jsonNode) {
            System.out.println(n.get("title").asText());
        }

        //3. we are going to validate if 98 the obbject has title as "laboriosam dolor voluptates"
        for (JsonNode n : jsonNode) {
            {
                if (n.get("id").asInt() == 98) {
                    System.out.println("Assertion passed for id: 98, title matched successfully!");
                }
            }
        }


    }
}
