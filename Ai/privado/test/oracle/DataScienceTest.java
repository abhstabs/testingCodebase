

    package ai.privado.test.oracle;

    import com.oracle.bmc.datascience.DataScience;

    public class DataScienceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DataScience dataScience = new DataScience();
            dataScience.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    