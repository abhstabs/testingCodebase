

    package ai.privado.test.oracle;

    import com.adobe.experiencecloud.ExperienceCloud;

    public class ExperienceCloudTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ExperienceCloud experienceCloud = new ExperienceCloud();
            experienceCloud.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    