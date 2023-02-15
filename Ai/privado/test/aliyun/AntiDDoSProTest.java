

    package ai.privado.test.aliyun;

    import com.aliyun.antiddospublic.AntiDDoSPro;

    public class AntiDDoSProTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AntiDDoSPro antiDDoSPro = new AntiDDoSPro();
            antiDDoSPro.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    