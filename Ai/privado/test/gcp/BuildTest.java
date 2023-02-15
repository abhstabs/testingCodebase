

    package ai.privado.test.gcp;

    import com.google.cloud.devtools.cloudbuild.Build;

    public class BuildTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Build build = new Build();
            build.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    