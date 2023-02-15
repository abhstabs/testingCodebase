

    package ai.privado.test.gcp;

    import com.google.cloud.scheduler.Scheduler;

    public class SchedulerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Scheduler scheduler = new Scheduler();
            scheduler.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    