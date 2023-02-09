import com.amazonaws.services.securitylake.AWSSecurityLake;
import com.amazonaws.services.securitylake.AWSSecurityLakeClientBuilder;
import com.amazonaws.services.securitylake.model.PutDataRequest;
import com.amazonaws.services.securitylake.model.PutDataResult;

public class SecurityLakeDataProcessor {

  private AWSSecurityLake securityLakeClient;

  public SecurityLakeDataProcessor() {
    securityLakeClient = AWSSecurityLakeClientBuilder.defaultClient();
  }

  public void processPersonalData(byte[] personalData) {
    PutDataRequest putDataRequest = new PutDataRequest();
    putDataRequest.setData(ByteBuffer.wrap(personalData));

    PutDataResult putDataResult = securityLakeClient.putData(putDataRequest);
    System.out.println("Data processing result: " + putDataResult.getSucceeded());
  }
}

