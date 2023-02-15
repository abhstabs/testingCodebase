

    package ai.privado.test.aliyun;

    import com.aliyun.addresspurification.AddressPurification;

    public class AddressPurificationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AddressPurification addressPurification = new AddressPurification();
            addressPurification.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    