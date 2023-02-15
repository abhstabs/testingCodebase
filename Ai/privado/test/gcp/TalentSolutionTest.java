

    package ai.privado.test.gcp;

    import com.google.cloud.talent.TalentSolution;

    public class TalentSolutionTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            TalentSolution talentSolution = new TalentSolution();
            talentSolution.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    