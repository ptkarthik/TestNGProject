package org.example.PropertyCreator;

import org.example.TestConstants;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyCreatorClass {

    public static Properties getConfigProperties() throws IOException {
        FileReader fileReader = new FileReader(new File(TestConstants.
                basePath + "//src//main//resources//browserconfig.txt"));
        configProperties.load(fileReader);
        return configProperties;
    }
    public static Properties configProperties = new Properties();
}
