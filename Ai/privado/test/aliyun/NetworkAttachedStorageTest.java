

    package ai.privado.test.aliyun;

    import com.aliyun.nas.NetworkAttachedStorage;

    public class NetworkAttachedStorageTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            NetworkAttachedStorage networkAttachedStorage = new NetworkAttachedStorage();
            networkAttachedStorage.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    