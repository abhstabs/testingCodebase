

    package ai.privado.test.aliyun;

    import com.aliyun.tablestore.CloudTableStore;

    public class CloudTableStoreTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudTableStore cloudTableStore = new CloudTableStore();
            cloudTableStore.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    