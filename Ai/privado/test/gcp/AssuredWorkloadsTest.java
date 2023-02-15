

    package ai.privado.test.gcp;

    import com.google.cloud.assuredworkloads.AssuredWorkloads;

    public class AssuredWorkloadsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AssuredWorkloads assuredWorkloads = new AssuredWorkloads();
            assuredWorkloads.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    