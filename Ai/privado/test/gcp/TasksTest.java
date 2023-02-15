

    package ai.privado.test.gcp;

    import com.google.cloud.tasks.Tasks;

    public class TasksTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Tasks tasks = new Tasks();
            tasks.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    