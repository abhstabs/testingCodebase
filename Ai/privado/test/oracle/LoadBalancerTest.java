

    package ai.privado.test.oracle;

    import com.oracle.bmc.loadbalancer.LoadBalancer;

    public class LoadBalancerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            LoadBalancer loadBalancer = new LoadBalancer();
            loadBalancer.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    