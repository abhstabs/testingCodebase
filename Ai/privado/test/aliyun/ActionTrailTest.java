

    package ai.privado.test.aliyun;

    import com.aliyun.actiontrail.ActionTrail;

    public class ActionTrailTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ActionTrail actionTrail = new ActionTrail();
            actionTrail.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    