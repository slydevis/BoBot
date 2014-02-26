package IUT.BoBot.SmartCells;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by p12003701 on 26/02/14.
 */
public class RomanCellTest {

    RomanCell cell = new RomanCell();

    @Test
    public void TestRomanCell() {
        assertEquals(32,cell.decode("XXXII"));
    }

    @Test(expected = ArithmeticException.class)
    public void TestNotRoman() {
        assertEquals(45,cell.decode("aaa"));
    }
}
