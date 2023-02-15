package Ai.privado.test.aws;

import com.amazonaws.services.workdocs.AmazonWorkDocs;
import com.amazonaws.services.workdocs.AmazonWorkDocsClientBuilder;
import com.amazonaws.services.workdocs.model.CreateFolderRequest;
import com.amazonaws.services.workdocs.model.CreateFolderResult;

public class WorkDocs {

    private AmazonWorkDocs workDocsClient;

    public WorkDocs() {
        workDocsClient = AmazonWorkDocsClientBuilder.defaultClient();
    }

    public void processPersonalData(Map<String,String> personalData) {
        // Create a new folder in Amazon WorkDocs to store the personal data
        CreateFolderRequest createFolderRequest = new CreateFolderRequest()
            .withParentFolderId("PARENT_FOLDER_ID")
            .withName("PersonalDataFolder");
        CreateFolderResult createFolderResult = workDocsClient.createFolder(createFolderRequest);
        String personalDataFolderId = createFolderResult.getFolderId();

        // Iterate through the personal data and upload each piece to the created folder
        for (Map.Entry<String, String> entry : personalData.entrySet()) {
            // create a File object for the personal data
            File personalDataFile = new File(entry.getKey());
            // create a request to upload the personal data file
            UploadFileRequest uploadFileRequest = new UploadFileRequest()
                .withFolderId(personalDataFolderId)
                .withFileName(entry.getKey())
                .withFile(personalDataFile);
            workDocsClient.uploadFile(uploadFileRequest);
        }
    }
}

