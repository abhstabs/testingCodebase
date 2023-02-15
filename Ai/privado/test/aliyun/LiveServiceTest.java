

    package ai.privado.test.aliyun;

    import com.aliyun.live.LiveService;

    public class LiveServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            LiveService liveService = new LiveService();
            liveService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    