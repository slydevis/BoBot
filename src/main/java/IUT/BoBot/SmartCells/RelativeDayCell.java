package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

import java.util.Calendar;

public class RelativeDayCell implements SmartCell{
    Calendar calendar;

    /**
     * Initialize the cell with the date of today.
     */
    public RelativeDayCell() {
        this.calendar = Calendar.getInstance();
    }

    public RelativeDayCell(Calendar calendar) {
        this.calendar = calendar;
    }
    public boolean isBisec(int year)
    {
        return (((year & 3) == 0) && ((year % 100 != 0) || (year % 400 == 0)));
    }

    public String ask(String question) {
        if(question.contains("hier"))
        {
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            int getmouth = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int year = calendar.get(Calendar.YEAR);

            if(getmouth == 0 && day == 1) year--;

            if(day == 1)
            {
                if(getmouth!=0) getmouth--;
                else getmouth = 11;
                day=maxday[getmouth];
                if(day == 29)
                {
                    if(isBisec(year)) day=29;
                    else day=28;
                }
            }
            else day--;

            return weekDays[dayOfWeek - 2] + " " + day + " " + mouth[getmouth] + " " + year;
        }
        return null;
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

    private int[] maxday = new int[] {
            31,29,31,30,31,30,31,31,30,31,30,31
    };

    public void setCalendar(int year, int mouth, int day)
    {
        this.calendar.set(year, mouth, day);
    }
}
