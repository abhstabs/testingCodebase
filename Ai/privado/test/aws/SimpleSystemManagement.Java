package Ai.privado.test.aws;

import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagement;
import com.amazonaws.services.simplesystemsmanagement.AWSSimpleSystemsManagementClientBuilder;
import com.amazonaws.services.simplesystemsmanagement.model.PutParameterRequest;

public class SimpleSystemManagement {
  public static void AWSSSMFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
    AWSSimpleSystemsManagement ssmClient = AWSSimpleSystemsManagementClientBuilder.defaultClient();
    String parameterName = "/personalData/firstName";
    PutParameterRequest request = new PutParameterRequest().withName(parameterName).withValue(firstName).withType("String");
    ssmClient.putParameter(request);
    
    parameterName = "/personalData/lastName";
    request = new PutParameterRequest().withName(parameterName).withValue(lastName).withType("String");
    ssmClient.putParameter(request);
    
    parameterName = "/personalData/phoneNumber";
    request = new PutParameterRequest().withName(parameterName).withValue(phoneNumber).withType("String");
    ssmClient.putParameter(request);
    
    parameterName = "/personalData/dob";
    request = new PutParameterRequest().withName(parameterName).withValue(dob).withType("String");
    ssmClient.putParameter(request);
    
    System.out.println("Personal data saved successfully to SSM parameter store");
  }
}

