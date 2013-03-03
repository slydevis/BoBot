package IUT.BoBot;


public class Bot 
{

	public String ask(String question) {
		if(question.contains("m'appelle"))
			return "Bonjour " + extractName(question) + "!";
		else
			return "Bonjour!";
	}
	
	private String extractName(String question) {
		String bits[] = question.split("appelle ");
		String name = bits[bits.length - 1];
		
		return name;
	}

}