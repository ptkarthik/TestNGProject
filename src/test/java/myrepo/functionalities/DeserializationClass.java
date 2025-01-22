package myrepo.functionalities;

import com.fasterxml.jackson.databind.ObjectMapper;
import myrepo.pojos.RootClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DeserializationClass {
    public static void main(String[] args) throws IOException {
        RootClass actualPojo = readpojoToObjectClass("actual");
        RootClass expectedPojo = readpojoToObjectClass("expected");
        validatePojos(actualPojo, expectedPojo);

        //
        /*by default custom objects , equal will be like
        public bolean equals(Object o) {
         return (this==o);  // meaning
         just check memory address apparently
         bth memory will be different so output will be false;
        }

so, we have to override and provide details
         */
    }

    private static void validatePojos(RootClass actualPojo, RootClass expectedPojo) {
        /*
        all match (actual json first object -->
        expected will go over all and either of the expectations shoould match with actual)
        like Two pointer it checks
         */
        System.out.println("The Get Criterion Validation is " + actualPojo.
                getCriterias().stream().allMatch(actualcriteria -> expectedPojo.getCriterias().
                        stream().anyMatch(expectedCriteria ->
                                expectedCriteria.getCriteria().equals(actualcriteria.getCriteria()))));

        /**
         * now we are planning to go on next Method
         *
         *
         */
        System.out.println(actualPojo.getCriterions().stream().flatMap(listOfCriterions -> listOfCriterions.stream()).
                allMatch(actualcriterions -> expectedPojo.getCriterions().stream().
                        flatMap(expectedListOfCriterions -> expectedListOfCriterions.stream()).
                        anyMatch(expectedCriteria -> expectedCriteria.getValue().equals(actualcriterions.getValue())
                                && expectedCriteria.getDescription().equals(actualcriterions.getDescription())
                                && expectedCriteria.getCriteria().equals(actualcriterions.getCriteria()))));

    }

    private static RootClass readpojoToObjectClass(String type) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue
                (new File(System.getProperty("user.dir") + "//src//test//java//myrepo//json//" +
                                type + ".json"),
                        RootClass.class);
    }
}
