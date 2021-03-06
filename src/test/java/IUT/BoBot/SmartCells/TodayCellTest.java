package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class TodayCellTest {
	
	// Tests should not depend on the current date.
	// So initialize the TodayCell with a fixed date.
	Calendar calendar = Calendar.getInstance();
	TodayCell cell = new TodayCell(calendar);
	
	@Before
	public void setUp() {
		calendar.set(2013, 1, 8);
	}
	
	@Test
	public void testToday() {
		assertEquals("Vendredi 8 Février", cell.ask("Quel jour est-il?"));
	}
	
	@Test
	public void testNotToday() {
		assertEquals(null, cell.ask("Quel ours jette-il?"));
	}

}
