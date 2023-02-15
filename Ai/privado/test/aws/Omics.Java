package Ai.privado.test.aws;

import com.amazonaws.services.omics.AWSOmics;
import com.amazonaws.services.omics.AWSOmicsClientBuilder;
import com.amazonaws.services.omics.model.*;

import java.util.List;

public class Omics {
    public static void main(String[] args) {
        AWSOmicsClientBuilder builder = AWSOmicsClientBuilder.standard();
        AWSOmics omicsClient = builder.build();

        String sampleId = "sample1";
        GetSampleRequest sampleRequest = new GetSampleRequest().withSampleId(sampleId);
        GetSampleResult sampleResult = omicsClient.getSample(sampleRequest);

        String sampleData = sampleResult.getSample().getData();

        List<Variant> variants = omicsClient.listVariants(new ListVariantsRequest().withSampleId(sampleId)).getVariants();
        for (Variant variant : variants) {
            String variantId = variant.getVariantId();
            GetVariantRequest variantRequest = new GetVariantRequest().withVariantId(variantId);
            GetVariantResult variantResult = omicsClient.getVariant(variantRequest);
            String variantData = variantResult.getVariant().getData();
            // process variant data
        }

        // process sample data
    }
}

