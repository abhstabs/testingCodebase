

    package ai.privado.test.aliyun;

    import com.aliyun.pvtz.PublicAndPrivateZone;

    public class PublicAndPrivateZoneTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            PublicAndPrivateZone publicAndPrivateZone = new PublicAndPrivateZone();
            publicAndPrivateZone.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    