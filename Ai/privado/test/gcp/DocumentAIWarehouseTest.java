

    package ai.privado.test.gcp;

    import com.google.cloud.contentwarehouse.DocumentAIWarehouse;

    public class DocumentAIWarehouseTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DocumentAIWarehouse documentAIWarehouse = new DocumentAIWarehouse();
            documentAIWarehouse.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    