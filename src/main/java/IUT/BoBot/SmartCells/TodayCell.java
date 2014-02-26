package IUT.BoBot.SmartCells;

import java.util.Calendar;

import IUT.BoBot.SmartCell;

/**
 * Reply to "Quel jour est-il?"
 *
 */
public class TodayCell implements SmartCell {
	
	Calendar calendar;

	/**
	 * Initialize the cell with the date of today.
	 */
	public TodayCell() {
		this.calendar = Calendar.getInstance();
	}
	
	/**
	 * Initialize the cell with the date passed in.
	 */
	public TodayCell(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public String ask(String question) {
		if(!question.contains("Quel jour"))
			return null;
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int getmouth = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
		return weekDays[dayOfWeek - 1] + " " + day + " " + mouth[getmouth];
	}
	
	private String[] weekDays = new String[] { 
			"Dimanche", "Lundi", "Mardi", "Mercredi",
			"Jeudi", "Vendredi", "Samedi" 
			};

    private String[] mouth = new String[] {
            "Janvier", "Février", "Mars", "Avril",
            "Mai", "Juin", "Juillet", "Août", "Septembre",
            "Octobre", "Novembre", "Décembre"
    };
}
