package IUT.BoBot.SmartCells;

import org.junit.Test;
import static org.junit.Assert.*;

public class AurevoirCellTest {

    AurevoirCell cell = new AurevoirCell();

    @Test
    public void testAurevoir() throws Exception {
        assertEquals("au revoir", cell.ask("au revoir"));
    }

    @Test
    public void testNotAurevoir() throws Exception {
        assertEquals(null, cell.ask("A la prochaine"));
    }

}
