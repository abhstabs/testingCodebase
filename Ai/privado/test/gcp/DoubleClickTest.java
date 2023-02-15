

    package ai.privado.test.gcp;

    import com.google.doubleclick.DoubleClick;

    public class DoubleClickTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DoubleClick doubleClick = new DoubleClick();
            doubleClick.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    