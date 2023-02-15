

    package ai.privado.test.aliyun;

    import com.aliyun.datahub.DataHub;

    public class DataHubTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DataHub dataHub = new DataHub();
            dataHub.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    