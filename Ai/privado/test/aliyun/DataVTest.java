

    package ai.privado.test.aliyun;

    import com.aliyun.datav.DataV;

    public class DataVTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DataV dataV = new DataV();
            dataV.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    