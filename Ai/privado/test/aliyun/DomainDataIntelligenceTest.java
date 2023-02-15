

    package ai.privado.test.aliyun;

    import com.aliyun.ddi.DomainDataIntelligence;

    public class DomainDataIntelligenceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DomainDataIntelligence domainDataIntelligence = new DomainDataIntelligence();
            domainDataIntelligence.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    