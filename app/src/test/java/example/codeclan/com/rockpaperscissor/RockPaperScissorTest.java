package example.codeclan.com.rockpaperscissor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andy Guppy on 18/01/2017.
 */
public class RockPaperScissorTest {

    RockPaperScissor rps = new RockPaperScissor();
    String player;
    String computer;

    @Before
    public void setUp() {
        player = "rock";
        computer = "paper";
        rps.setPlayer(player);
        rps.setComputer(computer);
    }

    @Test
    public void canRockPaperScissor() {
        assertNotNull(rps);
    }

    @Test
    public void canGetPlayer() {
        rps.setPlayer(player);
        assertEquals("rock", rps.getPlayer());
    }

    @Test
    public void canGetComputer() {
        rps.setComputer(computer);
        assertEquals("paper", rps.getComputer());
    }

    @Test
    public void canGetWinner() {
        assertEquals("Player with - rock loses to computer with - paper", rps.checkForWinner());
    }

    @Test
    public void canGetDraw() {
        computer = "rock";
        rps.setComputer(computer);
        assertEquals("Draw of two rocks", rps.checkForWinner());
    }

    @Test
    public void testRandomComputer() {
        assertNotNull(rps.getRandomComputer());
    }
}