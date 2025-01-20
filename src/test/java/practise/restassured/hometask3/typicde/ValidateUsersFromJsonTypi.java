package practise.restassured.hometask3.typicde;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import practise.restassured.hometask3.typicde.pojos.UserDetails;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ValidateUsersFromJsonTypi {
    /*
    task - 2:(test data might be already present)
https://jsonplaceholder.typicode.com/users
GET call
Validate the below from API response:

That the status code is equal to ‘200’
That there more than ‘3’ users in the list
That one of the users has a name of “Ervin Howell”
     */
    @Test
    public void validateUser() throws JsonProcessingException {
        RequestSpecification requestSpecBuilder = new RequestSpecBuilder().
                setBaseUri("https://jsonplaceholder.typicode.com")
                .addHeader("Content-Type", "application/json")
                .addPathParam("data", "users").build();

        Response response = given().spec(requestSpecBuilder).when().get("/{data}").then().extract().response();

        //to deserialize, actully we have the reponse, so pojos has been created
        // and nw we will deserialize it to classes frm json response

        ObjectMapper objectMapper = new ObjectMapper();
        List<UserDetails> rootClass = objectMapper.readValue(response.asString(), objectMapper.getTypeFactory().
                constructCollectionType(List.class, UserDetails.class));
        UserDetails userDetails = rootClass.get(0);
        System.out.println(userDetails.toString());
    }
}
