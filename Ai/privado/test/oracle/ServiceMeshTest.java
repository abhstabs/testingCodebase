

    package ai.privado.test.oracle;

    import com.oracle.bmc.servicemesh.ServiceMesh;

    public class ServiceMeshTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ServiceMesh serviceMesh = new ServiceMesh();
            serviceMesh.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    