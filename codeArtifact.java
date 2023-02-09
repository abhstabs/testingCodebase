import com.amazonaws.services.codeartifact.CodeArtifactClientBuilder;
import com.amazonaws.services.codeartifact.model.PutPackageRequest;
import com.amazonaws.services.codeartifact.model.PutPackageResult;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class CodeArtifactSink {

    public static void main(String[] args) {
        // Build CodeArtifact client
        CodeArtifactClientBuilder builder = CodeArtifactClientBuilder.standard();
        builder.setRegion("us-west-2");
        com.amazonaws.services.codeartifact.CodeArtifact client = builder.build();

        // Prepare the package file
        File packageFile = new File("/path/to/package.jar");

        // Prepare the package metadata
        Map<String, String> packageMetadata = new HashMap<>();
        packageMetadata.put("PersonalData", "false");

        // Put the package to CodeArtifact repository
        PutPackageRequest putPackageRequest = new PutPackageRequest();
        putPackageRequest.setDomain("my-domain");
        putPackageRequest.setRepository("my-repository");
        putPackageRequest.setFormat("maven");
        putPackageRequest.setPackage("package-name");
        putPackageRequest.setMetadata(packageMetadata);
        putPackageRequest.setPackageFile(packageFile);

        PutPackageResult putPackageResult = client.putPackage(putPackageRequest);
        System.out.println("Package version: " + putPackageResult.getVersion());
    }
}
