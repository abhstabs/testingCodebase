

    package ai.privado.test.oracle;

    import com.oracle.bmc.circuitbreaker.CircuitBreaker;

    public class CircuitBreakerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CircuitBreaker circuitBreaker = new CircuitBreaker();
            circuitBreaker.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    