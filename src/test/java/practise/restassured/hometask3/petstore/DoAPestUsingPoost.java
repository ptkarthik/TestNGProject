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
                addPathParam("petType", "pet").
                addPathParam("version", "v2").
                addHeader("Content-Type", "application/json").build();
        //create an object for category
        Category category = new Category(0, "string");

        //create a list Of Category
        List<Category> listOfCategory = new ArrayList<>();
        listOfCategory.add(category);


        //create an Object for PojoPet
        PojoForPet pojoForPet = new PojoForPet(0, category,
                "Karthik's Dog", Arrays.asList("string"), listOfCategory, "available");

        //getting post response
        Response response = given().spec(initialData).body(pojoForPet).log().all().when().
                post("/{version}/{petType}").then().log().all().extract().response();

        //using the response we receive we get the id and pass that back as get request
        RequestSpecification latterData = requestSpecBuilder.setBaseUri("https://petstore.swagger.io").
                addPathParam("petType", "pet").
                addPathParam("version", "v2").
                addPathParam("petID", response.jsonPath().get("id")).build();
        given().spec(latterData).when().get("/{version}/{petType}/{petID}").then().log().all();


    }


}
