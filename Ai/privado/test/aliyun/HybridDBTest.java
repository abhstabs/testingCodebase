

    package ai.privado.test.aliyun;

    import com.aliyun.hdr.HybridDB;

    public class HybridDBTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            HybridDB hybridDB = new HybridDB();
            hybridDB.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    