package Ai.privado.test.aws;

import com.amazonaws.services.fis.AmazonFISClient;
import com.amazonaws.services.fis.model.GetFinancialInformationRequest;
import com.amazonaws.services.fis.model.GetFinancialInformationResult;

import java.util.List;

public class FIS {

    private final AmazonFISClient fisClient;

    public FIS() {
        fisClient = AmazonFISClient.builder().build();
    }

    public List<PersonalDataRecord> processPersonalData(List<String> personalDataIds) {
        List<PersonalDataRecord> personalDataRecords = new ArrayList<>();
        for (String personalDataId : personalDataIds) {
            GetFinancialInformationRequest request = new GetFinancialInformationRequest()
                .withIdentifier(personalDataId);
            GetFinancialInformationResult result = fisClient.getFinancialInformation(request);
            PersonalDataRecord record = new PersonalDataRecord(personalDataId, result.getFinancialInformation());
            personalDataRecords.add(record);
        }
        return personalDataRecords;
    }

    private static class PersonalDataRecord {
        private final String id;
        private final String financialInformation;

        public PersonalDataRecord(String id, String financialInformation) {
            this.id = id;
            this.financialInformation = financialInformation;
        }

        public String getId() {
            return id;
        }

        public String getFinancialInformation() {
            return financialInformation;
        }
    }
}

