

    package ai.privado.test.oracle;

    import com.adobe.creativecloud.CreativeCloud;

    public class CreativeCloudTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CreativeCloud creativeCloud = new CreativeCloud();
            creativeCloud.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    