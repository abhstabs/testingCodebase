package Ai.privado.test.aws;

import com.amazonaws.services.securitylake.AWSSecurityLake;
import com.amazonaws.services.securitylake.AWSSecurityLakeClientBuilder;
import com.amazonaws.services.securitylake.model.PutDataRequest;
import com.amazonaws.services.securitylake.model.PutDataResult;

public class SecurityLake {

  private AWSSecurityLake securityLakeClient;

  public SecurityLake() {
    securityLakeClient = AWSSecurityLakeClientBuilder.defaultClient();
  }

  public void processPersonalData(byte[] personalData) {
    PutDataRequest putDataRequest = new PutDataRequest();
    putDataRequest.setData(ByteBuffer.wrap(personalData));

    PutDataResult putDataResult = securityLakeClient.putData(putDataRequest);
    System.out.println("Data processing result: " + putDataResult.getSucceeded());
  }
}

