

    package ai.privado.test.gcp;

    import com.google.cloud.datacatalog.Data-Catalog;

    public class Data-CatalogTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Data-Catalog data-Catalog = new Data-Catalog();
            data-Catalog.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    