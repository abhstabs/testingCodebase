

    package ai.privado.test.aliyun;

    import com.aliyun.tdsr.TableStoreDataSourceReader;

    public class TableStoreDataSourceReaderTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            TableStoreDataSourceReader tableStoreDataSourceReader = new TableStoreDataSourceReader();
            tableStoreDataSourceReader.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    