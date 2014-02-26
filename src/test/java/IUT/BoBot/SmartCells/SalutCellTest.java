package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Created by p12003701 on 26/02/14.
 */
public class SalutCellTest {

    SalutCell cell = new SalutCell();

    @Test
    public void TestSalutCell() {
        assertEquals("Salut!", cell.ask("Salut"));
    }
}
