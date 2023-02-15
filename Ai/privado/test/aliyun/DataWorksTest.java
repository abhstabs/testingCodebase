

    package ai.privado.test.aliyun;

    import com.aliyun.dataworks.DataWorks;

    public class DataWorksTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DataWorks dataWorks = new DataWorks();
            dataWorks.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    