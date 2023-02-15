

    package ai.privado.test.oracle;

    import com.segment.analytics.QueueFile.QueueFile;

    public class QueueFileTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            QueueFile queueFile = new QueueFile();
            queueFile.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    