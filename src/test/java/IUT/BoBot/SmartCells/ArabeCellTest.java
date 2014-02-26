package IUT.BoBot.SmartCells;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by p12003701 on 26/02/14.
 */
public class ArabeCellTest {

    ArabeCell cell = new ArabeCell();

    @Test
    public void TestArabeCell() {
        assertEquals("CLVI", cell.decode(156));
    }

}
