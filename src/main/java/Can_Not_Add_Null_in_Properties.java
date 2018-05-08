import java.util.Properties;

/*
 * Add_Null_in_Properties.java
 *
 * Erstellung     : 08.05.2018 / Srivastava
 *
 * Copyright © by GiP mbH
 */

public class Can_Not_Add_Null_in_Properties {
    private static final Object ACI_KEY = "key";

    public static void main(String[] args) {

        Properties properties = new Properties();
        properties.put(ACI_KEY, null);
    }
}
