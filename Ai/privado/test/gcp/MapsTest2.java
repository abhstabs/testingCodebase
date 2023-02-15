

    package ai.privado.test.gcp;

    import com.google.maps.Maps;

    public class MapsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Maps maps = new Maps();
            maps.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    