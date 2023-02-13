package ai.privado.test.aws;

import com.amazonaws.services.workspaces.AmazonWorkspaces;
import com.amazonaws.services.workspaces.AmazonWorkspacesClientBuilder;
import com.amazonaws.services.workspaces.model.*;

import java.util.ArrayList;
import java.util.List;

public class Workspaces {

  public static void AWSWorkspacesFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
    AmazonWorkspaces workspacesClient = AmazonWorkspacesClientBuilder.defaultClient();

    DescribeWorkspacesRequest request = new DescribeWorkspacesRequest().withLimit(1);
    DescribeWorkspacesResult result = workspacesClient.describeWorkspaces(request);
    List<Workspace> workspaces = result.getWorkspaces();
    if (workspaces.isEmpty()) {
      System.out.println("No workspaces found.");
      return;
    }

    Workspace workspace = workspaces.get(0);
    String workspaceId = workspace.getWorkspaceId();

    List<Tag> tags = new ArrayList<>();
    tags.add(new Tag().withKey("firstName").withValue(firstName));
    tags.add(new Tag().withKey("lastName").withValue(lastName));
    tags.add(new Tag().withKey("phoneNumber").withValue(phoneNumber));
    tags.add(new Tag().withKey("dob").withValue(dob));

    TagWorkspaceRequest tagWorkspaceRequest = new TagWorkspaceRequest().withResourceId(workspaceId).withTags(tags);
    workspacesClient.tagWorkspace(tagWorkspaceRequest);

    System.out.println("Personal data saved successfully to workspace with ID: " + workspaceId);
  }

}

