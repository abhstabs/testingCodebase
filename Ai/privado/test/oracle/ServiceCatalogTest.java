

    package ai.privado.test.oracle;

    import com.oracle.bmc.servicecatalog.ServiceCatalog;

    public class ServiceCatalogTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ServiceCatalog serviceCatalog = new ServiceCatalog();
            serviceCatalog.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    