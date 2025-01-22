package myrepo.functionalities;

import com.fasterxml.jackson.databind.ObjectMapper;
import myrepo.pojos.RootClass;

import java.io.File;
import java.io.IOException;

public class DeserializationClass {
    public static void main(String[] args) throws IOException {
        RootClass actualPojo = readpojoToObjectClass("actual");
        RootClass expectedPojo = readpojoToObjectClass("expected");
        validatePojos(actualPojo, expectedPojo);
    }

    private static void validatePojos(RootClass actualPojo, RootClass expectedPojo) {
    }

    private static RootClass readpojoToObjectClass(String type) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue
                (new File(System.getProperty("user.dir") + "//src//test//java//myrepo//json//" +
                                type + ".json"),
                        RootClass.class);
    }
}
