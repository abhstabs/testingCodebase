

    package ai.privado.test.aliyun;

    import com.aliyun.hbr.HybridBackupRecovery;

    public class HybridBackupRecoveryTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            HybridBackupRecovery hybridBackupRecovery = new HybridBackupRecovery();
            hybridBackupRecovery.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    