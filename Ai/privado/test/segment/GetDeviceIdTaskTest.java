

    package ai.privado.test.oracle;

    import com.segment.analytics.GetDeviceIdTask.GetDeviceIdTask;

    public class GetDeviceIdTaskTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            GetDeviceIdTask getDeviceIdTask = new GetDeviceIdTask();
            getDeviceIdTask.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    