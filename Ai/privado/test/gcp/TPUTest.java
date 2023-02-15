

    package ai.privado.test.gcp;

    import com.google.cloud.tpu.TPU;

    public class TPUTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            TPU tPU = new TPU();
            tPU.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    