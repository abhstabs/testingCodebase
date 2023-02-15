package Ai.privado.test.aws;

import com.amazonaws.services.codecommit.AmazonCodeCommitClientBuilder;
import com.amazonaws.services.codecommit.model.PutFileRequest;
import com.amazonaws.services.codecommit.model.PutFileResult;

public class CodeCommit {

    public static void AWSCodeCommitFirstNameFlow(String repositoryName, String branchName, String filePath, 
                                                   String firstName, String lastName, String phoneNumber, String dob) {

        AmazonCodeCommitClientBuilder clientBuilder = AmazonCodeCommitClientBuilder.standard();
        AmazonCodeCommit codecommit = clientBuilder.build();

        String content = "First Name: " + firstName + "\nLast Name: " + lastName + 
                         "\nPhone Number: " + phoneNumber + "\nDate of Birth: " + dob;

        PutFileRequest request = new PutFileRequest()
                .withRepositoryName(repositoryName)
                .withBranchName(branchName)
                .withFilePath(filePath)
                .withFileContent(ByteBuffer.wrap(content.getBytes()));

        PutFileResult result = codecommit.putFile(request);
    }
}

