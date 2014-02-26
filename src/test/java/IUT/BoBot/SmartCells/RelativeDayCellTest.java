package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by guillaume on 26/02/14.
 */
public class RelativeDayCellTest {

    // Tests should not depend on the current date.
    // So initialize the TodayCell with a fixed date.
    Calendar calendar = Calendar.getInstance();
    RelativeDayCell cell = new RelativeDayCell(calendar);

        @Before
        public void setUp() {
            calendar.set(2013, 1, 8);
        }

        @Test
        public void testHier() {
            assertEquals("Jeudi 7 Février 2013", cell.ask("Quel jour étions-nous hier?"));
        }

        @Test
        public void testHier2() {
            this.cell.setCalendar(2014,0,1);
            assertEquals("Mardi 31 Décembre 2013", cell.ask("Quel jour étions-nous hier?"));
        }

        @Test
        public void testHier3() {
            this.cell.setCalendar(2014,2,1);
            assertEquals("Vendredi 28 Février 2014", cell.ask("Quel jour étions-nous hier?"));
        }

        @Test
        public void testHier4() {
            this.cell.setCalendar(2000,2,1);
            assertEquals("Mardi 29 Février 2000", cell.ask("Quel jour étions-nous hier?"));
        }
    }