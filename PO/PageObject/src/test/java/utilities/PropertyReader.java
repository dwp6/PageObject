package utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    public static final String projectPath = System.getProperty("user.dir");
    public static String filepath = "/src/test/resources/config.properties";
    public static Properties property = new Properties();
    InputStream f;

    public PropertyReader() throws IOException {
        f = new FileInputStream(projectPath + filepath);
        property.load(f);
    }

    public String getProperty(String propertyName) {

        return property.getProperty(propertyName).toString();
    }
}

