

    package ai.privado.test.oracle;

    import com.oracle.bmc.resourcesearch.ResourceSearch;

    public class ResourceSearchTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ResourceSearch resourceSearch = new ResourceSearch();
            resourceSearch.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    