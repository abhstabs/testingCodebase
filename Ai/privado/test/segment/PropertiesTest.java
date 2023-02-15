

    package ai.privado.test.oracle;

    import com.segment.analytics.Properties.Properties;

    public class PropertiesTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Properties properties = new Properties();
            properties.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    