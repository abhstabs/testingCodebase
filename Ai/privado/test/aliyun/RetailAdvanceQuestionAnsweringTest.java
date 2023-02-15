

    package ai.privado.test.aliyun;

    import com.aliyun.retailadvqa.RetailAdvanceQuestionAnswering;

    public class RetailAdvanceQuestionAnsweringTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            RetailAdvanceQuestionAnswering retailAdvanceQuestionAnswering = new RetailAdvanceQuestionAnswering();
            retailAdvanceQuestionAnswering.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    