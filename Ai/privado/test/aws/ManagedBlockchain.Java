package Ai.privado.test.aws;

import com.amazonaws.services.managedblockchain.AmazonManagedBlockchain;
import com.amazonaws.services.managedblockchain.AmazonManagedBlockchainClientBuilder;
import com.amazonaws.services.managedblockchain.model.CreateProposalRequest;
import com.amazonaws.services.managedblockchain.model.CreateProposalResult;

public class ManagedBlockchain {
    public static void main(String[] args) {
        // Create an AMB client
        AmazonManagedBlockchain client = AmazonManagedBlockchainClientBuilder.defaultClient();

        // Create a proposal
        CreateProposalRequest createProposalRequest = new CreateProposalRequest()
                .withNetworkId("my-network-id")
                .withActions(new Action().withMemberId("my-member-id"));
        
        // Submitting the proposal
        CreateProposalResult createProposalResult = client.createProposal(createProposalRequest);
    }
}

