package Ai.privado.test.aws;

import com.amazonaws.services.cleanrooms.*;

public class CleanRooms {
   private AmazonCleanRoomsClient cleanRoomsClient;
   private String dataSource;

   public CleanRooms(String dataSource) {
      this.cleanRoomsClient = AmazonCleanRoomsClientBuilder.defaultClient();
      this.dataSource = dataSource;
   }

   public void processData() {
      CleanRoomRequest request = new CleanRoomRequest().withSourceData(dataSource);
      CleanRoomResponse response = cleanRoomsClient.cleanRoom(request);
      String processedData = response.getCleanedData();

      // Use processed data as needed
      // ...
   }
}

