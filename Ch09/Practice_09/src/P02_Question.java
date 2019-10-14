
public class P02_Question {

	private String questionToAsk;
	private String correctAnswer;
	private Boolean validAnswer=false;

	public P02_Question() {

	}

	public void setQuestion(String question) {
		questionToAsk = question;
	}
	
	public String getQuestion() {
		return questionToAsk;
	}
	
	public Boolean getValidAnswer() {
		return validAnswer;
	}

	public void setAnswer(String answer) {
		correctAnswer = answer;
	}
	
	public String getAnswer() {
		return correctAnswer;
	}

	public void checkAnswer(String input) {
		if (input.equals(getAnswer())) {
			System.out.println("Correct Answer ");
			validAnswer=true;
			}
		else System.out.println("InCorrect Answer ");
		}
	

	public void printQuestion() {
		System.out.println(getQuestion());
	}

}
