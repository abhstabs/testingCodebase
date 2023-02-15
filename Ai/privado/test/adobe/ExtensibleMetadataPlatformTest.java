

    package ai.privado.test.oracle;

    import com.adobe.xmp.ExtensibleMetadataPlatform;

    public class ExtensibleMetadataPlatformTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ExtensibleMetadataPlatform extensibleMetadataPlatform = new ExtensibleMetadataPlatform();
            extensibleMetadataPlatform.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    