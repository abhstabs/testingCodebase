

    package ai.privado.test.aliyun;

    import com.aliyun.alikafka.AliKafka;

    public class AliKafkaTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AliKafka aliKafka = new AliKafka();
            aliKafka.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    