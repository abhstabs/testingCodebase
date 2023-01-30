import com.amazonaws.services.budgets.AWSBudgetsClientBuilder;
import com.amazonaws.services.budgets.model.CreateBudgetRequest;
import com.amazonaws.services.budgets.model.CreateBudgetResult;
import com.amazonaws.services.budgets.model.Notification;
import com.amazonaws.services.budgets.model.Spend;
import java.util.ArrayList;
import java.util.List;

public class BudgetsSample {
  public static void main(String[] args) {
    // Create a Budget
    CreateBudgetRequest createBudgetRequest = new CreateBudgetRequest()
        .withBudget(
            new com.amazonaws.services.budgets.model.Budget()
                .withBudgetName("TestBudget")
                .withBudgetLimit(
                    new Spend().withAmount("100").withUnit("USD"))
                .withCostFilters(
                    new com.amazonaws.services.budgets.model.CostFilters()
                        .withService("AmazonS3"))
                .withCostTypes(
                    new com.amazonaws.services.budgets.model.CostTypes()
                        .withIncludeTax(false)
                        .withIncludeSubscription(true)
                        .withUseBlended(false)));
    List<Notification> notifications = new ArrayList<>();
    notifications.add(
        new Notification()
            .withNotificationType("ACTUAL")
            .withComparisonOperator("GREATER_THAN")
            .withThreshold(80.0)
            .withThresholdType("PERCENTAGE"));
    notifications.add(
        new Notification()
            .withNotificationType("FORECASTED")
            .withComparisonOperator("GREATER_THAN")
            .withThreshold(100.0)
            .withThresholdType("ABSOLUTE_VALUE"));
    createBudgetRequest
        .getBudget()
        .withNotificationsWithSubscribers(
            new com.amazonaws.services.budgets.model.NotificationWithSubscribers()
                .withNotification(notifications));

    AWSBudgetsClientBuilder.defaultClient().createBudget(createBudgetRequest);

    // Process Personal Data
    // TODO: Add logic to process personal data in com.
  }
}

