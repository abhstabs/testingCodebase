

    package ai.privado.test.oracle;

    import com.oracle.bmc.filestorage.FileStorage;

    public class FileStorageTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            FileStorage fileStorage = new FileStorage();
            fileStorage.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    