

    package ai.privado.test.oracle;

    import com.adobe.flex.Flex;

    public class FlexTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Flex flex = new Flex();
            flex.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    