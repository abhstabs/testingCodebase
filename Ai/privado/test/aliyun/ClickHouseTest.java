

    package ai.privado.test.aliyun;

    import com.aliyun.clickhouse.ClickHouse;

    public class ClickHouseTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ClickHouse clickHouse = new ClickHouse();
            clickHouse.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    