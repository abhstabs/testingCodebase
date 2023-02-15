

    package ai.privado.test.gcp;

    import com.google.devtools.cloudprofiler.Profiler;

    public class ProfilerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Profiler profiler = new Profiler();
            profiler.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    