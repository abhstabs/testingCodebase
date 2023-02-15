

    package ai.privado.test.aliyun;

    import com.aliyun.alimt.MachineTranslation;

    public class MachineTranslationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MachineTranslation machineTranslation = new MachineTranslation();
            machineTranslation.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    