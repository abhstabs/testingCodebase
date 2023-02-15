

    package ai.privado.test.gcp;

    import com.google.identity.accesscontextmanager.AccessContextManager;

    public class AccessContextManagerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AccessContextManager accessContextManager = new AccessContextManager();
            accessContextManager.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    