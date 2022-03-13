import HW15.StoneScissorsPaper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneScissorsPaperTest {

    @Test
    void winOrLose() {
        StoneScissorsPaper sc = new StoneScissorsPaper();
        int answer = sc.winOrLose("T");
        assertEquals(-100, answer);
    }


    @Test
   public void check() {
        StoneScissorsPaper sc = new StoneScissorsPaper();
        boolean answer = sc.check(2.5);
        assertEquals(false,answer);
        boolean answer1 = sc.check(4);
        assertEquals(true, answer1);
    }



    @Test
    void winner() {
        StoneScissorsPaper sc = new StoneScissorsPaper();
        int answer = sc.winner(10,5,5);
        assertEquals(0,answer);
        int answer1 = sc.winner(10,4,6);
        assertEquals(-1,answer1);
    }
}