import com.amazonaws.services.mainframemodernization.AmazonMainframeModernizationClient;
import com.amazonaws.services.mainframemodernization.model.MigrateSystemToVirtualMachineRequest;
import com.amazonaws.services.mainframemodernization.model.MigrateSystemToVirtualMachineResult;

import java.util.Map;

public class AWSMainframeModernizationUtil {

public void AWSMainframeModernizationProcessData(String firstName, String lastName, String phoneNumber, String dob) {
    Map<String, String> personalData = Map.of("firstName", firstName, "lastName", lastName, "phoneNumber", phoneNumber, "dob", dob);
    
    AmazonMainframeModernizationClient client = AmazonMainframeModernizationClient.builder().build();
    
    MigrateSystemToVirtualMachineRequest request = new MigrateSystemToVirtualMachineRequest()
            .withInputData(personalData);
    
    MigrateSystemToVirtualMachineResult result = client.migrateSystemToVirtualMachine(request);
    
    System.out.println("Migration result: " + result);
}
}
