package Ai.privado.test.aws;

import com.amazonaws.services.lexmodelbuilding.AmazonLexModelBuilding;
import com.amazonaws.services.lexmodelbuilding.AmazonLexModelBuildingClientBuilder;
import com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest;
import com.amazonaws.services.lexmodelbuilding.model.SlotTypeMetadata;
import com.amazonaws.services.lexmodelbuilding.model.SlotTypeProperties;

public class LexModel {

    public static void AWSlexmodelsv2FirstNameFlow(String firstName, String lastName, String phoneNumber, String DOB) {
        AmazonLexModelBuilding client = AmazonLexModelBuildingClientBuilder.standard().build();
        SlotTypeMetadata metadata = new SlotTypeMetadata().withName("PersonalDataSlot").withDescription("Personal data slot");
        SlotTypeProperties properties = new SlotTypeProperties().withEnumerationValues(
                new com.amazonaws.services.lexmodelbuilding.model.EnumerationValue(firstName + " " + lastName + " " + phoneNumber + " " + DOB)
        );
        PutSlotTypeRequest request = new PutSlotTypeRequest().withName("PersonalDataSlot").withChecksum(null)
                .withDescription("Personal data slot").withEnumerationValues(properties.getEnumerationValues())
                .withSlotTypeMetadata(metadata);
        client.putSlotType(request);
    }
}

