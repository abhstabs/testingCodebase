

    package ai.privado.test.aliyun;

    import com.aliyun.premiumpics.PremiumPics;

    public class PremiumPicsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            PremiumPics premiumPics = new PremiumPics();
            premiumPics.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    