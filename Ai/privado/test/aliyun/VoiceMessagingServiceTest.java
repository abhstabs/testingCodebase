

    package ai.privado.test.aliyun;

    import com.aliyun.dyvms.VoiceMessagingService;

    public class VoiceMessagingServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            VoiceMessagingService voiceMessagingService = new VoiceMessagingService();
            voiceMessagingService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    