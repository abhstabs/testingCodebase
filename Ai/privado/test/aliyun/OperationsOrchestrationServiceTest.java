

    package ai.privado.test.aliyun;

    import com.aliyun.oos.OperationsOrchestrationService;

    public class OperationsOrchestrationServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            OperationsOrchestrationService operationsOrchestrationService = new OperationsOrchestrationService();
            operationsOrchestrationService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    