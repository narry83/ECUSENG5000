import java.util.ArrayList;

public class P02_ChoiceQuestion extends P02_Question{
	
	private ArrayList<String> answerChoice;
		

	public P02_ChoiceQuestion() {
		answerChoice = new ArrayList<String>();
	}	

	public void addChoice(String choice, Boolean correct) {
		answerChoice.add(choice);
		if (correct) {
			setAnswer(choice);
		}
		
	}
	/*
	public void checkAnswer(String input) {
		if (input.equals(getAnswer())) {
			System.out.println("Correct Answer ");
		}
	}

	public void printQuestion() {
		System.out.println(getQuestion());
	}
	*/
}
