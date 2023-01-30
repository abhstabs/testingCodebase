import com.amazonaws.services.codebuild.AmazonCodeBuild;
import com.amazonaws.services.codebuild.AmazonCodeBuildClientBuilder;
import com.amazonaws.services.codebuild.model.StartBuildRequest;
import com.amazonaws.services.codebuild.model.Build;

public class PersonalDataProcessor {

    private static final String PROJECT_NAME = "personal-data-project";

    public static void main(String[] args) {
        AmazonCodeBuild codeBuildClient = AmazonCodeBuildClientBuilder.defaultClient();

        StartBuildRequest startBuildRequest = new StartBuildRequest()
                .withProjectName(PROJECT_NAME);

        Build build = codeBuildClient.startBuild(startBuildRequest).getBuild();

        System.out.println("Build Id: " + build.getId());
        System.out.println("Build status: " + build.getBuildStatus());
    }
}

