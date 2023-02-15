

    package ai.privado.test.aliyun;

    import com.aliyun.vpc.VPC;

    public class VPCTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            VPC vPC = new VPC();
            vPC.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    