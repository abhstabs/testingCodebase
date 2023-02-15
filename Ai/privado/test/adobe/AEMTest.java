

    package ai.privado.test.oracle;

    import com.adobe.aem.AEM;

    public class AEMTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AEM aEM = new AEM();
            aEM.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    