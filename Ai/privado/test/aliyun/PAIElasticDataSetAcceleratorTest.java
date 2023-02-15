

    package ai.privado.test.aliyun;

    import com.aliyun.paielasticdatasetaccelerator.PAIElasticDataSetAccelerator;

    public class PAIElasticDataSetAcceleratorTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            PAIElasticDataSetAccelerator pAIElasticDataSetAccelerator = new PAIElasticDataSetAccelerator();
            pAIElasticDataSetAccelerator.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    