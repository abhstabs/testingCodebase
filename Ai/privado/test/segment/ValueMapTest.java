

    package ai.privado.test.oracle;

    import com.segment.analytics.ValueMap.ValueMap;

    public class ValueMapTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ValueMap valueMap = new ValueMap();
            valueMap.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    