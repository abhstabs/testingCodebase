

    package ai.privado.test.gcp;

    import com.google.cloud.channel.ChannelServices;

    public class ChannelServicesTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ChannelServices channelServices = new ChannelServices();
            channelServices.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    