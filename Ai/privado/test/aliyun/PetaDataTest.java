

    package ai.privado.test.aliyun;

    import com.aliyun.petadata.PetaData;

    public class PetaDataTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            PetaData petaData = new PetaData();
            petaData.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    