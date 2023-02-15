

    package ai.privado.test.gcp;

    import com.google.cloud.lifesciences.LifeSciences;

    public class LifeSciencesTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            LifeSciences lifeSciences = new LifeSciences();
            lifeSciences.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    