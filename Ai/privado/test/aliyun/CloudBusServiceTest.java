package ai.privado.test.aliyun;

import com.aliyun.csb.CloudBusService;

public class CloudBusServiceTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        CloudBusService cloudBusService = new CloudBusService();
        cloudBusService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
