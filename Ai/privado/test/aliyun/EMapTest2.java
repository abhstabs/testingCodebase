

    package ai.privado.test.aliyun;

    import com.aliyun.emr.EMap;

    public class EMapTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            EMap eMap = new EMap();
            eMap.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    