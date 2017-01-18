package example.codeclan.com.rockpaperscissor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.*;

/**
 * Created by Andy Guppy on 18/01/2017.
 */

public class RockPaperScissorActivity extends AppCompatActivity {

    TextView winnerText;
    Button rockButton;
    Button paperButton;
    Button scissorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winnerText = (TextView)findViewById(R.id.winner_text);
        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorButton = (Button)findViewById(R.id.scissor_button);
    }

    public void onRockButtonClicked(View button) {

        Log.d(getClass().toString(), "Rock was Clicked");

        RockPaperScissor rps = new RockPaperScissor();
        String computer = rps.getRandomComputer();
        rps.setComputer(computer);
        String player = "rock";
        rps.setPlayer(player);

        String result = "";
        result = rps.checkForWinner();
        winnerText.setText(result);

    }

    public void onPaperButtonClicked(View button) {

        Log.d(getClass().toString(), "Paper was Clicked");

        RockPaperScissor rps = new RockPaperScissor();
        String computer = rps.getRandomComputer();
        rps.setComputer(computer);
        String player = "paper";
        rps.setPlayer(player);

        String result = "";
        result = rps.checkForWinner();
        winnerText.setText(result);

    }

    public void onScissorButtonClicked(View button) {

        Log.d(getClass().toString(), "Scissor was Clicked");

        RockPaperScissor rps = new RockPaperScissor();
        String computer = rps.getRandomComputer();
        rps.setComputer(computer);
        String player = "scissor";
        rps.setPlayer(player);

        String result = "";
        result = rps.checkForWinner();
        winnerText.setText(result);

    }
}
