

    package ai.privado.test.gcp;

    import com.google.cloud.notebooks.VertexAIWorkbench;

    public class VertexAIWorkbenchTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            VertexAIWorkbench vertexAIWorkbench = new VertexAIWorkbench();
            vertexAIWorkbench.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    