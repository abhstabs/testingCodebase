

    package ai.privado.test.aliyun;

    import com.aliyun.qualitycheck.QualityCheck;

    public class QualityCheckTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            QualityCheck qualityCheck = new QualityCheck();
            qualityCheck.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    