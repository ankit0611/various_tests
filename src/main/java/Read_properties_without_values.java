import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * Erstellung: 26.11.2018 / Srivastava
 * Copyright by GiP mbH
 */

public class Read_properties_without_values {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Properties props = new Properties();
        props.load(Read_properties_without_values.class.getClassLoader()
                .getResourceAsStream("properties_without_values.properties"));

        System.out.println(props);

    }

}
