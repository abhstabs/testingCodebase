

    package ai.privado.test.oracle;

    import com.oracle.bmc.announcementsservice.AnnouncementsService;

    public class AnnouncementsServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AnnouncementsService announcementsService = new AnnouncementsService();
            announcementsService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    