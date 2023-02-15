

    package ai.privado.test.oracle;

    import com.hashicorp.consul.Consul;

    public class ConsulTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Consul consul = new Consul();
            consul.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    