

    package ai.privado.test.gcp;

    import com.google.cloud.vision.Vision;

    public class VisionTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Vision vision = new Vision();
            vision.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    