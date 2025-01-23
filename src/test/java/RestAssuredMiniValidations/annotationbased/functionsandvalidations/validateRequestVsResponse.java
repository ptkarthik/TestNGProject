package RestAssuredMiniValidations.annotationbased.functionsandvalidations;

import RestAssuredMiniValidations.annotationbased.pojos.request.Address;
import RestAssuredMiniValidations.annotationbased.pojos.request.Contacts;
import RestAssuredMiniValidations.annotationbased.pojos.request.Preferences;
import RestAssuredMiniValidations.annotationbased.pojos.request.RootClass;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class validateRequestVsResponse {
    @Test
    public void testValidation() throws JsonProcessingException {
        Contacts contacts = new Contacts("jane.doe@example.com",
                Arrays.asList("+1-123-456-7890", "+1-987-654-3210"));
        Address address1 = new Address("Home", "123 Main St",
                "Springfield", "IL", "62701", "USA");
        Address address2 = new Address("Work", "456 Elm St",
                "Chicago", "IL", "60601", "USA");
        Preferences prefernces = new Preferences(true, "Email", "English");
        RootClass rootClass = new RootClass("USR12345", "Jane Doe", "janedoe",
                "Secure@123", contacts, Arrays.asList(address1, address2), "1990-05-20",
                Arrays.asList("Java", "Selenium", "API Testing"), prefernces);

        Response response = given().baseUri("https://c761f9df-990d-403a-b11a-f8d9ef8c14d8.mock.pstmn.io")
                .body(rootClass).when().post("/post").then().extract().response();

        ObjectMapper objectMapper = new ObjectMapper();
        Response responsePojo = objectMapper.readValue(response.asString(), Response.class);

        //validation of request vs response


    }
}
