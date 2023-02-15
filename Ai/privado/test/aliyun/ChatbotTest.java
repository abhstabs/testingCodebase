

    package ai.privado.test.aliyun;

    import com.aliyun.chatbot.Chatbot;

    public class ChatbotTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Chatbot chatbot = new Chatbot();
            chatbot.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    