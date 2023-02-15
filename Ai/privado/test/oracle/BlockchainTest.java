

    package ai.privado.test.oracle;

    import com.oracle.bmc.blockchain.Blockchain;

    public class BlockchainTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Blockchain blockchain = new Blockchain();
            blockchain.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    