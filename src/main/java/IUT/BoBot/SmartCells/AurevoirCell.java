package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

/**
 * Created by guillaume on 26/02/14.
 */
public class AurevoirCell implements SmartCell {

    public String ask(String question)
    {
        if(question.contains("au revoir")) return "au revoir";
        else return null;
    }
    
}
