

    package ai.privado.test.gcp;

    import com.google.cloud.memcache.MemorystoreForMemcache;

    public class MemorystoreForMemcacheTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MemorystoreForMemcache memorystoreForMemcache = new MemorystoreForMemcache();
            memorystoreForMemcache.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    