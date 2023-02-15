

    package ai.privado.test.aliyun;

    import com.aliyun.sae.SimpleApplicationEngine;

    public class SimpleApplicationEngineTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            SimpleApplicationEngine simpleApplicationEngine = new SimpleApplicationEngine();
            simpleApplicationEngine.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    