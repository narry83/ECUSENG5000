import java.util.Scanner;

public class P02_QuestionDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * P02_Question q1 = new P02_Question(); q1.setQuestion("What is your name");
		 * q1.setAnswer("Narsimha"); q1.printQuestion();
		 * System.out.println("Enter your Answer "); q1.checkAnswer(in.nextLine());
		 * 
		 * P02_Question q2 = new P02_Question(); q2.setQuestion("Where do you live");
		 * q2.setAnswer("Cary"); q2.printQuestion();
		 * System.out.println("Enter your Answer "); q2.checkAnswer(in.nextLine());
		 */
		P02_ChoiceQuestion q3 = new P02_ChoiceQuestion();
		q3.setQuestion("How Old Are you?");
		q3.addChoice("33", false);
		q3.addChoice("34", false);
		q3.addChoice("35", false);
		q3.addChoice("36", true);

		q3.printQuestion();
		System.out.println("Enter your Answer ");
		q3.checkAnswer(in.nextLine());
		while (!q3.getValidAnswer()) {
			System.out.println("Try Again");
			q3.checkAnswer(in.nextLine());
		}

	}

}
