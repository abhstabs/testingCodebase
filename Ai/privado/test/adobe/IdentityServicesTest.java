

    package ai.privado.test.oracle;

    import com.adobe.marketing.mobile.identity.IdentityServices;

    public class IdentityServicesTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            IdentityServices identityServices = new IdentityServices();
            identityServices.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    