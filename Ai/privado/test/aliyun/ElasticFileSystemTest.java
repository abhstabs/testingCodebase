

    package ai.privado.test.aliyun;

    import com.aliyun.efs.ElasticFileSystem;

    public class ElasticFileSystemTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ElasticFileSystem elasticFileSystem = new ElasticFileSystem();
            elasticFileSystem.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    