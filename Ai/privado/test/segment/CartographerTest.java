

    package ai.privado.test.oracle;

    import com.segment.analytics.Cartographer.Cartographer;

    public class CartographerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Cartographer cartographer = new Cartographer();
            cartographer.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    