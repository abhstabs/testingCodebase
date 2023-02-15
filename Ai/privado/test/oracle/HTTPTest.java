

    package ai.privado.test.oracle;

    import com.oracle.bmc.http.HTTP;

    public class HTTPTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            HTTP hTTP = new HTTP();
            hTTP.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    