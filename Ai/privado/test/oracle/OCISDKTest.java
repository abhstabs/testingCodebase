

    package ai.privado.test.oracle;

    import com.oracle.oci.sdk.OCISDK;

    public class OCISDKTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            OCISDK oCISDK = new OCISDK();
            oCISDK.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    