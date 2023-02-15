

    package ai.privado.test.oracle;

    import com.adobe.acrobat.Acrobat;

    public class AcrobatTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Acrobat acrobat = new Acrobat();
            acrobat.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    