

    package ai.privado.test.aliyun;

    import com.aliyun.edas.ElasticContainerServiceForApplication;

    public class ElasticContainerServiceForApplicationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ElasticContainerServiceForApplication elasticContainerServiceForApplication = new ElasticContainerServiceForApplication();
            elasticContainerServiceForApplication.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    