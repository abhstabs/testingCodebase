package Ai.privado.test.aws;

import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow;
import com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflowClientBuilder;
import com.amazonaws.services.simpleworkflow.model.DecisionTask;
import com.amazonaws.services.simpleworkflow.model.PollForDecisionTaskRequest;

public class SimpleWorkFlow {

    private AmazonSimpleWorkflow swf;
    private String domain;

    public SimpleWorkFlow(String domain) {
        this.domain = domain;
        swf = AmazonSimpleWorkflowClientBuilder.defaultClient();
    }

    public void processPersonalData() {
        while (true) {
            PollForDecisionTaskRequest decisionTaskRequest = new PollForDecisionTaskRequest()
                .withDomain(domain)
                .withTaskList(new TaskList().withName("personal-data-tasks"));

            DecisionTask decisionTask = swf.pollForDecisionTask(decisionTaskRequest);

            // process decision task and personal data here
            // ...

            // send task completion or failure to SWF
            // ...
        }
    }
}

