

    package ai.privado.test.oracle;

    import com.oracle.bmc.waiter.Waiter;

    public class WaiterTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Waiter waiter = new Waiter();
            waiter.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    