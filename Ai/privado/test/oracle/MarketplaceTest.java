

    package ai.privado.test.oracle;

    import com.oracle.bmc.marketplace.Marketplace;

    public class MarketplaceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Marketplace marketplace = new Marketplace();
            marketplace.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    