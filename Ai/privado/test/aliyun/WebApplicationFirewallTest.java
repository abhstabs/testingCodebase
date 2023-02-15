

    package ai.privado.test.aliyun;

    import com.aliyun.waf.WebApplicationFirewall;

    public class WebApplicationFirewallTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            WebApplicationFirewall webApplicationFirewall = new WebApplicationFirewall();
            webApplicationFirewall.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    