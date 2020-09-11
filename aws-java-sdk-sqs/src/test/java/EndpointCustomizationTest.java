import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import org.junit.Test;

public class EndpointCustomizationTest {
    @Test
    public void syncEndpointCustomizationTest() {
//        AwsClientBuilder.EndpointConfiguration endpointConfiguration = new AwsClientBuilder.EndpointConfiguration(
//            "https://vpce-0ab61fe684cccb125-us-west-2a.sqs.us-west-2.vpce.amazonaws.com/",
//            Regions.US_WEST_2.getName()
//        );

        AmazonSQS sqsClient = AmazonSQSClientBuilder.standard()
                                                    .withRegion(Regions.US_WEST_2)
                                                    //                                                    .withEndpointConfiguration(endpointConfiguration)
                                                    .build();

        SendMessageRequest sendMessageRequest = new SendMessageRequest()
//            .withQueueUrl("https://vpce-0ab61fe684cccb125-us-west-2a.sqs.us-west-2.vpce.amazonaws.com/684094081154/zhouqua-testSQS")
            .withQueueUrl("https://sqs.us-west-2.amazonaws.com/684094081154/zhouqua-testSQS")
            .withMessageBody("Hello");
        SendMessageResult result = sqsClient.sendMessage(sendMessageRequest);
    }
}
