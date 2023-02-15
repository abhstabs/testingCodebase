package Ai.privado.test.aws;

import com.amazonaws.services.mwaa.MWAA;
import com.amazonaws.services.mwaa.MWAAClientBuilder;
import com.amazonaws.services.mwaa.model.*;

import java.util.ArrayList;
import java.util.List;

public class MWAA {
  private MWAA mwaaClient;
  private String mwaaEnvironmentName = "personalDataEnvironment";

  public MWAA() {
    mwaaClient = MWAAClientBuilder.defaultClient();
  }

  public void processPersonalData(List<PersonalDataRecord> personalDataRecords) {
    List<CreateEnvironmentInput> createEnvironmentInputs = new ArrayList<>();
    for (PersonalDataRecord personalDataRecord : personalDataRecords) {
      CreateEnvironmentInput createEnvironmentInput = new CreateEnvironmentInput()
          .withName(mwaaEnvironmentName)
          .withExecutionRoleArn(personalDataRecord.getExecutionRoleArn())
          .withDagS3Path(personalDataRecord.getDagS3Path());

      createEnvironmentInputs.add(createEnvironmentInput);
    }

    mwaaClient.createEnvironments(createEnvironmentInputs);
  }
}

class PersonalDataRecord {
  private String executionRoleArn;
  private String dagS3Path;

  public PersonalDataRecord(String executionRoleArn, String dagS3Path) {
    this.executionRoleArn = executionRoleArn;
    this.dagS3Path = dagS3Path;
  }

  public String getExecutionRoleArn() {
    return executionRoleArn;
  }

  public String getDagS3Path() {
    return dagS3Path;
  }
}

