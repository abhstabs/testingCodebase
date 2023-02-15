

    package ai.privado.test.oracle;

    import com.atlassian.bitbucket.server.BitbucketServer;

    public class BitbucketServerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            BitbucketServer bitbucketServer = new BitbucketServer();
            bitbucketServer.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    