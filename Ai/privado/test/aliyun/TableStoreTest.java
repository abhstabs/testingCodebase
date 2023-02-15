

    package ai.privado.test.aliyun;

    import com.aliyun.ots.TableStore;

    public class TableStoreTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            TableStore tableStore = new TableStore();
            tableStore.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    