package practise.restassured.hometask3.petstore;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import practise.restassured.hometask3.petstore.pojos.Category;
import practise.restassured.hometask3.petstore.pojos.PojoForPet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class DoAPestUsingPoost {
    @Test
    public void createAPet() {
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        RequestSpecification initialData = requestSpecBuilder.setBaseUri("https://petstore.swagger.io").
                addPathParam("version", "v2").
                addPathParam("petType", "pet").
                addHeader("Content-Type", "application/json").build();
        //create an object for category
        Category category = new Category(0, "string");

        //create a list Of Category
        List<Category> listOfCategory = new ArrayList<>();
        listOfCategory.add(category);


        //create an Object for PojoPet
        PojoForPet pojoForPet = new PojoForPet(0, category,
                "doggie", Arrays.asList("string"), listOfCategory, "available");

        Response response = given().spec(initialData).body(pojoForPet).log().all().when().
                post("/{version}/{petType}").then().log().all().extract().response();
    }
}
