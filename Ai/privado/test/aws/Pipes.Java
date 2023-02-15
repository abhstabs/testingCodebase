package Ai.privado.test.aws;

import com.amazonaws.services.pipes.AmazonPipe;
import com.amazonaws.services.pipes.AmazonPipeClientBuilder;
import com.amazonaws.services.pipes.model.*;

import java.util.ArrayList;
import java.util.List;

public class Pipes {
    public static void processPersonalData(String firstName, String lastName, String phoneNumber, String dob) {
      AmazonPipe client = AmazonPipeClientBuilder.standard().build();

      DataSource personalDataSource = new DataSource();
      personalDataSource.setName("Personal Data");
      personalDataSource.setDescription("Contains personal data of individuals");

      List<DataSource.Field> fields = new ArrayList<>();
      DataSource.Field firstNameField = new DataSource.Field();
      firstNameField.setName("firstName");
      firstNameField.setType("string");
      fields.add(firstNameField);

      DataSource.Field lastNameField = new DataSource.Field();
      lastNameField.setName("lastName");
      lastNameField.setType("string");
      fields.add(lastNameField);

      DataSource.Field phoneNumberField = new DataSource.Field();
      phoneNumberField.setName("phoneNumber");
      phoneNumberField.setType("string");
      fields.add(phoneNumberField);

      DataSource.Field dobField = new DataSource.Field();
      dobField.setName("dob");
      dobField.setType("string");
      fields.add(dobField);

      personalDataSource.setFields(fields);

      try {
          CreateDataSourceResult createDataSourceResult = client.createDataSource(new CreateDataSourceRequest()
            .withDataSource(personalDataSource));

          String dataSourceArn = createDataSourceResult.getDataSourceArn();

          UpdateDataSourceResult updateDataSourceResult = client.updateDataSource(new UpdateDataSourceRequest().withDataSourceArn(dataSourceArn).withDataSource(personalDataSource));

          System.out.println("Successfully processed personal data using AWS Pipes, Data Source Arn: " + updateDataSourceResult.getDataSourceArn());
      } catch (Exception e) {
          System.err.println(e.getMessage());
      }
    }
}
