package example.codeclan.com.rockpaperscissor;

import java.util.Random;

/**
 * Created by Andy Guppy on 18/01/2017.
 */

public class RockPaperScissor {

    private String player;
    private String computer;
    private String[] options;

    public RockPaperScissor() {

        this.player = player;
        this.computer = computer;
        this.options = new String[3];
        setArray();
    }

    public void setArray() {
        options[0] = "rock";
        options[1] = "paper";
        options[2] = "scissor";
    }

    public String getPlayer() {
        return this.player;
    }

    public String getComputer() {
        return this.computer;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String checkForWinner() {
        String result = "";
        if (player == computer) {
            result = "Draw of two " + player+"s";
        }
        else if((player == "rock" && computer == "scissor")
                ||
                (player == "paper" && computer == "rock")
                ||
                (player == "scissor" && computer == "paper")) {
            result = "Player with - " + player + " beats computer with - " + computer;
        }
        else if((computer == "rock" && player == "scissor")
                ||
                (computer == "paper" && player == "rock")
                ||
                (computer == "scissor" && player == "paper")) {
            result = "Player with - " + player + " loses to computer with - " + computer;
        }
        return result;
    }

    public String getRandomComputer() {
        Random rand = new Random();
        int randomChoice = rand.nextInt(3);
        String computerChoice = options[randomChoice];
        return computerChoice;
    }

}
