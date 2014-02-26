package IUT.BoBot.SmartCells;

/**
 * Created by p12003701 on 26/02/14.
 */
public class SalutCell {

    public String ask(String question) {
        if (question.contains("Salut"))
            return "Salut!";
        else return null;
    }
}
