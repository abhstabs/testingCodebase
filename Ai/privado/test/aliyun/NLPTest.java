

    package ai.privado.test.aliyun;

    import com.aliyun.alinlp.NLP;

    public class NLPTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            NLP nLP = new NLP();
            nLP.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    