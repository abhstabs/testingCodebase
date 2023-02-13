package ai.privado.test.aws;

import com.amazonaws.services.gamesparks.AWSGamesparks;
import com.amazonaws.services.gamesparks.AWSGamesparksClientBuilder;
import com.amazonaws.services.gamesparks.model.GetPlayerRequest;
import com.amazonaws.services.gamesparks.model.GetPlayerResult;

import java.util.Map;

public class Gamesparks {

    private final AWSGamesparks gamesparksClient;

    public Gamesparks() {
        this.gamesparksClient = AWSGamesparksClientBuilder.defaultClient();
    }

    public Map<String, String> processPersonalData(String playerId) {
        GetPlayerRequest playerRequest = new GetPlayerRequest().withPlayerId(playerId);
        GetPlayerResult playerResult = gamesparksClient.getPlayer(playerRequest);

        return playerResult.getPlayer().getData();
    }
}

