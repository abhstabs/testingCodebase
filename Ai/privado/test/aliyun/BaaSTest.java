

    package ai.privado.test.aliyun;

    import com.aliyun.baas.BaaS;

    public class BaaSTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            BaaS baaS = new BaaS();
            baaS.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    