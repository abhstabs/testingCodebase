

    package ai.privado.test.gcp;

    import com.google.cloud.asset.AssetInventory;

    public class AssetInventoryTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AssetInventory assetInventory = new AssetInventory();
            assetInventory.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    