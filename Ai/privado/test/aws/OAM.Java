package Ai.privado.test.aws;

import com.amazonaws.services.oam.AWSOAM;
import com.amazonaws.services.oam.model.CreateUserRequest;
import com.amazonaws.services.oam.model.CreateUserResult;

public class OAM {

  private final AWSOAM oamClient;

  public OAM(AWSOAM oamClient) {
    this.oamClient = oamClient;
  }

  public CreateUserResult AWSOAMFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
    CreateUserRequest request = new CreateUserRequest()
      .withFirstName(firstName)
      .withLastName(lastName)
      .withPhoneNumber(phoneNumber)
      .withDateOfBirth(dob);
    return oamClient.createUser(request);
  }
}

