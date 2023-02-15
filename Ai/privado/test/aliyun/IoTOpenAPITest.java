

    package ai.privado.test.aliyun;

    import com.aliyun.dyiotapi.IoTOpenAPI;

    public class IoTOpenAPITest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            IoTOpenAPI ioTOpenAPI = new IoTOpenAPI();
            ioTOpenAPI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    